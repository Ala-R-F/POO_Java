import static java.lang.Math.*;

public class Lutador {
    private String nome;
    private int idade;
    private double peso;
    
    public Lutador (String nome, int idade, double peso){
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
    }
    
    public int getIdade(){
        return idade;
    }
    public double getPeso(){
        return peso;
    }
    public String getNome(){
        return nome;
    }
    
    public String toString(){
        return (nome + "/" + idade + "/" + peso);
    }
    
    public String categoriaLutador(){
        if (peso <= 65){
            return "Peso pena";
        }
        else if (peso <= 83.9){
            return "Peso medio";
        }
        else if (peso <= 93){
            return "Meio pesado";
        }
        else if (peso <= 120.2){
            return "Peso pesado";
        }
        else{
            return "N/A";
        }
    }
    
    public Lutador[] filtroCategoria(Lutador[] b){
        int[] lugares = new int[b.length];
        int atualLu = 0;
        String a = this.categoriaLutador();
        
        for (int i = 0; i < b.length; i++){
            Lutador y = b[i];
            if ((y.categoriaLutador()).equals(a) && !(this.equals(y))){
                lugares[atualLu] = i;
                atualLu++;
            }
        }
        Lutador[] listaCerta = new Lutador[atualLu];
        for (int i = 0; i < atualLu; i++){
            listaCerta[i] = b[lugares[i]];
        }
        return listaCerta;
    }
    
    public void posLutas(Lutador[] x){
        String a = this.categoriaLutador();
        if (a.equals("N/A")){
            System.out.println("O peso desse lutador não é compatível com as categorias.");
        }
        else{
            x = this.filtroCategoria(x);
            for (int i = 0; i < x.length; i++){
                System.out.println(x[i]);
            }
        }
    }
    
    public Lutador sorteioLutas(Lutador[] x){
        x = this.filtroCategoria(x);
        int y = (int) Math.floor(Math.random() * x.length);
        return x[y];
    }
    
}
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Vamos adicionar um lutador!\n\nNome:");
	    String nome = sc.nextLine();
	    System.out.println("\nIdade:");
	    int idade = sc.nextInt();
	    System.out.println("\nPeso:");
	    double peso = sc.nextDouble();
	    
	    Lutador lut = new Lutador(nome, idade, peso); 
		
		Lutador[] lista = new Lutador[10];
		lista[0] = new Lutador("Neto Cardio", 32, 77);
		lista[1] = new Lutador("Chun lee", 23, 60);
		lista[2] = lut;
		lista[3] = new Lutador("Capo Torres", 34, 72);
		lista[4] = new Lutador("Mario da Graça", 42, 94.5);
		lista[5] = new Lutador("Giovanni Hugo", 40, 84.1);
		lista[6] = new Lutador("Anderson Pereira", 45, 78);
		lista[7] = new Lutador("Matilda Tavares", 28, 90.4);
		lista[8] = new Lutador("Hilderson Silva", 39, 101.3);
		lista[9] = new Lutador("Mayara Garcia", 30, 59.9);
		
		System.out.println("Escolha um lutador de acordo com o número:");
		for (int i = 0; i < lista.length; i++){
		    System.out.println("[" + i + "] " + lista[i]);
		}
		
		lut = lista[sc.nextInt()];
		System.out.println("\nVocê escolheu:\n" + lut + "\n");
		
		
		System.out.println("Possiveis lutas:");
		lut.posLutas(lista);

		System.out.println("\n\nSorteio: " + lut.sorteioLutas(lista));
		
	}
}

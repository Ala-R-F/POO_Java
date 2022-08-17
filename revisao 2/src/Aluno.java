
public class Aluno {
	private String id;
	private String nome;
	private double nota;
	public Aluno(String idEsc) {
		this.id = idEsc;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public boolean equals(Object o){
		if (o instanceof Aluno) {
			Aluno a = (Aluno)o;
			return id.equals(a.id);
		}
		return false;
	}
	public String toString() {
		String retorno = (id +  ", " + nome + ", " + nota);
		return retorno;
	}

}

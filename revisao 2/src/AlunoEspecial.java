
public class AlunoEspecial extends Aluno{
	public AlunoEspecial (String id) {
		super(id);
	}
	public String toString() {
		return ("[Aluno especial] " + super.toString());
	}

}

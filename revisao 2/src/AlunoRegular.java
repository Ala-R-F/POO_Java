
public class AlunoRegular extends Aluno{
	public AlunoRegular (String id) {
		super(id);
	}
	public String toString() {
		return ("[Aluno regular] " + super.toString());
	}

}
import java.util.ArrayList;

public class Utils {
	
	public static boolean existe(ArrayList x, Aluno y) {
		return x.contains(y);

	}
	public static Aluno[] retornaDados(ArrayList lAlu) {
		Aluno[] listona = new Aluno[(lAlu.size())];
		for (int i = 0; i<lAlu.size(); i++) {
			String a = (String) lAlu.get(i);
			String atri[] = a.split("#");
			Aluno fulano;
			/*
			for(int j = 0; j<atri.length; j++) {
				System.out.println(atri[j]);
			}
			*/
			if (atri[3].contentEquals("E")) {
				fulano = new AlunoEspecial(atri[0]);
			}
			else if (atri[3].contentEquals("R")) {
				fulano = new AlunoRegular(atri[0]);
			}
			else {
				System.out.println("Erro geral.");
				return listona;
			}
			fulano.setNome(atri[1]);
			fulano.setNota(Double.parseDouble(atri[2]));
			listona[i] = fulano;
			
		}
		return listona;
	}
}

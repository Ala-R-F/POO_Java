import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		ArrayList x = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Insira a String " + i + ": ");
			x.add(sc.nextLine());
		}
		Aluno[] listona = Utils.retornaDados(x);
		System.out.println("Por ordem de notas, ascendente:");
		/*
		for (int i = 0; i < 3; i++) {
			String nome = listona[i].getNome();
			String nome2 = listona[].getNome();
			for (int i = 0; i<nome.length())
			nome.charAt(0)
			
		}
		*/
		for (int i = 0; i < x.size(); i++) {
			double nota = listona[i].getNota();
			double temp;
			Aluno tempAl;
			for (int j = 0; j < x.size(); j++) {
				temp = listona[j].getNota();
				if (nota < temp) {
					nota = temp;
					tempAl = listona[i];
					listona[i] = listona[j];
					listona[j] = tempAl;
				}
			}
			
			
		}
		for(int i = 0; i<listona.length; i++) {
			System.out.println(listona[i]);
		}
		
		Aluno[] listNome = listona;
		
		System.out.println("\nPor ordem de nome, ascendente:");
		for (int i = 0; i < x.size(); i++) {
			String nome = listNome[i].getNome();
			nome = nome.toLowerCase();
			String temp;
			Aluno tempAl;
			for (int j = 0; j < x.size(); j++) {
				temp = listNome[j].getNome();
				temp = temp.toLowerCase();
				if (nome.compareTo(temp) < 0) {
						nome = temp;
					tempAl = listNome[i];
					listNome[i] = listNome[j];
					listNome[j] = tempAl;
				}
			}
			
			
		}
		for(int i = 0; i<listNome.length; i++) {
			System.out.println(listNome[i]);
		}
		
	}

}

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Aula {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nice = sc.nextLine();
		String ne = inv(nice);
		System.out.println("Teste exemplo das funções: \n\n -------/ /------- \n\n");
		System.out.println(ne + "\n\n");
		System.out.println(swi(ne) + "\n" + swi(nice) + "\n\n");
		
		System.out.println(invPal(nice) + "\n");
		
		ArrayList pote = new ArrayList();
		pote.add("gato");
		pote.add("cachorro");
		pote.add("passaro");
		
		System.out.println(right(nice, pote));
		
		System.out.println("\nMedia das palavras diferentes: "+med(nice));
		
		
		sc.close();
	}
	
	public static String inv(String a) {
		char x[] = a.toCharArray();
		char xi[] = new char[x.length];
		String aInv = "";
		int per = x.length - 1;
		for(int i = 0; i < x.length; i++) {
			xi[i] = x[(per)];
			aInv = aInv + xi[i];
			per--;
		}
		
		return aInv;
	}
	
	public static String invPal(String a) {
		String x[] = a.split(" ");
		String xi[] = new String[x.length];
		String aInv = "";
		int per = x.length - 1;
		for(int i = 0; i < x.length; i++) {
			xi[i] = x[(per)];
			aInv = aInv + xi[i];
			if (i < (x.length - 1)) {
				aInv += " ";
			}
			per--;
		}
		
		return aInv;
	}
	
	public static String swi(String a) {
		
		char x[] = a.toCharArray();
		String aSwi = "";
		
		for(int i = 0; i < x.length; i++) {
			if (x[i] == 'a') {
				aSwi += 4;
			}
			else if (x[i] == 'e') {
				aSwi += 3;
			}
			else if (x[i] == 'i') {
				aSwi += 1;
			}
			else if (x[i] == 'o') {
				aSwi += 0;
			}
			else {
				aSwi += x[i];
			}
		}
		return aSwi;
	}
	
	public static String right(String a, ArrayList b) {
		String x[] = a.split(" ");
		String no = "";
		
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < b.size(); j++) {
				String u = (String) b.get(j);
				if (u.equals(x[i])) {
					x[i] = "####";
				}
			}
			no += x[i];
			if (i < x.length - 1) {
				no += " ";
			}
		}
		return no;
	}
	
	public static double med(String a) {
		//Utilizando HashSet para treino
		
		String x[] = a.split(" ");
		double med = 0;
		HashSet b = new HashSet();
		
		for(int i = 0; i< x.length; i++) {
			b.add(x[i]);
		}
		Iterator t = b.iterator();
		while (t.hasNext()) {
			String s = (String) t.next();
			char c[] = s.toCharArray();
			med += c.length;
		}
		
		med = med / b.size();
		return med;
		
	}

}

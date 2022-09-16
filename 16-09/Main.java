import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;

public class Main {
	public static void main(String[] s) {
		
		/* 
		Crie um mapa em que a chave representa o nome dos alunos
		e o valor a idade. Em seguida, invoque um método que
		retorne a média das idades dos alunos.
		*/
		
		HashMap m = new HashMap();
		m.put("Fifi Holanda", 36);
		m.put("Maria Benilde", 30);
		m.put("Gustavo Guedes", 33);
		
		
		System.out.println("A média é: " + media((Map) m) + " e Média 2: " + mediaKey((Map) m));
	}	
	public static double media(Map g) {
		Collection a = g.values();
		
		Iterator iterator = a.iterator();
		double soma = 0;
		for(int i = 0; i < a.size(); i++) {
			soma += (int) iterator.next();
		}
		return soma / a.size();
	}
		
	public static double mediaKey(Map g) {
		double soma = 0;
		Collection a = g.keySet();
		
		Iterator iterator = a.iterator();
		while (iterator.hasNext()) {
			Object o = iterator.next();
			String s = (String) o;
			System.out.println(s);
			soma += (int) g.get(s);
		}
		return soma / a.size();
		
	}
	
}

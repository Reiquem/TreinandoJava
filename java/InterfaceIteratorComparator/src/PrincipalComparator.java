import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComparator {

	public static void main(String[] args) {
		ArrayList<String> listaNomes = new ArrayList<>();
		listaNomes.add ("Diogo");
		listaNomes.add ("Luiza");
		listaNomes.add ("Juliana");
		listaNomes.add ("Gustavo");
		listaNomes.add ("Daniel");
		listaNomes.add ("Wagner");
		listaNomes.add ("Brayan");
		
		System.out.println("Elementos antes da ordenação:");
		for(int i = 0; i<listaNomes.size();i++)
			System.out.println(listaNomes.get(i));
		

		Comparator<String> comparator = Collections.reverseOrder();
		
		Collections.sort(listaNomes,comparator);
		System.out.println("Elementos depois da ordenação:");
		
		for(String nome: listaNomes)
			System.out.println(nome);
		
	}

}

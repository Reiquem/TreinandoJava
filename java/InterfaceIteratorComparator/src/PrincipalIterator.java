import java.util.ArrayList;
import java.util.Iterator;

public class PrincipalIterator {

	public static void main(String[] args) {
		ArrayList <String> listaNome = new ArrayList<>();
		listaNome.add ("Diogo");
		listaNome.add ("Luiza");
		listaNome.add ("Juliana");
		listaNome.add ("Gustavo");
		listaNome.add ("Daniel");
		listaNome.add ("Wagner");
		listaNome.add ("Brayan");
		
		Iterator<String> iterator = listaNome.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}

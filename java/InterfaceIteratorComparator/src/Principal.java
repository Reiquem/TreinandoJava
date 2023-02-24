import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList <String> listaNome = new ArrayList<>();
		listaNome.add ("Diogo");
		listaNome.add ("Luiza");
		listaNome.add ("Juliana");
		listaNome.add ("Gustavo");
		listaNome.add ("Daniel");
		listaNome.add ("Wagner");
		listaNome.add ("Brayan");
		
		System.out.println("Antes");
		for(String nome: listaNome) {
			System.out.println(nome);
		}
		listaNome.set(1, "Jujuba");
		
		System.out.println();
		System.out.println();
		
		System.out.println("Depois");
		
	
		for(String nome: listaNome) {
			System.out.println(nome);
		}

	}

}






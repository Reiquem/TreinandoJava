import java.util.ArrayList;
import java.util.Scanner;

public class Primario{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> valores = new ArrayList<Integer>();

        // solicita ao usuário que digite um número inteiro e adiciona-o à lista
        System.out.print("Digite um número inteiro (ou 'sair' para encerrar): ");
        while (scanner.hasNextInt()) {
            valores.add(scanner.nextInt());
            System.out.print("Digite outro número inteiro (ou 'sair' para encerrar): ");
        }

        // calcula a soma total dos números armazenados na lista
        int soma = 0;
        for (int numero : valores) {
            soma += numero;
        }

        // exibe a lista de números e a soma total
        System.out.println("Números armazenados: " + valores);
        System.out.println("Soma total: " + soma);
    }
}
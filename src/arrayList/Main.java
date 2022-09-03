package arrayList;

// IMPORTAÇÃO DA CLASSE ARRAYLIST
import java.util.ArrayList;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// CRIA OBJETO ARRAY
		ArrayList<String> cli = new ArrayList<String>();
		
		// cli.add("Giovane");
		// cli.add("Souza");
		
		Scanner input = new Scanner(System.in);
		
		String cliente = "";
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.print("Digite o " + i + "º" + " nome: ");

			// PERMITE A ENTRADA DE UM NOVO NOME
			cliente = input.nextLine();	
			
			// OBJETO GUARDA TODOS OS NOMES INSERIDOS
			cli.add(cliente);
			
			//System.out.println("Posição " + i + " " + cli.indexOf("Souza"));

		}
		
		System.out.println(cli.toString());	
		
		// .toString() = MOSTRA TODO O CONTEÚDO
		// .add('Nome') = ADICIONA
		// .remove(0) = REMOVE UMA POSIÇÃO
		// .clear() = REMOVE TODAS AS POSIÇÕES
		// .get() = RETORNA VALOR DE UMA POSIÇÃO
		// .isEmpty() = RETORNA VALOR BOLEANO
		// .contains('Nome') = RETORNA VALOR BOLEANO
		// .size() = RETORNA O TAMANHO DO ARRAYLIST
		// .indexOf('Nome') = RETORNA POSIÇÃO

	}

}

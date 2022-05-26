//while

package Sessao5;

import java.util.Scanner; //importar biblioteca

public class Aula01 {
	public static void main(String[] args) {

		int idade = 1;
		String nome;


		//Para receber os dados do teclado
		Scanner teclado = new Scanner(System.in);

		while(idade > 0) {

			System.out.println("informe seu nome: ");
			nome = teclado.nextLine(); //Line serve para Scanner de String, 
			//somente next também funciona so que somente para uma palavra.


			//Integer.parseInt converte uma String em inteiro.
			System.out.println("Informe sua Idade: ");
			//idade = teclado.nextInt(); // bug
			idade = Integer.parseInt(teclado.nextLine());

           
		
			System.out.println("Nome: " + nome + " Idade: " + idade);
		}

		teclado.close();


	}
}

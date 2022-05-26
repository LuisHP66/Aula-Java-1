//do while
package Sessao5;

import java.util.Scanner;

public class Aula01_2 {
public static void main(String[] args) {
	
	int idade;
	String nome;


	//Para receber os dados do teclado
	Scanner teclado = new Scanner(System.in);

	//Primeiro executa o bloco, depois faz a checagem.
	 do {

		System.out.println("informe seu nome: ");
		nome = teclado.nextLine(); //Line serve para Scanner de String, 
		//somente next também funciona so que somente para uma palavra.


		//Integer.parseInt converte uma String em inteiro.
		System.out.println("Informe sua Idade: ");
		//idade = teclado.nextInt(); // bug
		idade = Integer.parseInt(teclado.nextLine());

       
	if(idade > 0) {
		
		System.out.println("Nome: " + nome + " Idade: " + idade);
	}
	}
	
	 while(idade > 0);

	teclado.close();
}
}

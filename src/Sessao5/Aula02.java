//for

package Sessao5;
import java.util.Scanner;


public class Aula02 {
	public static void main(String[] args) {
		int idade;
		String nome;
		Scanner teclado = new Scanner(System.in);
		
		
		//Váriavel de controle; condição de parada; forma de incremento.
		// Meio que limita a quantidade de repetições, nesse caso ate 4 vezes.
		for(int i = 0; i < 5; i ++) {
		System.out.println("Informe seu nome: ");
		nome = teclado.nextLine();
		
		System.out.println("Informe sua idade: ");
		idade = Integer.parseInt(teclado.nextLine());
		
		if(idade > 0) {
			System.out.println(nome + " tem " + idade + " anos.");
		}
		}
	teclado.close();
	}

}

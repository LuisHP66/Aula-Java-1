/*Ler um número inteiro. Se o número lido for negativo, escreva a mensagem "Número inválido"
 Se o nuḿero for positivo, calcular o logaritmo deste número.
 */

package Sessao4;
import java.util.Scanner;

public class Atividade12 {
	public static void main(String[] args) {
		int a;
		int b;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o logaritmo: ");
		a = teclado.nextInt();
		if(a <= 0) {
		System.out.println("Número inválido!");
		}
		else{
			System.out.println("Informe a base: ");
			b = teclado.nextInt();	
		
			
			double resultado = Math.log(a)/Math.log(b);
			System.out.println(resultado);
			
			
			
		
			
			
		
		
		}
		
		
		

		
	
		
		


		teclado.close();
		
	}
	
}

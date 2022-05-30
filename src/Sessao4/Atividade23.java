/*Determine se um determinado ano lido é bissexto. Sendo que um ano é bissexto se
 for divisivel por 400 ou se for divisivel por 4 e não for divisivel por 100.
 */

package Sessao4;
import java.util.Scanner;

public class Atividade23 {
public static void main(String[] args) {
	
	int ano;
	
			
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Informe o ano: ");
	ano = teclado.nextInt();
	int divisao = ano % 100;
	int divisao1 = ano % 400;
	int divisao2 = ano % 4;
	
	
	if (divisao == 0) {
		System.out.println(ano + " não é um ano bissexto");
	}
	else if(divisao1 == 0 || divisao2 == 0 || divisao1 == 0 && divisao2 == 0) {
		System.out.println(ano + " é um ano bissexto");
	}
	else {
		System.out.println(ano + " não é um ano bissexto");
	}
}
}

/*Leia a idade e o tempo de serviço de um trabalhador e escreva se ele pode
 ou não se aposentar. As condições para se aposentar são:
 -> Ter pelo menos 65 anos
 -> Ou ter trabalhado pelo menos 30 anos.
 -> Ou ter pelo menos 60 anos e trabalhado pelo menos 25 anos.
 */

package Sessao4;
import java.util.Scanner;

public class Atividade22 {
public static void main(String[] args) {
	int idade;
	int tempo;
	
	Scanner teclado = new Scanner(System.in);
	
	
	System.out.println("Dígite a idade: ");
	idade = teclado.nextInt();
	if(idade < 12) {
		System.out.println("Informações inválidas!");
		System.exit(1);
	}
	System.out.println("Dígite o tempo de trabalho: ");
	tempo = teclado.nextInt();
	if(idade <= tempo) {
		System.out.println("Informações inválidas!");
		System.exit(2);
	}
	
	
	if(idade >= 60 && tempo >= 25) {
		System.out.println("Você tem direito a sua aposentadoria!");
	}
	else if(idade >= 65 || tempo >= 30) {
		System.out.println("Você tem direito a sua aposentadoria!");
	}
	else {
		System.out.println("Você não tem direito a sua aposentadoria!");
	
	}
}
}

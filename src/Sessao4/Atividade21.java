/*Escreva o menu de opções abaixo. Leia a opção do úsuario e execute a operação
 escolhida. Escreva uma mensagem de erro se a opção for inválida.
 Escolha uma opção:
 1 -> soma de 2 números
 2 -> Diferença entre 2 números
 3 -> Produto entre 2 números
 4 -> Divisão entre 2 números(o denominador não pode ser 0)
 */

package Sessao4;
import java.util.Scanner;

public class Atividade21 {
public static void main(String[] args) {
	
	int num1;
	int num2;
	int num3;
	
	
	Scanner teclado = new Scanner(System.in);
	
	
	System.out.println("Escolha uma operação: ");
	System.out.println("1 -> Soma de 2 números");
	System.out.println("2 -> Diferença entre 2 números");
	System.out.println("3 -> Produto entre 2 números");
	System.out.println("4 -> Divisão entre 2 números (não é possível dividir por 0");
	num3 = teclado.nextInt();
	
	if (num3 > 4 || num3 < 1) {
		System.out.println("So é permitido números de 1 á 4!");
		System.exit(1);
		}
	
	
	System.out.println("Informe o primeiro número: ");
	num1 = teclado.nextInt();
	System.out.println("Informe o segundo número: ");
	num2 = teclado.nextInt();
	
	
	switch(num3) {
	case 1:
		int soma = num1 + num2;
		System.out.println(num1 + " + " + num2  + " = " + soma);
		break;
	case 2:
	    if(num1 > num2) {
	    	int diferença1 = num1 - num2;
	    	System.out.println("A diferença entre os números é de " + diferença1);
	    }
	    else if(num2 > num1) {
	    	int diferença2 = num2 - num1;
	    	System.out.println("A diferença entre os números é de " + diferença2);
	    }
	    else {
	    	int diferença3 = num1 - num2;
	    	System.out.println("A diferença entre os números é de " + diferença3);
	    	break;
	    }
	case 3:
		int produto = num1 * num2;
		System.out.println(num1 + " X " + num2 + " = " + produto);
		break;
	case 4:
		if(num2 <= 0) {
			System.out.println("Erro, não é possível dividir por 0!");
			System.exit(2);
		}
		else {
			int divisao = num1 / num2;
			System.out.println(num1 + " ÷ " + num2 + " = " + divisao);
			break;
		}
	}
	
	
	
	
}
}

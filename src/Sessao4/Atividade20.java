/*Dados três valores A, B e C verificar se eles podem ser valores dos lados
 de um triangulo, se forem, se é um trinangulo escaleno, equilatero ou isoscele
 considerando os seguintes conceitos:
 -> Ocomprimento de cada lado de um triangulo é menor do que a soma dos outros dois lados.
 -> Chama-se equilatero o triangulo de 3 lados iguais.
 -> Denomina-se isosceles o triangulo que tem comprimento de dois lados iguais.
 -> Recebe o nome de escaleno o triangulo que tem os 3 lados diferentes.
 */

package Sessao4;
import java.util.Scanner;

public class Atividade20 {
	public static void main(String[] args) {
		
		
		int A;
		int B;
		int C;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira o valor de A: ");
		A = teclado.nextInt();
		
		System.out.println("Insira o valor de B: ");
		B = teclado.nextInt();
		
		System.out.println("Insira o valor de C: ");
		C = teclado.nextInt();
		
		int soma1 = B + C;
		int soma2 = A + C;
		int soma3 = A + B;
		
		if (A < soma1 && B < soma2 && C < soma3) {
			
			if(A == B && B == C) {
				System.out.println("É um triangulo EQUILÁTERO, pois os 3 lados são iguais.");
			}
		    else if (A == B || A == C || B == C) {
		   System.out.println("É um triângulo ISÓSCELES, pois tem 2 lados iguais.");
		    }
		    else {
		    	System.out.println("É um triângulo ESCALENO, pois todos os lados são diferentes.");
		    }
			
		}else {
			System.out.println("Não forma um triângulo!");
		}
			
	    
		
	    teclado.close();
	}

}

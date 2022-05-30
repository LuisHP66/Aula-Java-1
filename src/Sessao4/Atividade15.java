/*Usando o switch, escreva um programa que leia um inteiro entre 1 e 7 e imprima o dia
 da semana correspondente a este número. Isto é, domingo se 1, segunda se 2, e assim por diante.
 */

package Sessao4;
import java.util.Scanner;

public class Atividade15 {
	public static void main(String[] args) {
		int num;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o dia da semana: ");
		num = teclado.nextInt();
		
			
			switch (num) {
			case 1:
			System.out.println("Hoje é domingo!");	
			break;
			case 2:
			System.out.println("Hoje é segunda-feira!");	
			break;
			case 3:
			System.out.println("Hoje é terça-feira!");	
			break;
			case 4:
			System.out.println("Hoje é quarta-feira!");	
			break;
			case 5:
			System.out.println("Hoje é quinta-feira!");	
			break;
			case 6:
			System.out.println("Hoje é sexta-feira!");	
			break;
			case 7:
			System.out.println("Hoje é sábado!");	
			break;
			}
			if (num > 7 || num <= 0) {
		   System.out.println("Erro, a semana tem somente 7 dias");
			}
		}
	}



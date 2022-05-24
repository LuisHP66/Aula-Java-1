/*Faça um programa que receba 2 números e mostre o maior. Se por acaso, os dois números
 forem iguais, imprima uma mensagem "números iguais"*/

package Sessao4;

public class Atividade07 {
	public static void main(String[] args) {
		int num1 = 5, num2 = 4;

		if(num1 > num2) {
			System.out.println(num1 + " é maior que " + num2);


		}if(num1 < num2) {
			System.out.println(num2 + " é maior que " + num1);


		}else if(num1 == num2) {
			System.out.println("Números iguais");

		}
	}

}

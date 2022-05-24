/*Escreva um programa que, dados dois numeros inteiros, mostre na tela o maior deles,
  assim como a diferença existente entre ambos*/
package Sessao4;

public class Atividade06 {
	public static void main(String[] args) {
		int num1 = 10, num2 = 6;
		var diferença = num1 - num2;
		var diferença2 = num2 - num1;


		if(num1 > num2) {
			System.out.println("O número " + num1 + " é o maior e a diferença entre eles é " + diferença);	


		}
		if(num1 < num2) {
			System.out.println("O numero " +  num2 + " é o maior e a diferença entre eles é " + diferença2);



		}


	}
}

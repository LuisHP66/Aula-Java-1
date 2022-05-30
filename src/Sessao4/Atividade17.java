/*Faça um programa que calcule e mostre a área de um trapézio. Sabe-se que
 A = ((base maior + basemenor) * altura) / (2))
 Lembre-se a base maior e a base menor devem ser mauires que 0
 */

package Sessao4;
import java.util.Scanner;

public class Atividade17 {
	public static void main(String[] args) {
		int h;
		int maior;
		int menor;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe a altura: ");
		h = teclado.nextInt();
		if(h <= 0) {
			System.out.println("Altura deve ser maior que 0!");
			System.exit(1);
		}
		System.out.println("Informe a base maior:");
		maior = teclado.nextInt();
		if(maior <= 0) {
			System.out.println("Base maior deve ser maior que 0!");
			System.exit(2);
		}
		System.out.println("Informe a base menor: ");
		menor = teclado.nextInt();
		if(menor <= 0) {
			System.out.println("Base menor deve ser maior que 0!");
			System.exit(3);
		}
		else {
			int calculo = ((maior + menor) * h) / 2;
			System.out.println("Área do trapézio = " + calculo + "cm²");
		}
	}



}



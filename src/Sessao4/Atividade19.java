/*Faça um programa que verifique se um determinado numero e divisivel por 3 ou 5,
 mas não simultaneos.
 */

package Sessao4;
import java.util.Scanner;

public class Atividade19 {
public static void main(String[] args) {
	
	int num1;
	int num2;
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Informe o número para verificação: ");
	num1 = teclado.nextInt();
	
	System.out.println("Deseja fazer: Verificação por: 3 codigo 3, por 5 codigo 5 e por ambos codigo 6");
	num2 = teclado.nextInt();
	if(num2 == 3 || num2 == 5 || num2 == 6) {
		switch(num2) {
		case 3:
		if(num1 % 3 == 0) {
			System.out.println(num1 + " é divisivel por 3");
			System.exit(1);
		}
			if(num1 % 3 == 1);
				System.out.println(num1 + " não é divisivel por 3");
			break;	
		case 5:
			if(num1 % 5 == 0) {
				System.out.println(num1 + " é divisivel por 5");
				System.exit(2);
			}
				if(num1 % 5 == 1);
					System.out.println(num1 + " não é divisivel por 5");
				break;
		case 6:
			if(num1 % 5 == 0 && num1 % 3 == 0) {
				System.out.println(num1 + " é divisilvel por 5 e por 3");
				System.exit(3);
			}
			if(num1 % 5 == 1 && num1 % 3 == 1);
			System.out.println(num1 + " não é divisivel por 5 e por 3");
			
		}
		
		}
		
		
	}
	
	
	
	
	
}


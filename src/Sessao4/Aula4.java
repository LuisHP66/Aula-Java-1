//Instrução Switch
package Sessao4;

public class Aula4 {
public static void main(String[] args) {
	int numero = 40;
	
	switch (numero) {
		case 3:
		System.out.print("O numero é 3");
		break;
		case 0:
		System.out.print("O numero é 0");	
		break;
		case 2:
		System.out.println("O numero é 2");
		break;
		default:
		System.out.println("O numero é " + numero);	
		break;
	}
	
}
}

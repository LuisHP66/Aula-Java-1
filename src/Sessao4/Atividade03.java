/* Leia um numero real. Se o número for positivo imprima a raiz quadrada.
 * do contrário imprima o número ao quadrado.*/
package Sessao4;

public class Atividade03 {
public static void main(String[] args) {
	
	double num = 25; //Se mudar para numero negativo faz o numero ao quadrado.
	
	if(num > 0) {
	double resultado = Math.sqrt(num);
	System.out.println(resultado);
	
	}
	
	else if (num < 0) {
	double resultado2 = Math.pow(num, 2);
	System.out.println(resultado2);
	
	}
	
}

}

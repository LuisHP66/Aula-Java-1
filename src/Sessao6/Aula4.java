//Operações matematicas

package Sessao6;

public class Aula4 {
public static void main(String[] args) {
	
	int num1 = 5;
	int num2 = 10;
	int res;
	
	//Soma
	res = num1 + num2;
	System.out.println("A soma de " + num1 + " + " + num2 + " é " + res);
	
	//Subtração
	res = num1 - num2;
	System.out.println("A subtração de " + num1 + " - " + num2 + " é " + res);
	
	//Multiplicação
	res = num1 * num2;
	System.out.println("A multiplicação de " + num1 + " * " + num2 + " é " + res);
	
	//Divisão
	res = num1 / num2;
	System.out.println("A divisão de " + num1 + " / " + num2 + " é " + res);
	
	//Módulo
	res = num1 % 2;
	//Usado para saber se numero e par ou impar, se resto é 0 é par se o resto é 1 é par. 
	System.out.println("O resto da divisão de " + num1 + " por 2 " + " é " + res);
	
}
}

/*leia um numero. Se esse numero for positivo, calcule a raiz quadrada do numero. Se o numero for
negativo, mostre uma imagem dizendo que o numero e invalido*/
package Sessao4;

public class Atividade02 {
public static void main(String[] args) {
	
	double num = 9; // Se mudar para numero negativo seta no Número inválido!
	
	
	if(num < 0) {
	System.out.println("Número é inválido!");
	
	}
	
	else if(num > 0) {
	double resultado = Math.sqrt(num);
	System.out.println(resultado);
	}
	
}

}

//Operador ternário
package Sessao4;

public class Aula3 {
 //para aplicar o main é so digitar main e pressionar CTRL+ESPAÇO e selecionar main metodo
	public static void main(String[] args) {
		
		int valor = 3, numero;
	
		/*if(valor > 0) {
		numero = valor;
	}else {
		numero = 7;
		
	} (mesma coisa que no caso seguinte)*/
		numero = (valor > 0) ? valor : 7;
	System.out.println(numero);
}
}

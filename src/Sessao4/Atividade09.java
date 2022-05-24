/*Leia o sálario de um trabalhador e o valor da prestação de um empréstimo.
 Se a prestação for maior que 20% do sálario imprima: "Emprestimo não concedido",
 caso contrário imprima: "empréstimo concedido".
 */
package Sessao4;

public class Atividade09 {
	public static void main(String[] args) {
		double salario = 1700.00;
		double parcela = 1000.00;

		if(parcela > (20 * salario) / 100) {
			System.out.println("Emprestimo não concedido");

		}
		if(parcela < (20 * salario) / 100){
			System.out.println("Emprestimo concedido");

		}




	}
}

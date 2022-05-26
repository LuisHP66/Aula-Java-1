//Faça um algoritmo que calcule a média ponderada das notas de 3 provas. A primeira e a segunda prova tem peso 1 e a terceira tem peso 2.
//Ao final, mostrar a média do aluno e indicar se o aluno foi aprovado ou reprovado. A nota para aprovação deve ser igual ou superior a 60.

package Sessao4;
import java.util.Scanner;

public class Atividade13 {
	public static void main(String[] args) {
		
	double nota1;
	double nota2;
	double nota3;
		int peso1 = 1, peso2 = 1, peso3 = 2;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe nota da primeira prova: ");
		nota1 = teclado.nextDouble();
		System.out.println("Informe nota da segunda prova: ");
		nota2 = teclado.nextDouble();
		System.out.println("Informe nota da terceira prova: ");
		nota3 = teclado.nextDouble();
		
      var formula = (peso1 * nota1 + peso2 * nota2 + peso3 * nota3) / (peso1 + peso2 + peso3);
		System.out.println("A média do aluno é: " + formula);
		
		if(formula < 0) {
			System.out.println("Nota informada inválida!");
		}
		if(formula > 100) {
			System.out.println("Nota informada inválida!");
		}
		else if(formula >= 60) {
			System.out.println("Aluno aprovado!");
		}
		else {
			System.out.println("Aluno reprovado!");
		}
		
	}

}

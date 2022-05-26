/*A nota final de um estudante é calculada a partir de 3 notas atibuidas entre o intervalo de
0 até 10, respectivamente, a um trabalho, a uma avaliação semestral e a um exame final. A média
das 3 notas mensionadas obedece aos pesos: trabalho: 2 , avaliação semestral: 3, exame final :5.
De acordo com o resultado, mostre na tela se o aluno esta reprovado (média entre 0 a 2,9), 
recuperação (3 a 4,9) e aprovado (5 a 10). Faça todas verificações necessárias.*/


package Sessao4;
import java.util.Scanner;

public class Atividade14 {
	public static void main(String[] args) {
		
		String nome;
		double nota1;
		double nota2;
		double nota3;
		int peso1 = 2;
		int peso2 = 3;
		int peso3 = 5;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Nome do aluno: ");
		nome = teclado.nextLine();
		System.out.println("Primeira nota: ");
		nota1 = teclado.nextDouble();
		if(nota1 > 10 || nota1 < 0) {
			System.out.println("Nota inválida!");
			System.exit(1);
		}
		
		System.out.println("Segunda nota: ");
		nota2 = teclado.nextDouble();
		if(nota2 > 10 || nota2 < 0) {
			System.out.println("Nota inválida!");
			System.exit(2);
		}
		
		System.out.println("Terceira nota: ");
		nota3 = teclado.nextDouble();
		if(nota3 > 10 || nota3 < 0) {
			System.out.println("Nota inválida!");
			System.exit(3);
		}
		
		
		
		
		
		double x = nota1 * peso1;
		double y = nota2 * peso2;
		double z = nota3 * peso3;
		double resultado = (x + y + z) / (peso1 + peso2 + peso3);		
		
		System.out.printf( "Nome do aluno: " + nome + " média do aluno: %.1f %n", resultado);//printf serve para especificar o que vai ser impresso, % para determinar de onde .1 depois do ponto uma casa
		
		
		if(resultado <= 2.9) {
			System.out.println("Aluno reprovado! ");
		}
		else if(resultado <= 4.9) {
			System.out.println("Aluno ficou para recuperação! ");
		}
		
		else {
			System.out.println("Aluno aprovado!");
		}
}
}

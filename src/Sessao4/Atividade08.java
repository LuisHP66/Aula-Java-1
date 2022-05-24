/*Faça um programa que leia duas notas de um aluno, verifique se as notas são validas
 e exiba na tela a média destas notas. Uma nota validade deve ser, obrigatóriamente, um 
 valor entre 0.0 e 10.0, onde caso a nota não possia um valor válido, este fato deve
 ser informado ao usuário e o programa termina.
 */
package Sessao4;

public class Atividade08 {
	public static void main(String[] args) {
		double nota1 = 0.0, nota2 = 9.7;
		if((nota1 > -0.1) && (nota1 < 10.1) && (nota2 > -0.1) && (nota2 < 10.1)) {
			System.out.println((nota1 + nota2) / 2);	




		}



	}

}

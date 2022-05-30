/*Faça um programa que mostre ao úsuario um menu com 4 opções de operações
 matemáticas (as básicas, por exemplo). O úsuario escolhe uma das operações
 então se pede dois valores númericos e realiza a operação.
 (Adição, subtração, multiplicação e divisão.)
 */

package Sessao4;
import java.util.Scanner;

public class Atividade18 {
public static void main(String[] args) {
	
    int num1;
	int num2;
	int opcao;
	
		
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Escolha o primeiro número:");
    num1 = Integer.parseInt(teclado.nextLine());
    
    
    System.out.println("Escolha o segundo número:");
    num2 = Integer.parseInt(teclado.nextLine());
    
    
    System.out.println("Qual operação deseja: divisao = 1, multiplicacao = 2, subtracao = 3, adicao = 4");
    opcao = Integer.parseInt(teclado.nextLine());
   if(opcao > 4 || opcao <= 0) {
	   System.out.println("Somente números de 1 a 4");
	   System.exit(1);
   }
   switch(opcao) {
   case 1:
	   if(num2 <= 0) {
		   System.out.println("Não é possivel dividir por 0");
		   System.exit(2);
	   }
	   else {
		   var divisao = num1 / num2;
		   System.out.println(num1 + " ÷ " + num2 + " = " + divisao);
	   }
	   break;
   case 2:
	   var multiplicacao = num1 * num2;
	   System.out.println(num1 + " X " + num2 + " = " + multiplicacao);
   break;
   case 3:
	   var subtracao = num1 - num2;
	   System.out.println(num1 + " - " + num2 + " = " + subtracao);
	   break;
   case 4:
	   var adicao = num1 + num2;
	   System.out.println(num1 + " + " + num2 + " = " + adicao);
   }
	}
	
}


    	
   
    
	
	
	

	
		
	
	
	
	



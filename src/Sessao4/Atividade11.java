//Escreva um programa que leia um número inteiro maior do que 0 e devolva a soma de todos os seus algorismos. Por exemplo
//251 = 8 (2 + 5 + 1). Se o número lido for 0 ou menor mensagem "Número invalido!".
package Sessao4;

import java.util.Scanner;

public class Atividade11 {
	public static void main(String[] args) {
		
	 int x = 0;
	 
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Insira o número de x");
	 x = sc.nextInt();
	 
	 
	  if (0 >= x){
	  System.out.println("Número invalido");
	  
	  
	  }
	  else{ 
	 
	 String[] inteiros = String.valueOf(x).split("(?<=.)");
	
	Integer i = Integer.valueOf(inteiros[0]);
	Integer j = Integer.valueOf(inteiros[1]);
	Integer k = Integer.valueOf(inteiros[2]);
	Integer value = i.intValue() + j.intValue() + k.intValue();
	  
	  System.out.println(value);
	 }
	 
		 
	 
	  
	}

	

}

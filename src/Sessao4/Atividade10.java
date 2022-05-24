/*Faça um programa que receba a altura e o sexo de uma pessoa e calcule e mostre seu peso ideal,
utilizando as seguintes formulas(onde H corresponde a altura);
Homens: (72.7*h)-58
Mulheres: (62,1*h)-44,7*/
package Sessao4;

import java.util.Scanner;

public class Atividade10 {
     public static void main(String[] args) {
		  double h1 = 0.0;
		  String sexo1 = "";
		  double pesoIdeal = 0.0;
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.println("insira a altura");
		  h1 = sc.nextDouble();
		  System.out.println("insira o sexo");
		  sexo1 = sc.next();
		  
		  if(sexo1.equals("Masculino")) {
			pesoIdeal = (72.7 * h1) - 58;
			
			
			  
		  }
		  else {
			  pesoIdeal = (62.1 * h1) - 58;
			  
		  }
		  System.out.print("peso ideal " + sexo1 + ": " + pesoIdeal);
		
		  
		  
	}

}

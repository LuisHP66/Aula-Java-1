//Tipos de dados
//Númericos (inteiros e reais)

package Sessao6;

public class Aula01 {
public static void main(String[] args) {
	
	//Inteiros
	//Tipos primários
	long num0 = 99;//inteiro muito grande
	int num1 = 4;
	short num2 = 4; //(curto/menor/baixo)
	byte num5 = 4; //menor que short
	char num8 = 38;
	
	//Tipos não primários
	Long num7 = (long) 999999999; //Cast
	Integer num3 = 98;
	Short num4 = 7;
	Byte num6 = 9;
	Character num9 = 34;
	
	
	//Reais
	//Primitivos
	float preco = 23.4f; //float mais pequeno.
	double preco1 = 23.4;
	
	//Não primitivos
	Float preco2 = 44.5f;
	Double preco3 = 44.5;
	
	//Ver quanto de memoria ocupa tais váriaveis
	System.out.println("int/Integer " + Integer.SIZE + " bits");
	System.out.println("short/Short " + Short.SIZE + " bits");
	System.out.println("byte/Byte " + Byte.SIZE + " bits" );

	//valores de memoria suportados
	System.out.println("Valor min do int/Integer " + Integer.MIN_VALUE);
	System.out.println("Valor min do int/Integer " + Integer.MAX_VALUE);
}
}

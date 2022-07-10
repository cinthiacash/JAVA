//Faça um programa que entre com três números e coloque em ordem crescente.//
package listaDeExercicios1;

import java.util.*;

public class questao2 {
	public static void main (String args[]) {
		
		Scanner entrada = new Scanner (System.in);
		
		int num1,num2,num3,maior,menor;
		System.out.printf("Digite o primeiro número: ");
		num1 = entrada.nextInt();
		System.out.printf("Digite o segundo número: ");
		num2 = entrada.nextInt();
		System.out.printf("Digite o terceiro número: ");
		num3 = entrada.nextInt();
		if(num1<=num2 && num2<=num3)
		{
			System.out.println("\nOrdem crescente: "+num1+" , "+num2+" , "+num3);//a , b , c
		}
		else if(num1<=num3 && num3<=num2)
		{
			System.out.println("\nA Ordem crescente dos números digitados é: "+num1+" , "+num3+" , "+num2);
		}
		else if(num2<=num1 && num1<=num3)
		{
			System.out.println("\nA Ordem crescente dos números digitados é: "+num2+" , "+num1+" , "+num3);
		}
		else if(num2<=num3 && num3<=num1)
		{
			System.out.println("\nA Ordem crescente dos números digitados é: "+num2+" , "+num3+" , "+num1);
		}
		else if(num3<=num1 && num1<=num2)
		{
			System.out.println("\nA Ordem crescente dos números digitados é: "+num3+" , "+num1+" , "+num2);
		}
		else
		{
			System.out.println("\nA Ordem crescente dos números digitados é: "+num3+" , "+num2+" , "+num1);
		}

	}

		
		
	
		
		
		
}



//Faça um programa que receba três inteiros e diga qual deles é o maior.//
package listaDeExercicios1;

import java.util.*;

public class questao1 {
	public static void main(String args[])
	{	
		Scanner entrada = new Scanner (System.in);
		
		int num1,num2,num3,maior;
		System.out.printf("Digite o primeiro número: ");
		num1 = entrada.nextInt();
		System.out.printf("Digite o segundo número: ");
		num2 = entrada.nextInt();
		System.out.printf("Digite o terceiro número: ");
		num3 = entrada.nextInt();
		
		maior = num1;
		
		if (num2>num1){
			maior=num2;
		}
		if (num3>maior) {
			maior=num3;
		}
		System.out.println(maior);
	}
	}
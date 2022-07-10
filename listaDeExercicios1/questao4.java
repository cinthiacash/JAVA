/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

package listaDeExercicios1;

import java.util.*;

public class questao4 {
	
	public static void main(String[] args) {
		
		int num;
		double valor;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nDigite um número: ");
		num = entrada.nextInt();
		
		if(num % 2 == 0)
		{
			valor = Math.sqrt(num);
		}
		else
		{
			valor = Math.pow(num, 2);
		}
		System.out.printf("\nValor: %.2f",valor);
	
	}

}



package pacotejava;

import java.util.*;

public class Repeticao2 {
	public static void main(String args[])
	{	
		Scanner entrada = new Scanner (System.in);
		
		int idade;
		System.out.printf("Qual sua idade?");
		idade = entrada.nextInt();
		
		while(idade>=1)
		{
			System.out.printf("\nSua idade: %d",idade);
			if(idade>=18)
			{
				System.out.printf("\nVocê é de maior!");
			}
			else
			{
				System.out.printf("\nVocê é de menor!");
			}
			System.out.printf("\nQual sua idade?");
			idade = entrada.nextInt();
			}
		}
	

}

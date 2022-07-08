package pacotejava;

import java.util.*;
public class Condicional1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int idade;
		String nome;
		
		System.out.printf("Qual sua idade? ");
		idade = ler.nextInt();
		ler.nextLine();
		System.out.printf("Qual seu Nome? ");
		nome = ler.nextLine();
		System.out.printf("\nSeu nome: %s",nome);
		System.out.printf("\nSua idade: %d",idade);
		
		if(idade>=18) 
		{
			System.out.printf("\nVocê é maior de idade!");
		}
		else 
		{
			System.out.printf("\nVocê é menor de idade!");
		}
		
	}

}

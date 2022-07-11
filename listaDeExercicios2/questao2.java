package listaDeExercicios2;

import java.util.*;
public class questao2 {
	public static void main(String args[])
	{
		Scanner entrada = new Scanner (System.in);
		int idade,total21=0,total50=0;
		
		System.out.printf("\nQual sua idade? ");
		idade=entrada.nextInt();
		
		while (idade<=99) {
			System.out.printf("\nQual sua idade? ");
			idade=entrada.nextInt();
			
			if(idade<=21) {
				total21=total21+1;
			}
			if(idade>50) {
				total50=total50+1;
			}
		}
		System.out.printf("\nTotal de pessoas com até 21 anos: "+total21);
		System.out.printf("\nTotal de pessoas com até 50 anos: "+total50);
	}

}

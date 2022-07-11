package listaDeExercicios2;

import java.util.*;
public class questao6 {
	public static void main(String args[]) {
		
		Scanner entrada = new Scanner (System.in);
		int numero,soma=0,media=0,cont=0;
				
		do {
			System.out.printf("\nDigite um número: ");
			numero=entrada.nextInt();
			if(numero%3 == 0) {
				soma = soma+numero;
				cont++;
			}
		}				
		while(numero!=0);
		
		media=soma/cont;
		System.out.printf("\nA media dos números multiplos de 3 é: "+media);
}
}


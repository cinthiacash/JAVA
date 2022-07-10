
/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
package listaDeExercicios1;
*/
import java.util.*;

public class questao3 {
	public static void main (String args[]) {
		
		Scanner entrada = new Scanner (System.in);
		
		int idade;
		
		System.out.printf("Digite sua idade: ");
		idade=entrada.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.printf(idade+" anos - Sua Categoria é: Infantil");
		}
		else if(idade>=15 && idade<=17) {
			System.out.printf(idade+" anos - Sua Categoria é: Juvenil");
		}
		else if(idade>=18 && idade<=25) {
			System.out.printf(idade+" anos - Sua Categoria é: Adulto");
		}
		else {
			System.out.printf(idade+" anos - Idade Inválida");
		}
	}
}

package pacotejava;

public class Repeticao1 {
	public static void main (String args[])
	{ 
		int x,soma=0;
		
		for(x=1;x<=10;x++)
		{
			System.out.printf("\n %d",x);
			soma = soma +x;
		}
		System.out.printf("\nA Soma Total é: %d",soma);
	}

}

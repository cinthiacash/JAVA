package POO1;

public class carroTestar {
	public static void main(String args []) {
		
		Carro c1= new Carro();
		
		c1.nome = "Impala";
		c1.marca = "Chevrolet";
		c1.ano = 1967;
		c1.vel = 60;
		
		c1.acelerar(10);
		
		System.out.println("Velocidade: "+ c1.vel +" Km/h");
		
		c1.freiar(30);
		
		System.out.println("Velocidade: "+ c1.vel + "Km/h");
		
		
	}
}

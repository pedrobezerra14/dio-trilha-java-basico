package concessionaria;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("127548");
		jeep.ligar();
		
		Moto z400 = new Moto();
		z400.setChassi("295748");
		z400.ligar();
		
	}
}

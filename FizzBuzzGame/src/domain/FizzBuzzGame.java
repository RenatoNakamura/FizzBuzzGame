package domain;

public class FizzBuzzGame {
	
	ValidadorDeRegrasFizzBuzz validador;
	
	public FizzBuzzGame() {
		this.validador = new ValidadorDeRegrasFizzBuzz();
	}
	
	public void executar() {
		for (int i = 1; i < 100; i++) {
			this.validador.validar(i);
		}
	}
}

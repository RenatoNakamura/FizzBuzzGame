package domain;

import interfaces.RegraFizzBuzz;
import interfaces.UserMessanger;

public class Buzz implements RegraFizzBuzz {

	UserMessanger messanger;

	public Buzz() {
		this.messanger = new SystemMessanger();
	}

	@Override
	public boolean validar(int valor) {
		return valor % 5 == 0;
	}

	@Override
	public void executar(int valor) {
		this.messanger.writeLine("Buzz");
	}

}

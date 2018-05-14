package domain;

import interfaces.RegraFizzBuzz;
import interfaces.UserMessanger;

public class Fizz implements RegraFizzBuzz {

	UserMessanger messanger;

	public Fizz() {
		this.messanger = new SystemMessanger();
	}

	@Override
	public boolean validar(int valor) {
		return valor % 3 == 0;
	}

	@Override
	public void executar(int valor) {
		this.messanger.writeLine("Fizz");
	}

}

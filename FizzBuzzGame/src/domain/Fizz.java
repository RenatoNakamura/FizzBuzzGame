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
	public boolean executar(int valor) {
		boolean valido = validar(valor);

		if (valido) {
			this.messanger.writeLine("Fizz");
		}

		return valido;
	}

}

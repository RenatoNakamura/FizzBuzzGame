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
	public boolean executar(int valor) {
		boolean valido = validar(valor);

		if (valido) {
			this.messanger.writeLine("Buzz");
		}

		return valido;
	}

}

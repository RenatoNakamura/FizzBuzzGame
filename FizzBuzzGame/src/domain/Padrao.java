package domain;

import interfaces.RegraFizzBuzz;
import interfaces.UserMessanger;

public class Padrao implements RegraFizzBuzz {

	UserMessanger messanger;

	public Padrao() {
		this.messanger = new SystemMessanger();
	}

	@Override
	public boolean validar(int valor) {
		return true;
	}

	@Override
	public void executar(int valor) {
		this.messanger.writeLine(Integer.toString(valor));
	}

}

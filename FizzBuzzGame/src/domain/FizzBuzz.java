package domain;

import interfaces.RegraFizzBuzz;
import interfaces.UserMessanger;

public class FizzBuzz implements RegraFizzBuzz {

	Fizz fizz;
	Buzz buzz;
	UserMessanger messanger;

	public FizzBuzz() {
		this.fizz = new Fizz();
		this.buzz = new Buzz();
		this.messanger = new SystemMessanger();
	}

	@Override
	public boolean validar(int valor) {
		return this.fizz.validar(valor) && this.buzz.validar(valor);
	}

	@Override
	public void executar(int valor) {
		this.messanger.writeLine("FizzBuzz");
	}

}

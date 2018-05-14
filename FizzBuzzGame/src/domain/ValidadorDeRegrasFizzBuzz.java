package domain;

import java.util.ArrayList;

import interfaces.RegraFizzBuzz;

public class ValidadorDeRegrasFizzBuzz {
	ArrayList<RegraFizzBuzz> listaDeRegras;
	
	public ValidadorDeRegrasFizzBuzz() {
		this.listaDeRegras = new ArrayList<RegraFizzBuzz>();
		this.listaDeRegras.add(new FizzBuzz());
		this.listaDeRegras.add(new Fizz());
		this.listaDeRegras.add(new Buzz());
		this.listaDeRegras.add(new Padrao());
	}
	
	public void validar(int valor) {
		for (RegraFizzBuzz regraFizzBuzz : listaDeRegras) {
			if (regraFizzBuzz.validar(valor)) {
				regraFizzBuzz.executar(valor);
				break;
			}
		}
	}
}

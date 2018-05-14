package domain;

import interfaces.UserMessanger;

public class SystemMessanger implements UserMessanger{

	@Override
	public void writeLine(String message) {
		System.out.println(message);
	}

}

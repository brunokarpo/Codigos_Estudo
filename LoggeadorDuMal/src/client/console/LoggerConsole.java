package client.console;

import framework.Logger;

public class LoggerConsole implements Logger {

	@Override
	public void print(String mensagem) {
		System.out.println(mensagem);
	}

}

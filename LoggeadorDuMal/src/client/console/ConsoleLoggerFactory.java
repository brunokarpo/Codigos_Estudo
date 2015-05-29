package client.console;

import framework.Logger;
import framework.LoggerFactory;

public class ConsoleLoggerFactory extends LoggerFactory {

	@Override
	public Logger factoryLogger() {
		return new LoggerConsole();
	}

}

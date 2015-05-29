package client.file;

import framework.Logger;
import framework.LoggerFactory;

public class FileLoggerFactory extends LoggerFactory {

	@Override
	public Logger factoryLogger() {
		return new FileLogger();
	}

}

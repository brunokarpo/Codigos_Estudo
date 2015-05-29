import client.file.FileLoggerFactory;
import framework.LoggerFactory;


public class Principal {
	public static void main(String[] args) {
		LoggerFactory LOGGER = new FileLoggerFactory();

		LOGGER.log("Eu printo alguma coisa aqui!");
		LOGGER.log("Aqui eu printo mais uma coisa!");
		LOGGER.log("Aqui eu printo quantas coisas eu quiser");
	}
}

package framework;

import java.util.Date;

public abstract class LoggerFactory {

	public abstract Logger factoryLogger(); //Aqui estou delegando a criação da implementação pra a subclasse

	public void log(String message) {
		// O que eu sei é que a subclasse vai me devolver a implementação necessária;
		Logger log = factoryLogger();

		// E tudo que eu preciso utilizar é o serviço disponibilizado pela minha interface;
		// Qualquer que seja a implementação a mensagem sempre seguira esse padrão: hora + identificacao da Thread + mensagem
		log.print( new Date( System.currentTimeMillis() ).toString() + " - " + Thread.currentThread().getName() + " - " + message );
	}

}

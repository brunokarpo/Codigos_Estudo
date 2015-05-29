package client.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import framework.Logger;

public class FileLogger implements Logger {

	@Override
	public void print(String mensagem) {

		try {
			File arquivo = new File("arquivo.log");
			OutputStream os = new FileOutputStream(arquivo);
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);

			bw.append(mensagem);

			bw.close();
			osw.close();
			os.close();

			if(!arquivo.exists()) {
				arquivo.createNewFile();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

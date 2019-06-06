package ex24;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Oferece m�todos est�ticos de grava��o e leitura de objetos no disco
 * atrav�s de serializa��o.
 *
 * @author Hudson L. Cratz
 * @version 1.0 (junho-2019)
 */
public abstract class Arquivo {
	/**
	 * Realiza grava��o de um objeto no disco
	 * @param nomeArquivo nome do arquivo que ser� criado na grava��o
	 * @param objeto inst�ncia que ser� gravada no arquivo
	 * @exception IOException tratamento de erros na cria��o do arquivo ou grava��o
	 */
	static public void grava(String nomeArquivo, Object objeto) throws IOException {
		ObjectOutputStream buffer = new ObjectOutputStream(new FileOutputStream(nomeArquivo));
		buffer.writeObject(objeto.toString());
		buffer.close();
	}

	/**
	 * Realiza grava��o de um objeto num arquivo .txt
	 * @param objeto inst�ncia que ser� gravada no arquivo
	 * @exception IOException tratamento de erros na cria��o do arquivo ou grava��o
	*/
	public static void gravaTxt(Object objeto) throws IOException {
		BufferedWriter arqSaida;
		arqSaida = new BufferedWriter(new FileWriter("arquivo_de_saida.txt"));
		arqSaida.write(objeto.toString());
		arqSaida.close();
	}
	
	/**
	 * Realiza leitura de um objeto no arquivo
	 * @param nomeArquivo nome do arquivo a ser lido
	 * @return retorna uma inst�ncia da classe Object lida do arquivo
	 * @exception IOException tratamnto de erros na leitura do arquivo
	 * @exception ClassNotFoundException tratamento de erros na convers�o do objeto lido
	 */
	static public Object le(String nomeArquivo) throws IOException, ClassNotFoundException  {
		ObjectInputStream buffer = new ObjectInputStream(new FileInputStream(nomeArquivo));
		Object objeto = buffer.readObject();
		buffer.close();
		return objeto;
	}
}
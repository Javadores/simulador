package br.com.socket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketCliente {

	public static void main(String[] args) throws UnknownHostException,
			IOException {

		Socket cliente = new Socket("127.0.0.1", 12345);

		PrintStream saida = new PrintStream(cliente.getOutputStream());
		Scanner teclado = new Scanner(System.in);
		
		while (teclado.hasNextLine()) {
			
			saida.println(teclado.nextLine());
		}
		
		saida.close();
		teclado.close();

	}

}

package br.fai.projeto02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();
		
	}

	private void start() {
		
		System.out.println("Digite valor:");
		
		Scanner scanner = new Scanner(System.in);
		double valor = scanner.nextDouble();
		
		int valorComCast = (int) valor;
		
		System.out.println(" O valor com casas:" + valor + "| Valor inteiro:" + valorComCast);
		
		int novoValor = 10;
		double valorConvertido = novoValor;
		
		System.out.println("Novo:"+ novoValor +"| Valor convertido:"+ valorConvertido);
	}

}

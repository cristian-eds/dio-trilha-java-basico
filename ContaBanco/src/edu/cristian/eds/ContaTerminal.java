package edu.cristian.eds;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Bem vindo ao Nosso Banco! Para registrar sua conta digite as informações solicitadas:");
		System.out.print("Informe o número da conta: ");
		int numeroConta = scanner.nextInt();
		
		System.out.print("Informe a agência: ");
		String agencia = scanner.next();
		
		scanner.nextLine();
		System.out.print("Informe seu nome completo: ");
		String nomeCliente = scanner.nextLine();
		
		
		System.out.print("Informe o saldo na conta: ");
		double saldo = scanner.nextDouble();
		
		System.out.println("Olá "+ nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "+agencia+" ,"
				+ " conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque!");
		
	}
}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		System.out.println("Insira os Dados para a abertura de contas.");
		System.out.print("Número da conta: ");
		int NumeroConta = sc.nextInt();
		System.out.print("Nome do titular: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		System.out.print("Depósito inicial (s/n):");
		char depositoInicial = sc.next().charAt(0);
		if(depositoInicial == 's') {
			System.out.print("Entre com o valor inicial:");
			double valorInicial = sc.nextDouble();
			
			conta =  new Conta(NumeroConta, nomeTitular, valorInicial);
		}
		else {
			conta =  new Conta(NumeroConta, nomeTitular, 0.0);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.printf(conta + "%n" + "%n");
		
		System.out.print("Entre com o valor para depósito:");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Dados atualizados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com o valor para saque:");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println(conta);
		
		
		sc.close();
	}
	

}

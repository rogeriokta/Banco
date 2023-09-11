package com.emti;

public class ContaPoupanca extends Conta implements Rendimentos {

	public ContaPoupanca(int numero, int agencia, double saldo, Titular titular) {
		super(numero, agencia, saldo, titular);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	boolean sacar(double valor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean depositar(double valor) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void atualizar(double taxaRendimento) {
		// TODO Auto-generated method stub
		
	}

	
}

package com.emti;

public class ContaCorrente extends Conta {
	
	private double limite;
	private double taxa;

	public ContaCorrente(int numero, int agencia, double saldo, Titular titular) {
		super(numero, agencia, saldo, titular);
		// TODO Auto-generated constructor stub
	}
	
	
	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
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
	
}

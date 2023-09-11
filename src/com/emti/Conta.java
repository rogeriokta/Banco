package com.emti;

public abstract class Conta {
	private int numero;
	private int agencia;
	private Titular titular;
	protected double saldo;
	
	
	public Conta(int numero, int agencia, double saldo, Titular titular) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.titular = titular;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}
	
	abstract boolean sacar(double valor);
	
	abstract boolean depositar(double valor);
	
	public boolean transferir(double valor , Conta favorecido) {
		return true;
	}
	
}

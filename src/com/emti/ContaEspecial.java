package com.emti;

public class ContaEspecial extends ContaCorrente implements Rendimentos {

	public ContaEspecial(int numero, int agencia, double saldo, Titular titular) {
		super(numero, agencia, saldo, titular);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atualizar(double taxaRendimento) {
		// TODO Auto-generated method stub
		System.out.println("Ola");
	}

}

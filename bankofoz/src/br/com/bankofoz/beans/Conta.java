package br.com.bankofoz.beans;

/*
 * Polimorfismo: é o quarto pilar da OO. Que permite deixarmos métodos com o mesmo nome, realizando
 * operações distintas.
 * Dois tipos:
 * - Overload (sobrecarga) => os métodos estão na mesma classe
 * - Override (sobrescrita) => os métodos se encontram em classes diferentes
 */


public abstract class Conta {

	private short numero;
	private byte digito;
	private short agencia;
	private float saldo;
	private Cliente cliente;
	
	public float verificarSaldo() {
		return 0;
	}
	
	public boolean sacar(float valor) {
		if (valor>0 && valor<=saldo) {
			saldo-=valor;
			return true;
		}
		return false;
	}
	
	public boolean depositar(float valor) {
		if (valor>0) {
			saldo+=valor;
			return true;
		}
		return false;	
	}
	
	
	public short getNumero() {
		return numero;
	}
	public void setNumero(short numero) {
		this.numero = numero;
	}
	public byte getDigito() {
		return digito;
	}
	public void setDigito(byte digito) {
		this.digito = digito;
	}
	public short getAgencia() {
		return agencia;
	}
	public void setAgencia(short agencia) {
		this.agencia = agencia;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Conta(short numero, byte digito, short agencia, float saldo, Cliente cliente) {
		super();
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	public Conta() {
		super();
	}
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", digito=" + digito + ", agencia=" + agencia + ", saldo=" + saldo
				+ ", cliente=" + cliente + "]";
	}
	public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente) {
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}





























}

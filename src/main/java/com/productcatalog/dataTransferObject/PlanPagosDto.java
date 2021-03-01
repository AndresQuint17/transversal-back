package com.productcatalog.dataTransferObject;

public class PlanPagosDto {

	private int nroCuota;
	private double valorInicial;
	private double pagoCapital;
	private double intereses;
	private double valorCuotaMensual;
	private double saldo;
	
	public PlanPagosDto() {
	}

	public PlanPagosDto(int nroCuota, double valorInicial, double pagoCapital, double intereses,
			double valorCuotaMensual, double saldo) {
		this.nroCuota = nroCuota;
		this.valorInicial = valorInicial;
		this.pagoCapital = pagoCapital;
		this.intereses = intereses;
		this.valorCuotaMensual = valorCuotaMensual;
		this.saldo = saldo;
	}

	public int getNroCuota() {
		return nroCuota;
	}

	public void setNroCuota(int nroCuota) {
		this.nroCuota = nroCuota;
	}

	public double getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(double valorInicial) {
		this.valorInicial = valorInicial;
	}

	public double getPagoCapital() {
		return pagoCapital;
	}

	public void setPagoCapital(double pagoCapital) {
		this.pagoCapital = pagoCapital;
	}

	public double getIntereses() {
		return intereses;
	}

	public void setIntereses(double intereses) {
		this.intereses = intereses;
	}

	public double getValorCuotaMensual() {
		return valorCuotaMensual;
	}

	public void setValorCuotaMensual(double valorCuotaMensual) {
		this.valorCuotaMensual = valorCuotaMensual;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}

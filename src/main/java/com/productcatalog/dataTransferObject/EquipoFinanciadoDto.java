package com.productcatalog.dataTransferObject;

public class EquipoFinanciadoDto {
	
	private int cuotaMeses;
	private double pagoInicial;
	private double valorEquipo;
	private int descuento;
	
	public EquipoFinanciadoDto() {
		
	}

	public EquipoFinanciadoDto(int cuotaMeses, double pagoInicial, double valorEquipo, int descuento) {
		this.cuotaMeses = cuotaMeses;
		this.pagoInicial = pagoInicial;
		this.valorEquipo = valorEquipo;
		this.descuento = descuento;
	}
	
	public int getCuotaMeses() {
		return cuotaMeses;
	}
	public void setCuotaMeses(int cuotaMeses) {
		this.cuotaMeses = cuotaMeses;
	}
	public double getPagoInicial() {
		return pagoInicial;
	}
	public void setPagoInicial(double pagoInicial) {
		this.pagoInicial = pagoInicial;
	}
	public double getValorEquipo() {
		return valorEquipo;
	}
	public void setValorEquipo(double valorEquipo) {
		this.valorEquipo = valorEquipo;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
}

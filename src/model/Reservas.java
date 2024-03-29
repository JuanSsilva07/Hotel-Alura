package model;

import java.sql.Date;

public class Reservas {
	private Integer id;
	private Date dataEntrada;
	private Date dataSaida;
	private String valor;
	private String formaPagamento;
	
	
	
	public Reservas(Date dataEntrada, Date dataSaida, String valor, String formaPagamento) {
		super();
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.valor = valor;
		this.formaPagamento = formaPagamento;
	}
	
	public Reservas(Integer id, Date dataEntrada, Date dataSaida, String valor, String formaPagamento) {
		super();
		this.id = id;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.valor = valor;
		this.formaPagamento = formaPagamento;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public Date getDataEntrada() {
		return dataEntrada;
	}
	
	public Date getDataSaida() {
		return dataSaida;
	}
	
	public String getValor() {
		return valor;
	}
	
	public String getFormaPagamento() {
		return formaPagamento;
	}
}

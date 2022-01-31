package com.jh.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.jh.cursomc.domain.enums.EstadoPagamento;
@Entity
public class PagamentoComBoleto extends Pagamento{
	
	private static final long serialVersionUID = 1L;
	
	private Date datadeVencimento;
	private Date dataPagamento;
	
	

	public PagamentoComBoleto() {
		
	}



	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido,Date datadeVencimento, Date dataPagamento) {
		super(id, estado, pedido);
		this.datadeVencimento = datadeVencimento;
		this.dataPagamento = dataPagamento;
	}



	public Date getDatadeVencimento() {
		return datadeVencimento;
	}



	public void setDatadeVencimento(Date datadeVencimento) {
		this.datadeVencimento = datadeVencimento;
	}



	public Date getDataPagamento() {
		return dataPagamento;
	}



	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	
}

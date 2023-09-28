package org.cibertec.edu.pe.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Compra")
public class Compra {

	@Id
	private String compraId;
	private BigDecimal subTotal;
	private BigDecimal precioEnvio;
	private BigDecimal descuento;
	private BigDecimal totalAPagar;
	
	public Compra() {
	}

	public Compra(String compraId, BigDecimal subTotal, BigDecimal precioEnvio, BigDecimal descuento,
			BigDecimal totalAPagar) {
		this.compraId = compraId;
		this.subTotal = subTotal;
		this.precioEnvio = precioEnvio;
		this.descuento = descuento;
		this.totalAPagar = totalAPagar;
	}
	
	
	
}

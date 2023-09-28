package org.cibertec.edu.pe.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Carrito")
public class Carrito {
	@Id
	private String item;
	private String articulo;
	private String descripcion;
	private BigDecimal precio;
	private int cantidad;
	private BigDecimal total;
	

	public Carrito() {
	}


	public Carrito(String item, String articulo, String descripcion, BigDecimal precio, int cantidad, BigDecimal total) {
		this.item = item;
		this.articulo = articulo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidad = cantidad;
		this.total = total;
	}


	public String getItem() {
		return item;
	}


	public void setItem(String item) {
		this.item = item;
	}


	public String getArticulo() {
		return articulo;
	}


	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public BigDecimal getPrecio() {
		return precio;
	}


	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public BigDecimal getTotal() {
		return total;
	}


	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	
	
	
}

package org.cibertec.edu.pe.service;

import java.util.List;

import org.cibertec.edu.pe.interfaceService.ICompraService;
import org.cibertec.edu.pe.interfaces.ICompra;
import org.cibertec.edu.pe.modelo.Carrito;
import org.cibertec.edu.pe.modelo.Compra;
import org.springframework.beans.factory.annotation.Autowired;

public class CompraService implements ICompraService{

	
	@Autowired
	private ICompra compra;
	
	@Override
	public List<Compra> Listar() {
		return (List<Compra>)compra.findAll();
	}

}

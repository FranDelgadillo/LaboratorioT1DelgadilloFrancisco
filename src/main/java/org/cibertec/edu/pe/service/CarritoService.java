package org.cibertec.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaceService.ICarritoService;
import org.cibertec.edu.pe.interfaces.ICarrito;
import org.cibertec.edu.pe.modelo.Carrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarritoService implements ICarritoService{

	@Autowired
	private ICarrito carrito;
	
	@Override
	public List<Carrito> Listar() {
		return (List<Carrito>)carrito.findAll();
	}

	@Override
	public Optional<Carrito> Buscar(String item) {
		return carrito.findById(item);
	}

	@Override
	public int Guardar(Carrito ObjC) {
		int rpta = 0;
		Carrito Obj = carrito.save(ObjC);
		if(!Obj.equals(null))rpta = 1;
		return rpta;
	}

	@Override
	public void Eliminar(String item) {
		carrito.deleteById(item);
	}

}

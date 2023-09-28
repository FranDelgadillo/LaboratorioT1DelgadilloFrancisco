package org.cibertec.edu.pe.interfaceService;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.modelo.Carrito;

public interface ICarritoService {
	public List<Carrito> Listar();
	public Optional<Carrito> Buscar(String item);
	public int Guardar(Carrito ObjC);
	public void Eliminar(String item);
}

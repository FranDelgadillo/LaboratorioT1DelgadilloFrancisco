package org.cibertec.edu.pe.controller;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaceService.ICarritoService;
import org.cibertec.edu.pe.modelo.Carrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class CarritoController {

	@Autowired
	private ICarritoService servicio;
	
	// Método para Listar
		@GetMapping("/listar")	// http://localhost:8080/listar
		public String Listado(Model m) {
			List<Carrito> lista = servicio.Listar();
			m.addAttribute("carrito", lista);
			return "listado";	// listado.html
		}
		
		//Método para buscar
		@GetMapping("/compra/{item}") //http://localhost:8080/ver/1
		public String Buscar(@PathVariable String item,Model m) {
			Optional<Carrito> ObjC = servicio.Buscar(item);
			m.addAttribute("carrito", ObjC);		
			return "compra"; //compra.html
		}
		
		//Método para insertar
		@GetMapping("/nuevo")
		public String agregar(Model m) {
			m.addAttribute("colaborador", new Carrito());
			return "form"; //form.html
		}
		
		//Método para grabar
		@PostMapping("/guardar")
		public String guardar(@Validated Carrito ObjC, Model m) {
			servicio.Guardar(ObjC);
			return "redirect:/listar";
		}
		
		//Método para editar
		@GetMapping("/editar/{item}")
		public String editar(@PathVariable String item, Model m) {
			Optional<Carrito> ObjC = servicio.Buscar(item);
			m.addAttribute("carrito", ObjC);
			return "form"; //form.html
		}
		
		//Método para eliminar
		@GetMapping("/eliminar/{item}")
		public String eliminar(@PathVariable String item, Model m) {
			servicio.Eliminar(item);
			return "redirect:/listado"; //listado.html
		}
	
}

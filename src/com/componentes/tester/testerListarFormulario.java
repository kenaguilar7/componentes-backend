package com.componentes.tester;

import java.util.List;

import com.componentes.controlador.FormularioController;
import com.componentes.entidades.Formulario;
import com.componentes.entidades.Item;
import com.componentes.entidades.Seccion;
import com.componentes.entidades.Usuario;

public class testerListarFormulario {

	public static void main(String[] args) {
	

		GetOne(); 
		//GetAll(); 

	}
	
	public static void GetAll() {
		
		Usuario user = new Usuario(); 
		
		user.setNombre("Pepe");
		user.setCorreo("pepe@gmail.com");
		user.setConstrania("1234");
		user.setId(1);
		
		FormularioController formController = new FormularioController(); 
		
		List<Formulario> retorno = formController.Get(user); 
		
		for(Formulario form : retorno) {
			
			System.out.println(form.getNombre());
			System.out.println("**************************");
			for(Seccion seccion: form.GetSecciones()) {
				System.out.println(seccion.getPregunta());
				for(Item item : seccion.getItem()) {
					System.out.println(item.getDefaultName());
					
				}
				System.out.println("---------------------------------------");
			}
		}
		
		
	}
	
	public static void GetOne() {
	
		FormularioController formController = new FormularioController(); 
		
		Formulario form = formController.Get(1);
		
		System.out.println(form.getNombre());
		System.out.println("**************************");
		for(Seccion seccion: form.GetSecciones()) {
			System.out.println(seccion.getPregunta());
			for(Item item : seccion.getItem()) {
				System.out.println(item.getDefaultName());
				
			}
			System.out.println("---------------------------------------");
		}
		
		
		
	}
	

}

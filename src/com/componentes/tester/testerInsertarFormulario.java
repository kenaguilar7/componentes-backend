package com.componentes.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.componentes.dao.FormularioDAO;
import com.componentes.dao.IDao;
import com.componentes.dao.ItemDAO;
import com.componentes.dao.SeccionDAO;
import com.componentes.dao.UsuarioDAO;
import com.componentes.entidades.EItem;
import com.componentes.entidades.Formulario;
import com.componentes.entidades.Item;
import com.componentes.entidades.Seccion;
import com.componentes.entidades.Usuario;
import com.componentes.logica.UsuarioLog;

public class testerInsertarFormulario {

	public static void main(String[] args) {
	

			FormularioDAO fD = new FormularioDAO();
			UsuarioDAO uD = new UsuarioDAO();
			SeccionDAO sD = new SeccionDAO();
			ItemDAO iD = new ItemDAO();
			/*
			Usuario u = new Usuario();
			
			u = (Usuario)uD.login("Juan", "123");
			
			for (Formulario f : fD.buscarFormulariosUsuario(u)) {
				f.GetSecciones().size();
				
				System.out.println(f.getNombre());
				
				for (Seccion s : f.GetSecciones()) {
					
					System.out.println(s.getPregunta());
					
					for (Item i : iD.itemsEnSecciones(s)) {
						
						System.out.println(i.getDefaultName());
					
					}
					
				}
				
			}
			*/
			
			List<Formulario> formularios = new ArrayList<>();
			List<Seccion> secciones = new ArrayList<>();
			List<Item> items = new ArrayList<>();
					
			Usuario us = (Usuario)uD.login("Anthony3064", "89603146");
			
			Formulario f = new Formulario();
			f.setNombre("Prueba guardar");
			f.setFavorito(false);
		
			Seccion s = new Seccion();
			s.setFormularioPadre(f);
			s.setPregunta("lhglkhgkaglhkdhgjaksdg");
		
			for	(int i = 0 ; i < 4 ; i++) {
				
				Item it = new Item();
				it.setSeccion(s);
				it.setDefaultName("Opcion " + i);
				it.setTipoDato(EItem.RadioButton);
				items.add(it);
			}
			
			s.SetItem(items);
			
			secciones.add(s);
			
			f.SetSecciones(secciones);
			
			formularios.add(f);

			
			UsuarioLog p = new UsuarioLog();
	
			p.guardarFormularioUsuario(formularios, us);
	}
	
	public static List<Formulario> GetDummyForms(Usuario usurio){
		
		
		List<Formulario> retorno = new ArrayList<>(); 
		System.out.print("Creando la lista de formulario");
		
		
		for(int i = 0; i < 100; i++) {
			Formulario frm = new Formulario(); 
			frm.setNombre("formulario de prueba"+i);
			frm.setUsuarioPadre(usurio);
			System.out.println("\n"+frm.getNombre());
			//por cada formulario creado se agrega una lista de secciones
			//frm.setId(i);
			frm.SetSecciones(GetDummySeccion(frm));
			
			retorno.add(frm); 
		}
		
		
		return retorno; 
	}
	
	public static List<Seccion> GetDummySeccion(Formulario frm){
		List<Seccion> retorno = new ArrayList<>(); 
		
		for(int i = 0; i < 3; i++) {
			
			Seccion sccn = new Seccion(); 
			sccn.setFormularioPadre(frm);
			sccn.setPregunta("pregunta de prueba"+i);
			
			System.out.println(sccn.getPregunta());
			//Agrega los items
			
			sccn.SetItem(GetDummyItems(sccn));
			retorno.add(sccn); 
		}
		
		return retorno; 
	}
	
	public static List<Item> GetDummyItems(Seccion scctn){
		List<Item> retorno = new ArrayList<>();  
		///Crear aleatoreamente* un tipo de item
		//Este  random lo uso para generar el tipo de item
		Random r = new Random();
		int valorDado = r.nextInt(2);
		 
		//si el item = 0 then textobox
		if(valorDado == 0) {
			
			retorno.add(GetTextox(scctn));
			System.out.println(retorno.get(0).getDefaultName()+" valor tbf");
		}else {
			
			retorno = GetTextoxs(scctn); 
		}
		
		
		return retorno; 
	}
	
	//va a ser un texbox entonces solo retorna uno
	public static Item GetTextox(Seccion seccion) {
		
		Item retorno  = new Item(); 
		retorno.setDefaultName("dibujame como un cuadro de texto");
		retorno.setSeccion(seccion);
		retorno.setTipoDato(EItem.TextBox);
		
		
		return retorno; 
	}
	
	public static List<Item> GetTextoxs(Seccion seccion) {
		
		List<Item> retorno = new ArrayList<>(); 
		
		for(int i = 0; i < 3; i++) {
		
			Item item  = new Item(); 
			item.setDefaultName("opcion radioButton "+i);
			item.setSeccion(seccion);
			item.setTipoDato(EItem.RadioButton);
			retorno.add(item);
			System.out.println(item.getDefaultName());
		}
		
		
		
		return retorno; 
	}
	

}


















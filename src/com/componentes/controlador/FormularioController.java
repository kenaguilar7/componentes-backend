package com.componentes.controlador;

import java.util.ArrayList;
import java.util.List;

import com.componentes.dao.FormularioDAO;
import com.componentes.entidades.Formulario;
import com.componentes.entidades.Usuario;
import com.componentes.logica.FormularioCL;

public class FormularioController  {
	private FormularioCL formularioCL = new FormularioCL();

	public void Insert(Formulario Formulario) {
		///Revisar esto 
      formularioCL.insertFormulario(Formulario);
				
	}

	
	public void Update(int id) {
		// TODO Auto-generated method stub
		
	}

	
	public void Delete(int id) {
		// TODO Auto-generated method stub
		
	}

	
	public Formulario Get(int id) {
	
		return formularioCL.Get(id);
		
	}

	
	public List<Formulario> Get() {
		FormularioDAO formularioDao = new FormularioDAO();
		
		return (List<Formulario>) formularioDao.GetList(); 
		
	}
	///mientras implementamos la api se van a usar estos 3
	public List<Formulario> Get(Usuario usuario) {
		
		
		
		return (List<Formulario>) formularioCL.getFormulario(usuario); 
		
	}
	
}




















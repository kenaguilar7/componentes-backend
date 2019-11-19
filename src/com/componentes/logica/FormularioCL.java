package com.componentes.logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

import com.componentes.dao.FormularioDAO;
import com.componentes.entidades.EItem;
import com.componentes.entidades.Formulario;
import com.componentes.entidades.Item;
import com.componentes.entidades.Seccion;
import com.componentes.entidades.Usuario;

public class FormularioCL {

	//Va la logica de negocio
	private FormularioDAO formDao = new FormularioDAO();  
			
	public List<Formulario> getFormulario(Usuario usuario){
		if(usuario == null) {
			return new ArrayList<Formulario>(); 
		}else
		return formDao.GetList(usuario); 
	}
	
	public void insertFormulario(Formulario formulario) {
		formDao.Insert(formulario);
	}
	public Formulario Get(int id) {
	
		return formDao.Get(id); 
		
	}


}

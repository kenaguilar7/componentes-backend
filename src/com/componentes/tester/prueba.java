package com.componentes.tester;

import java.util.ArrayList;
import java.util.List;

import com.componentes.dao.UsuarioDAO;
import com.componentes.entidades.Usuario;
import com.componentes.entidades.Formulario;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuario usuario = new Usuario();
		
		UsuarioDAO dao = new UsuarioDAO();

		usuario = (Usuario) dao.login("Anthony3064", "89603146");
		
		List<Formulario> lista = new ArrayList<>();
		
		for	(int i = 0 ; i < 3 ; i++) {
			
			Formulario f = new Formulario();
			
			f.setNombre("AAAA" + i);
			f.setUsuarioPadre(usuario);
			lista.add(f);
			
		}
		
		
		usuario.setFormulario(lista);
		
		dao.actualizar(usuario);
		
	}

}

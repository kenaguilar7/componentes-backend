package com.componentes.tester;

import com.componentes.dao.UsuarioDAO;
import com.componentes.entidades.Usuario;

public class UsuarioTester {

	public static void main(String[] args) {
		
		UsuarioDAO dao = new UsuarioDAO();
		
		Usuario usuario = new Usuario();
		usuario.setNombre("Andre");
		usuario.setCorreo("Anthonyestiven@gmail.com");
		usuario.setConstrania("123456");
		
		dao.Insert(usuario);
		
	}

}

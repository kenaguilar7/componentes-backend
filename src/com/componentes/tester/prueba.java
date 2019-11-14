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

		usuario.setNombre("Alejandro Murillo");
		usuario.setConstrania("123456");
		usuario.setCorreo("lkhalfkjsdhflkasd");
		usuario.setId(2);

		dao.Insert(usuario);
		
		
		
	}

}

package com.componentes.tester;

import com.componentes.dao.UsuarioDAO;
import com.componentes.entidades.Usuario;

public class UsuarioTester {

	public static void main(String[] args) {
		
		UsuarioDAO dao = new UsuarioDAO();
		
		dao.Get(1);
		
		
	}

}

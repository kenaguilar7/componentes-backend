<<<<<<< HEAD
package com.componentes.logica;

import java.util.List;

import com.componentes.dao.UsuarioDAO;
import com.componentes.entidades.Formulario;
import com.componentes.entidades.Usuario;

public class UsuarioLog {

	public void guardarFormularioUsuario(List<Formulario> formularios, Usuario usuario) {
		
		
		UsuarioDAO uD = new UsuarioDAO();
		Usuario usuarioActualizar = null;
		
		usuarioActualizar = (Usuario)uD.getUsuario(usuario);
		
		for(Formulario f : formularios) {
			f.setUsuarioPadre(usuarioActualizar);
		}
		
		usuarioActualizar.setFormulario(formularios);
		
		uD.Update(usuarioActualizar);
		
	}
	
	
}
=======
package com.componentes.logica;

import java.util.List;

import com.componentes.dao.UsuarioDAO;
import com.componentes.entidades.Formulario;
import com.componentes.entidades.Usuario;

public class UsuarioLog {

	public void guardarFormularioUsuario(List<Formulario> formularios, Usuario usuario) {
		
		
		UsuarioDAO uD = new UsuarioDAO();
		Usuario usuarioActualizar = null;
		
		usuarioActualizar = (Usuario)uD.getUsuario(usuario);
		
		for(Formulario f : formularios) {
			f.setUsuarioPadre(usuarioActualizar);
		}
		
		usuarioActualizar.setFormulario(formularios);
		
		uD.Update(usuarioActualizar);
		
	}
	
	
}
>>>>>>> d1360952128d92123a6f63b6dda7e92abf197a97

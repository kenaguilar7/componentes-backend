package com.componentes.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;

import com.componentes.entidades.Usuario;

public class UsuarioDAO<Usuario> extends Servicio implements IDao<Usuario> {

	
	@Override
	public void Insert(Usuario t) { 
		
		this.startEntityManagerFactory();
		this.em.getTransaction().begin();
		
		this.em.persist((Usuario)t);
		
		this.em.getTransaction().commit();
		this.stopEntityManagerFactory();
		
	}

	@Override
	public void Update(Usuario t) {
		
	}

	@Override
	public void Delete(Usuario t) {
		
	}

	@Override
	public Usuario Get(int id) {
		
		return null;
	}
	
	public Usuario login(String nombre, String contrasenna){
		Usuario usuario = null;
		
		try {
		this.startEntityManagerFactory();	
		String parametro = nombre;
		String parametro2 = contrasenna;
		
		usuario = (Usuario)em.createNamedQuery("Usuario.Logear").setParameter("nombreParam", parametro).setParameter("constraniaParam", parametro2).getSingleResult();
		
		if	(usuario != null) {
			
			return usuario;
			
		}
		}catch (Exception e) {
			System.out.println("No hay registro");
		}finally {
			
			this.stopEntityManagerFactory();
			
		} 
		
		
		return usuario;	
	}
	
	public Usuario getUsuario(int id,Usuario u) {
		
		this.startEntityManagerFactory();
		Usuario userLeido = (Usuario) em.find(u.getClass(), new Integer(id));
		this.stopEntityManagerFactory();
		return (Usuario) userLeido; 
		
	}
	

	@Override
	public List<Usuario> GetList() {
		
		this.startEntityManagerFactory();
		
		List<Usuario> listaRetorno = new ArrayList<>();
		
		listaRetorno = (List<Usuario>)em.createNamedQuery("Usuario.GetAll").getResultList();
		
		this.stopEntityManagerFactory();
		
		return listaRetorno;
		
	}
	

	public List<Usuario> getListUsuario(Usuario u){
	
		
		this.startEntityManagerFactory();
		
		this.em.getTransaction().begin();
		

		TypedQuery<Usuario> query = (TypedQuery<Usuario>)em.createNamedQuery("Usuario.findPK", u.getClass());
		this.stopEntityManagerFactory();

		
		return query.getResultList();

	}
	
	
}
package com.componentes.dao;

import java.util.List;

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
	
	public Usuario getUsuario(int id,Usuario u) {
		
		
		
		this.startEntityManagerFactory();
		Usuario userLeido = (Usuario) em.find(u.getClass(), new Integer(id));
		this.stopEntityManagerFactory();
		return (Usuario) userLeido; 
		
	}

	@Override
	public List<Usuario> GetList() {
		
		return null;
	}

	public List<Usuario> getListUsuario(Usuario u){
	
		
		this.startEntityManagerFactory();
		
		this.em.getTransaction().begin();
		

		TypedQuery<Usuario> query = (TypedQuery<Usuario>)em.createNamedQuery("Usuario.findPK", u.getClass());
		this.stopEntityManagerFactory();

		
		return query.getResultList();

	}
	
	
}
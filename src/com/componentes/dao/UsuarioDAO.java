package com.componentes.dao;

import java.util.List;

public class UsuarioDAO<Usuario> extends Servicio implements IDao<Usuario> {

	@Override
	public void Insert(Usuario t) {
		try {
		System.out.println("Entro......");
		this.startEntityManagerFactory();
		this.em.getTransaction().begin();
		
		this.em.persist((Usuario)t);
		
		this.em.getTransaction().commit();
		this.stopEntityManagerFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Update(Usuario t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Delete(Usuario t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario Get(int id) {

		
		return null;
	}

	@Override
	public List<Usuario> GetList() {
		// TODO Auto-generated method stub
		return null;
	}

}

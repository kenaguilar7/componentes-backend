package com.componentes.dao;

import java.util.List;

import com.componentes.entidades.Seccion;

public class SeccionDAO extends Servicio implements IDao {

	@Override
	public void Insert(Object t) {
		
		Seccion secc = new Seccion();
		
		secc = (Seccion) t;
		
		this.startEntityManagerFactory();
		
		this.em.getTransaction().begin();
		
		this.em.persist(secc);
		
		this.em.getTransaction().commit();
		
		this.stopEntityManagerFactory();
		
		
	}

	@Override
	public void Update(Object t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Delete(Object t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object Get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List GetList() {
		// TODO Auto-generated method stub
		return null;
	}

}

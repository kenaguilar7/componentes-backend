package com.componentes.dao;

import java.util.List;

import com.componentes.entidades.Item;
import com.componentes.entidades.Seccion;

public class ItemDAO extends Servicio implements IDao {

	@Override
	public void Insert(Object t) {
		
		Item item = new Item();
		
		item = (Item) t;
		
		
		this.startEntityManagerFactory();
		
		this.em.getTransaction().begin();
		
		this.em.persist(item);
		
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

	public List<Item> itemsEnSecciones(Seccion seccionPadre){
		
		List<Item> listaRetorno = null;
		
		try {
			this.startEntityManagerFactory();
			
			listaRetorno = (List<Item>)em.createNamedQuery("Item.ItemEnSecciones").setParameter("seccionPadreParam", seccionPadre).getResultList();
			
			if(listaRetorno.size() > 0) {
				
				return listaRetorno;
				
			}
			
			
		} catch (Exception e) {
			System.out.println("Sin registros.");
		}finally {
			
			this.stopEntityManagerFactory();
			
		}
		
		return listaRetorno;
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

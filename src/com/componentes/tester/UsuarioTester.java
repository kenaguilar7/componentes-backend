package com.componentes.tester;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import com.componentes.dao.UsuarioDAO;
import com.componentes.entidades.Usuario;
import com.ulatina.entidad.DemoPersona;

public class UsuarioTester {


	private static EntityManagerFactory entityManagerFactory = null;
	private static EntityManager em = null;


	public static void main(String[] args) {
			
			/*
			Usuario u = new Usuario();
			u.setNombre("Anthony");
			u.setConstrania("qwop123!");
			u.setCorreo("cotoandres2018@gmail.com");
			
			
			em.getTransaction().begin();
			
			em.persist(u);
			
			em.getTransaction().commit();
		
			*/
/*			
			Usuario us = new Usuario();
			
			System.out.println(" " + findPK().getNombre());

			System.out.println(" " + findPK().getConstrania());
			
			UsuarioDAO<Usuario> ud = new UsuarioDAO<Usuario>();
			
			System.out.println(ud.getUsuario(1, us).getNombre());
			

			System.out.println(ud.getUsuario(1, us).getConstrania());
	*/
			
			UsuarioDAO uDao = new UsuarioDAO();
		
			System.out.println(((Usuario)uDao.login("Anthony306", "89603146")));
			
		


	}
	
	public static Usuario findPK() throws Exception {
		Usuario usuario = (Usuario)em.createNamedQuery("Usuario.findPK").
											setParameter("idParam", new Integer("1")).
											getSingleResult();
		return usuario;
	}
	
public static Usuario buscarPersona() throws Exception{
		
		String parametro = JOptionPane.showInputDialog("Nombre");
		String parametro2 = JOptionPane.showInputDialog("Contrasenna");
		
		Usuario usuario = (Usuario)em.createNamedQuery("Usuario.Logear").setParameter("nombreParam", parametro).setParameter("constraniaParam", parametro2).getSingleResult();
		return usuario;
		
	}
	
	
	public static void startEntityManagerFactory() {
		if (entityManagerFactory == null) {
			try {
				entityManagerFactory = Persistence
						.createEntityManagerFactory("Componentes");
				em = entityManagerFactory.createEntityManager();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void stopEntityManagerFactory() {
		if (entityManagerFactory != null) {
			if (entityManagerFactory.isOpen()) {
				try {
					entityManagerFactory.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			em.close();
			entityManagerFactory = null;
		}
	}
   
   
}


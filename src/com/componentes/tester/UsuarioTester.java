<<<<<<< HEAD
package com.componentes.tester;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import com.componentes.dao.FormularioDAO;
import com.componentes.dao.ItemDAO;
import com.componentes.dao.SeccionDAO;
import com.componentes.dao.UsuarioDAO;
import com.componentes.entidades.Formulario;
import com.componentes.entidades.Item;
import com.componentes.entidades.Seccion;
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
			SeccionDAO sD = new SeccionDAO();
			ItemDAO iD = new ItemDAO();
			
			FormularioDAO fD = new FormularioDAO();
			
			for (Formulario frm : fD.buscarFormulariosUsuario(((Usuario)uDao.login("Anthony3064", "123456")))) {
				System.out.println(frm.getNombre());
			
				for (Seccion s : frm.GetSecciones()) {
					System.out.println(s.getPregunta());
					for (Item item : s.getItem()) {
						System.out.println(item.getDefaultName());
					}
				}
				
			}
			
			fD.stopEntityManagerFactory();
			
		
			System.out.println(fD.GetList());
	
			
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
				System.out.println("Si esta");
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

=======
package com.componentes.tester;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import com.componentes.dao.FormularioDAO;
import com.componentes.dao.ItemDAO;
import com.componentes.dao.SeccionDAO;
import com.componentes.dao.UsuarioDAO;
import com.componentes.entidades.Formulario;
import com.componentes.entidades.Item;
import com.componentes.entidades.Seccion;
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
			SeccionDAO sD = new SeccionDAO();
			ItemDAO iD = new ItemDAO();
			
			FormularioDAO fD = new FormularioDAO();
			
			for (Formulario frm : fD.buscarFormulariosUsuario(((Usuario)uDao.login("Anthony3064", "123456")))) {
				System.out.println(frm.getNombre());
			
				for (Seccion s : frm.GetSecciones()) {
					System.out.println(s.getPregunta());
					for (Item item : s.getItem()) {
						System.out.println(item.getDefaultName());
					}
				}
				
			}
			
			fD.stopEntityManagerFactory();
			
		
			System.out.println(fD.GetList());
	
			
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
				System.out.println("Si esta");
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

>>>>>>> d1360952128d92123a6f63b6dda7e92abf197a97

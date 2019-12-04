package com.componentes.entidades;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity
@NamedQueries(value = {
		
		@NamedQuery(
				name = "Usuario.Logear", 
				query = "SELECT u FROM Usuario u WHERE u.Nombre = :nombreParam AND u.Constrania = :constraniaParam"),
		@NamedQuery(
				name = "Usuario.GetAll", 
				query = "SELECT u FROM Usuario u"),
		@NamedQuery(
				name = "Usuario.GetUsuario", 
				query = "SELECT u FROM Usuario u WHERE u =  :usuarioParam")
})

@NamedNativeQueries({
	@NamedNativeQuery(
			name="Usuario.findAll", 
			query="SELECT * FROM Usuario", 
			resultClass=Usuario.class), 
	@NamedNativeQuery(
			name="Usuario.findAllSQLWithParam", 
			query="SELECT * FROM Usuario WHERE Id = :idParam ", 
			resultClass=Usuario.class)			
})

public class Usuario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private String Nombre;
	private String Correo;
	private String Constrania;
	        
	@OneToMany(mappedBy="UsuarioPadre",cascade= CascadeType.ALL)
	//@JoinColumn(name="IdFormulario")
	//@IndexColumn(name="Id")
	private List<Formulario> Formularios;
	private static final long serialVersionUID = 1L;
	
	
	public Usuario() {
		super();
	}   
	public Integer getId() {
		return this.Id;
	}

	public void setId(Integer id) {
		this.Id = id;
	}   
	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public String getConstrania() {
		return Constrania;
	}
	public void setConstrania(String constrania) {
		Constrania = constrania;
	}
	public List<Formulario> GetFomurlarios(){
		return this.Formularios; 
	}
	
	public void setFormulario(List<Formulario> listas) {
		this.Formularios = listas; 
	}
	
}

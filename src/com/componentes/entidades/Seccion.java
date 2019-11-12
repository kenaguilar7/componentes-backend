package com.componentes.entidades;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.IndexColumn;

/**
 * Entity implementation class for Entity: Seccion
 *
 */
@Entity

public class Seccion implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private String Pregunta;
    //formulario
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="fk_Formulario")
	private Formulario FormularioPadre; 
    //items
	@OneToMany(mappedBy="SeccionPadre",cascade= CascadeType.ALL)
	//@JoinColumn(name="idSeccion"
	//@IndexColumn(name="Id")
	private List<Item> Items;
	private static final long serialVersionUID = 1L;

	public Seccion() {
		super();
	}   
	public Integer getId() {
		return this.Id;
	}

	public void setId(Integer Id) {
		this.Id = Id;
	}   
	public String getPregunta() {
		return this.Pregunta;
	}

	public void setPregunta(String Pregunta) {
		this.Pregunta = Pregunta;
	}
	public Formulario getFormularioPadre() {
		return FormularioPadre;
	}
	public void setFormularioPadre(Formulario formularioPadre) {
		FormularioPadre = formularioPadre;
	}
   
	public List<Item> getItem() {
		return Items;
	}
	public void SetItem(List<Item> items) {
		this.Items = items;
	}
   
	
	
	
}

package com.componentes.entidades;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * Entity implementation class for Entity: Item
 *
 */
@Entity
@NamedQueries(value = {
		
		@NamedQuery(
				name = "Item.ItemEnSecciones", 
				query = "SELECT i FROM Item i WHERE i.SeccionPadre = :seccionPadreParam")
})
public class Item implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	//Nombre por defecto  por ejemplo hombre, mujer;  en el caso de los radiobuttons
	private String DefaultName;
	private EItem TipoDato; 
	//Secciones
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="fk_Item")
	private Seccion SeccionPadre;
	private static final long serialVersionUID = 1L;

	public Item() {
		//super();
	}   
	public Integer getId() {
		return this.Id;
	}

	public void setId(Integer Id) {
		this.Id = Id;
	}   
	public String getDefaultName() {
		return this.DefaultName;
	}

	public void setDefaultName(String DefaultName) {
		this.DefaultName = DefaultName;
	}
	public Seccion getSeccion() {
		return this.SeccionPadre;
	}

	public void setSeccion(Seccion seccion) {
		this.SeccionPadre = seccion;
	}
	public EItem getTipoDato() {
		return TipoDato;
	}
	public void setTipoDato(EItem tipoDato) {
		TipoDato = tipoDato;
	}
   
}

package com.componentes.controlador;

import java.util.List;

public interface IController <T> {
	
	public void Insert(T t);
	
	public void Update(int id);
	
	public void Delete(int id);
	
	public T Get(int id);
	
	public List<T> Get();
}

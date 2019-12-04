package com.componentes.dao;

import java.util.List;

public interface IDao<T> {

	public void Insert(T t);
	public void Update(T t);
	public void Delete(T t);
	public T Get(int id);
	public List<T> GetList(); 

}

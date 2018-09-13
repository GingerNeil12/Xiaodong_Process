package com.nearlam.services;

public interface IUpdateService<T extends Object> {
	public boolean update(T entity);
}

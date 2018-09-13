package com.nearlam.services;

public interface IAddService<T extends Object> {
	public boolean add(T entity);
}

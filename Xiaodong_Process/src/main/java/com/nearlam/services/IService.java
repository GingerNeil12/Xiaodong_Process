package com.nearlam.services;

import java.util.List;

public interface IService<T extends Object> {
	public List<T> getAll();
	public T getById(int id);
}

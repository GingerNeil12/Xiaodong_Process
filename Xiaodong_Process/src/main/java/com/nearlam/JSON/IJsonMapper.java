package com.nearlam.JSON;

import java.util.List;

public interface IJsonMapper<T extends Object> {
	public T deserialize(String json);
	public List<T> deserializeList(String json);
	public String serialize(T obj);
}

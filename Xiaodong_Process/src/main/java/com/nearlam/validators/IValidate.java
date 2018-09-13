package com.nearlam.validators;

import java.util.List;

public interface IValidate<T extends Object> {
	public List<String> getErrors();
	public int getErrorCount();
	public void setEntity(T entity);
	public void validate();
}

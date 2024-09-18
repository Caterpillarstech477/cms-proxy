package com.andromeda.cms.model;

import com.andromeda.commons.model.BaseModel;

public class AppJson extends BaseModel{
	private String version;
	private String modelType;
	private Object model;
	
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getModelType() {
		return modelType;
	}
	public void setModelType(String modelType) {
		this.modelType = modelType;
	}
	public Object getModel() {
		return model;
	}
	public void setModel(Object model) {
		this.model = model;
	}
	
	
}

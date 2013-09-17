package com.jnexhelp.model;

public class ServiceModel {
	
	public String capabilities;
	public String serviceName;
	
	public ServiceModel(String serviceName, String capabililities){
		this.serviceName = serviceName;
		this.capabilities = capabililities;
	}

	public String isCapabilities() {
		return capabilities;
	}

	public void setCapabilities(String capabilities) {
		this.capabilities = capabilities;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
}

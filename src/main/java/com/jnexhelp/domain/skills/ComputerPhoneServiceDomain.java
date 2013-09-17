package com.jnexhelp.domain.skills;


public class ComputerPhoneServiceDomain {
	
	private Integer id;
	private String userId;
	private boolean phoneRepair;
	private boolean phoneSoftware;
	private boolean laptopRepair;
	private boolean computerRepair;
	private boolean softwareInstallation;
	private boolean softwareMaintain;
	private boolean softwareUpgrade;
	private boolean networkRepair;
	private boolean cameraRepair;

	public ComputerPhoneServiceDomain(){
		
	}
	
	public ComputerPhoneServiceDomain(Integer id,String userId, boolean phoneRepair,
			boolean phoneSoftware, boolean laptopRepair, boolean computerRepair,
			boolean softwareInstallation, boolean softwareMaintain, boolean softwareUpgrade,
			boolean networkRepair, boolean cameraRepair){
		
		this.id = id;
		this.userId = userId;
		this.phoneRepair = phoneRepair;
		this.phoneSoftware = phoneSoftware;
		this.laptopRepair = laptopRepair;
		this.computerRepair = computerRepair;
		this.softwareInstallation = softwareInstallation;
		this.softwareMaintain = softwareMaintain;
		this.softwareUpgrade = softwareUpgrade;
		this.networkRepair = networkRepair;
		this.cameraRepair = cameraRepair;

	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public boolean isPhoneRepair() {
		return phoneRepair;
	}
	public void setPhoneRepair(boolean phoneRepair) {
		this.phoneRepair = phoneRepair;
	}
	public boolean isPhoneSoftware() {
		return phoneSoftware;
	}
	public void setPhoneSoftware(boolean phoneSoftware) {
		this.phoneSoftware = phoneSoftware;
	}
	public boolean isLaptopRepair() {
		return laptopRepair;
	}
	public void setLaptopRepair(boolean laptopRepair) {
		this.laptopRepair = laptopRepair;
	}
	public boolean isComputerRepair() {
		return computerRepair;
	}
	public void setComputerRepair(boolean computerRepair) {
		this.computerRepair = computerRepair;
	}
	public boolean isSoftwareInstallation() {
		return softwareInstallation;
	}
	public void setSoftwareInstallation(boolean softwareInstallation) {
		this.softwareInstallation = softwareInstallation;
	}
	public boolean isSoftwareMaintain() {
		return softwareMaintain;
	}
	public void setSoftwareMaintain(boolean softwareMaintain) {
		this.softwareMaintain = softwareMaintain;
	}
	public boolean isSoftwareUpgrade() {
		return softwareUpgrade;
	}
	public void setSoftwareUpgrade(boolean softwareUpgrade) {
		this.softwareUpgrade = softwareUpgrade;
	}
	public boolean isNetworkRepair() {
		return networkRepair;
	}
	public void setNetworkRepair(boolean networkRepair) {
		this.networkRepair = networkRepair;
	}
	public boolean isCameraRepair() {
		return cameraRepair;
	}
	public void setCameraRepair(boolean cameraRepair) {
		this.cameraRepair = cameraRepair;
	}


}

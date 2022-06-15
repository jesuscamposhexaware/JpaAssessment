package com.jcampos.training.jpaassessment.dto;

public class MobileDTO {
	
	private String mobile_name;
	
	private String app_name;
	
	public MobileDTO() {
		super();
	}

	public MobileDTO(String mobile_name, String app_name) {
		super();
		this.mobile_name = mobile_name;
		this.app_name = app_name;
	}


	public String getMobile_name() {
		return mobile_name;
	}


	public String getApp_name() {
		return app_name;
	}


	public void setMobile_name(String mobile_name) {
		this.mobile_name = mobile_name;
	}


	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}

}

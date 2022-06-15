package com.jcampos.training.jpaassessment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class App {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="app_id")
	private Integer appId;
	
	@ManyToOne
	@JoinColumn(name = "mobile_id")
	private Mobile mobile;
	
	@Column(name="app_name")
	private String appName;

	public Integer getAppId() {
		return appId;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

}

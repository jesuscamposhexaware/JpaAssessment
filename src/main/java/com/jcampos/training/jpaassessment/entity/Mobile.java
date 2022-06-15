package com.jcampos.training.jpaassessment.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Mobile {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="mobile_id")
	private Integer mobileId;
	
	@Column(name="mobile_company")
	private String mobileCompany;
	
	@Column(name="mobile_name")
	private String mobileName;
	
	@OneToMany(mappedBy="mobile")
	private List<App> apps;

	public Integer getMobileId() {
		return mobileId;
	}

	public String getMobileCompany() {
		return mobileCompany;
	}

	public String getMobileName() {
		return mobileName;
	}

	public List<App> getApps() {
		return apps;
	}

	public void setMobileId(Integer mobileId) {
		this.mobileId = mobileId;
	}

	public void setMobileCompany(String mobileCompany) {
		this.mobileCompany = mobileCompany;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public void setApps(List<App> apps) {
		this.apps = apps;
	}

}

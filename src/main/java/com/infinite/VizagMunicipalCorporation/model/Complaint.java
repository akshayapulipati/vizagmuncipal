package com.infinite.VizagMunicipalCorporation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="COMPLAINT")
public class Complaint {
	@Column(name="name")
	private String name;
	
	@Column(name="area")
	private String area;
	
	@Column(name="raiseComplaint")
	private String raiseComplaint;
	
	public Complaint(String name, String area,String raiseComplaint){
		this.name=name;
		this.area=area;
		this.raiseComplaint=raiseComplaint;
	}
	public Complaint()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getRaiseComplaint() {
		return raiseComplaint;
	}
	public void setRaiseComplaint(String raiseComplaint) {
		this.raiseComplaint = raiseComplaint;
	}
}

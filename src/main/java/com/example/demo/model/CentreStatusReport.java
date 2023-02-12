package com.example.demo.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="CentreStatusReport")
public class CentreStatusReport {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="srno")
private int id;
	@Column(name="frcid")
private String francheseId;
	private String address;
	@Column (name="centrename")
	private String name;
private String centreName;
	@Column(name="opening_balance")
private int openingBalance;
	@Column(name="developing_root")
private int developingRoot;
	@Column(name="emmerging_wings")
private int emmergingWings;
	@Column(name="RTF1")
private int readyToFly_1;
	@Column(name="RTF2")
private int readyToFly_2;
	@Column(name="closing_balance")
private int closingBalance;
	@Column(name="existing_promoted")
private int existingPromoted;
	@Column(name="acadname")
private String acadName;
	@Column(name="addedBy")
private String addedBy;
@Temporal(value=TemporalType.TIMESTAMP)
@Column(name="date")
private Date date;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFrancheseId() {
	return francheseId;
}
public void setFrancheseId(String francheseId) {
	this.francheseId = francheseId;
}
public String getCentreName() {
	return centreName;
}
public void setCentreName(String centreName) {
	this.centreName = centreName;
}
public int getOpeningBalance() {
	return openingBalance;
}
public void setOpeningBalance(int openingBalance) {
	this.openingBalance = openingBalance;
}
public int getDevelopingRoot() {
	return developingRoot;
}
public void setDevelopingRoot(int developingRoot) {
	this.developingRoot = developingRoot;
}
public int getEmmergingWings() {
	return emmergingWings;
}
public void setEmmergingWings(int emmergingWings) {
	this.emmergingWings = emmergingWings;
}
public int getReadyToFly_1() {
	return readyToFly_1;
}
public void setReadyToFly_1(int readyToFly_1) {
	this.readyToFly_1 = readyToFly_1;
}
public int getReadyToFly_2() {
	return readyToFly_2;
}
public void setReadyToFly_2(int readyToFly_2) {
	this.readyToFly_2 = readyToFly_2;
}
public int getClosingBalance() {
	return closingBalance;
}
public void setClosingBalance(int closingBalance) {
	this.closingBalance = closingBalance;
}
public int getExistingPromoted() {
	return existingPromoted;
}
public void setExistingPromoted(int existingPromoted) {
	this.existingPromoted = existingPromoted;
}
public String getAcadName() {
	return acadName;
}
public void setAcadName(String acadName) {
	this.acadName = acadName;
}
public String getAddedBy() {
	return addedBy;
}
public void setAddedBy(String addedBy) {
	this.addedBy = addedBy;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = new Date();
}

}

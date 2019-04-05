package com.nt.entity;

import java.sql.Clob;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;

@Entity
@Table(name="USER_BO")
public class UserBo {
	
	@Id
	@Column(name="USER_ID",length=6)
	@Type(type = "int")
	@SequenceGenerator(name = "gen1",sequenceName="USER_BO_SEQUENCE",initialValue=123,allocationSize=12)
	@GeneratedValue(generator="gen1",strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(name="VERSION",length=6)
	@Type(type = "int")
	@Version
	private int version;
	
	@Column(name="CREATIONAL_TIMESRAMP")
	@Type(type = "timestamp")
	@CreationTimestamp
	private Timestamp creationalTimestamp;
	
	@Column(name="CHARECTER_DATA")
	@Type(type = "clob")
	private Clob charecterData;
	
//setters and getters methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Timestamp getCreationalTimestamp() {
		return creationalTimestamp;
	}

	public void setCreationalTimestamp(Timestamp creationalTimestamp) {
		this.creationalTimestamp = creationalTimestamp;
	}

	public Clob getCharecterData() {
		return charecterData;
	}

	public void setCharecterData(Clob charecterData) {
		this.charecterData = charecterData;
	}

	@Override
	public String toString() {
		return "UserBo [id=" + id + ", version=" + version + ", creationalTimestamp=" + creationalTimestamp
				+ ", charecterData=" + charecterData + "]";
	}


}

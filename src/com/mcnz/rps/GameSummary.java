package com.mcnz.rps;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

 
@Entity 
public class GameSummary {
	 
	@Id
	@Column(nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String clientGesture;
	private String serverGesture;
	private String result;
	private java.util.Date date = new java.util.Date();
	
	public GameSummary(){}
	
	public GameSummary(String clientGesture, String serverGesture) {
		super();
		this.clientGesture = clientGesture;
		this.serverGesture = serverGesture;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getClientGesture() {
		return clientGesture;
	}
	public void setClientGesture(String clientGesture) {
		this.clientGesture = clientGesture;
	}
	public String getServerGesture() {
		return serverGesture;
	}
	public void setServerGesture(String serverGesture) {
		this.serverGesture = serverGesture;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}

}








package com.xworkz.telegram.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;

@Table(name = "telegram")
@Entity
@Getter
public class TelegramDto {
	
	@Id
	private int id;
	private String userName;
	private long phoneNumber;
	private String emailId;
	private String channelName;
	private int noOfGroups;
	private int noOfContacts;
	private String usedFor;
	
	public TelegramDto() {
		System.out.println("no args constructor");
	}

	public TelegramDto(int id, String userName, long phoneNumber, String emailId, String channelName, int noOfGroups,
			int noOfContacts, String usage) {
		super();
		this.id = id;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.channelName = channelName;
		this.noOfGroups = noOfGroups;
		this.noOfContacts = noOfContacts;
		this.usedFor = usage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public int getNoOfGroups() {
		return noOfGroups;
	}

	public void setNoOfGroups(int noOfGroups) {
		this.noOfGroups = noOfGroups;
	}

	public int getNoOfContacts() {
		return noOfContacts;
	}

	public void setNoOfContacts(int noOfContacts) {
		this.noOfContacts = noOfContacts;
	}

	public String getUsage() {
		return usedFor;
	}

	public void setUsage(String usage) {
		this.usedFor = usage;
	}

	public String toString() {
		return "TelegramDto [id=" + id + ", userName=" + userName + ", phoneNumber=" + phoneNumber + ", emailId="
				+ emailId + ", channelName=" + channelName + ", noOfGroups=" + noOfGroups + ", noOfContacts="
				+ noOfContacts + ", usage=" + usedFor + "]";
	}
	
	

}

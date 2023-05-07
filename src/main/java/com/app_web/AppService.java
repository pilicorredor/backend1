package com.app_web;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AppService {
	private String name;
	private String machineName;
	private String machineDate;
	
	public AppService() {
		this.name = "";
		this.machineName = "";
		this.machineDate = "";
	}
	
	public String getName() {
		this.name = "202010723 Pilar Andrea Corredor Corredor";
		return name;
	}
	
	public String getMachineName() {
		InetAddress inetAdd = null;
		try {
			inetAdd = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		machineName = inetAdd.getHostName();
		return machineName;
	}
	
	public String getMachineDate() {
		LocalDateTime actualDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        machineDate = actualDate.format(formatter);
		return machineDate;
	}
	
}

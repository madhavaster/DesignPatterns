package com.proxy.design.pattern;

import java.util.List;

public class ProxyServer implements ServerAccess{
	private String name;
	SoftwareEngineerRepository seRepo = new SoftwareEngineerRepository();
	public ProxyServer(String name) {
		this.name =name;
	}
	@Override
	public void getServerDetails() {
		ServerAccess serverAccess = new ProductionServer();
		List<SoftwareEngineer> softwareEngineersList = seRepo.getSoftwareEngineersList();
		for(SoftwareEngineer se : softwareEngineersList) {
			if(se.getName().equals(name)&&se.getRole().equals("Senior Consultant")) {
				serverAccess.getServerDetails();
				break;
			}
		}
	}
}
package com.proxy.design.pattern;
import java.util.ArrayList;
import java.util.List;
public class SoftwareEngineerRepository {
	public List<SoftwareEngineer> getSoftwareEngineersList() {
		List<SoftwareEngineer> softwareEngineersList = new ArrayList<>();
		SoftwareEngineer se1 = new SoftwareEngineer("madhav", "Senior Consultant");
		SoftwareEngineer se2 = new SoftwareEngineer("swapna","Software Developer");
		softwareEngineersList.add(se1);
		softwareEngineersList.add(se2);
		return softwareEngineersList;
	}
}
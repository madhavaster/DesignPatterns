package com.proxy.design.pattern;
public class ProductionServer implements ServerAccess{
	@Override
	public void getServerDetails() {
		System.out.println("production server is accessed");
	}
}
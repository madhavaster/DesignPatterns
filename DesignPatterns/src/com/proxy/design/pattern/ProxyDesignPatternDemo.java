package com.proxy.design.pattern;
public class ProxyDesignPatternDemo {
	public static void main(String[] args) {
		ServerAccess serverAccess = new ProxyServer("madhav");
		serverAccess.getServerDetails();
		System.out.println("=====================================");
		ServerAccess serverAccess1 = new ProxyServer("swapna");
		serverAccess1.getServerDetails();
	}
}
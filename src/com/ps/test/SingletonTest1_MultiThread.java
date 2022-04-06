package com.ps.test;

public class SingletonTest1_MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TicketServlet ts=new TicketServlet();
		Thread t1=new Thread(ts);
		
		Thread t2=new Thread(ts);
		
		Thread t3=new Thread(ts);
		t1.start();
		t2.start();
		t3.start();
	}

}

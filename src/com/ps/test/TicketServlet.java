package com.ps.test;

import com.ps.Printer;

public class TicketServlet implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		Printer p1=Printer.getInsatnce();
		System.out.println("hashcoe:: " + p1.hashCode());
	}

}

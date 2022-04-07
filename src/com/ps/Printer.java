package com.ps;
public class Printer {
	/*
	 * private static Printer INSTANCE;
	 */	
	private Printer() {
		System.out.println("Printer::0-param constructor");
	}

	/*
	 * public static Printer getInsatnce() { if(INSTANCE==null) {
	 *  synchronized
	 * (Printer.class) { if(INSTANCE==null) INSTANCE=new Printer();
	 * 
	 * } } return INSTANCE; 
	 * }
	 */
	private static class InnerPrinter {
		private static volatile Printer INSTANCE=new Printer();
	}
	public static Printer getInstance() {
		return InnerPrinter.INSTANCE;
	}
	public void printMessage(String mesg) {
		
		System.out.println(mesg);
	}

}

package com.ps;
public class SingltonClassTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printer p1 = Printer.getInsatnce();
		Printer p2 = Printer.getInsatnce();
		System.out.println("hash code:: "+ p1.hashCode()+ "  " +p2.hashCode());
		System.out.println(p1==p2);
		p1.printMessage("hello");
		p2.printMessage("hi");
	}

}

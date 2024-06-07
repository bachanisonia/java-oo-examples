package com.learnjava.corejava.encapsulation;

public class EncapsulationExample {

	public static void main(String[] args) {
		
		System.out.println("This is an encapsulation example...");
		
		Trade t = new Trade("ABC123", "TIBCO", 10000.0);
		
		String instrref = t.getInstrref();
		String traderef = t.getTraderef();
		double tradeqty = t.getTradeqty();
		
		System.out.println("The trade details are \n" + traderef + "\n" +  instrref + "\n" + tradeqty);
		

	}

}

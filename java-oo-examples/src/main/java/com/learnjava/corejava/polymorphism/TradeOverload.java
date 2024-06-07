package com.learnjava.corejava.polymorphism;

public class TradeOverload {

	public static void printTradeDetails(String traderef, String instrref) {
		System.out.println("Printing the trade details \nTrade Ref : " + traderef + "\nInstrument Ref : " + instrref);
	}
	
	public static void getTradeDetails(String traderef, String instrref) {
		System.out.println("The given trade details are \nTrade Ref : " + traderef + "\nInstrument Ref : " + instrref);
	}
	
	public static void getTradeDetails(String traderef, String instrref, String settlingagent) {
		System.out.println("The given trade details are \nTrade Ref : " + traderef + "\nInstrument Ref : " + instrref + "\nSettling Agent : " + settlingagent);
	}
	
}

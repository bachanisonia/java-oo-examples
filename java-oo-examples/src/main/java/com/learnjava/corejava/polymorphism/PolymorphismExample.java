package com.learnjava.corejava.polymorphism;

import com.learnjava.corejava.polymorphism.TradeOverload;
import com.learnjava.corejava.polymorphism.TradeOverride;

public class PolymorphismExample {

	public static void main(String[] args) {

		
		TradeOverload.printTradeDetails("ABC123", "GBP");
		TradeOverload.getTradeDetails("ABC123", "GBP");
		TradeOverload.getTradeDetails("ABC123", "GBP", "CLS");
		
		TradeOverride.printTradeDetails("ABC123", "GBP");
		

	}

}

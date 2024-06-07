package com.learnjava.corejava.inheritance;

import com.learnjava.corejava.inheritance.EquitiesTrade;

public class InheritanceExample {

	public static void main(String[] args) {
		
		System.out.println("This is an inheritance example");
		
		EquitiesTrade et = new EquitiesTrade("ABC123", "TIBCO", "SWIFT",100, 101.3);
		et.calculateTotalQty();
		System.out.println(et.tradeDetails());

	}

}

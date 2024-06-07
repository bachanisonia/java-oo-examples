package com.learnjava.corejava.abstraction;

import com.learnjava.corejava.abstraction.*;

public class AbstractionExample {

	public static void main(String[] args) {
		
		System.out.println("Building new swift xml messages...");
		
		SwiftMapper p009 = new MessagePacs009("ABC123", "pacs.009.001.10");
		SwiftMapper c054 = new MessageCamt054("DEF456", "C", "camt.054.001.01");
		
		p009.buildXML();
		c054.buildXML();
		
	}

}

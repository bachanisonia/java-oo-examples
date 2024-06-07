package com.learnjava.corejava.inheritance;

public class Trade {
	
	public String traderef;
	public String instrref;
	
	public Trade(String traderef, String instrref) {
	
		this.traderef = traderef;
		this.instrref = instrref;
	}
	
	
	public String tradeDetails() {
		return "The given trade ref " + traderef + " trades in instrument " + instrref ; 
	}

}

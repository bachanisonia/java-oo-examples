package com.learnjava.corejava.inheritance;

public class EquitiesTrade extends Trade {
	
	private String settlingAgent;
	private int    instrqty;
	private double instrprice;
	private double totalqty;

	public EquitiesTrade(String traderef, String instrref, String settlingAgent, int instrqty, double instrprice) {
		super(traderef, instrref);
		this.settlingAgent = settlingAgent;
		this.instrqty = instrqty;
		this.instrprice = instrprice;
	}
	
	public void calculateTotalQty() {
		totalqty = instrqty*instrprice;
	}
	
	@Override
	public String tradeDetails() {
		
		return (super.tradeDetails() + " settling with " + settlingAgent + " with a total quantity of " + totalqty);
	}

}

package com.learnjava.corejava.encapsulation;

public class Trade {
	
	private String traderef;
	private String instrref;
	private double tradeqty;
	
	
	public Trade() {
		
	}
	
	public Trade(String traderef, String instrref, double tradeqty) {
		this.traderef = traderef;
		this.instrref = instrref;
		this.tradeqty = tradeqty;
	}
	
	public String getTraderef() {
		return traderef;
	}
	public void setTraderef(String traderef) {
		this.traderef = traderef;
	}
	public String getInstrref() {
		return instrref;
	}
	public void setInstrref(String instrref) {
		this.instrref = instrref;
	}
	public double getTradeqty() {
		return tradeqty;
	}
	public void setTradeqty(double tradeqty) {
		this.tradeqty = tradeqty;
	}
		

}

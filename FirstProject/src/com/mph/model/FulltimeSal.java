package com.mph.model;

public class FulltimeSal extends Salary{
	private int basic;
	private double hra;
	private double pf;
	private double gross;
	private double net;



	public int getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public double getHra() {
		return hra;
	}

	public void setHra() {
		this.hra = basic * 0.1;
	}

	public double getPf() {
		return pf;
	}

	public void setPf() {
		this.pf = basic * 0.05;
	}

	public double getGross() {
		return gross;
	}

	public void setGross() {
		this.gross = basic + hra + pf;
	}

	public double getNet() {
		return net;
	}

	public void setNet() {
		this.net = gross -pf;
	}

	@Override
	public String toString() {
		return "Salary [basic=" + basic + ", hra=" + hra + ", pf=" + pf + ", gross=" + gross + ", net=" + net + "]";
	}
}

package com.mph;

public class Student {

	private int sid;
	private String sname;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sid=" + sid + "]";
	}
	
	

}

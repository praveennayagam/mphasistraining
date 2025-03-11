package com.mph.model;

public class PartimeSal extends Salary {
 private int wages;
 private int days;
 private int dayWages;

 public int getWages() {
	return wages;
}

public void setWages(int wages) {
	this.wages = wages;
	System.out.println(wages);
}

public int getDays() {
	return days;
}
public void setDays(int days) {
	this.days = days;
	System.out.println(days);
}
public void setDayWages() {
	this.dayWages = wages * days;
	System.out.println(dayWages);
}

public int getDayWages() {
	return dayWages;
}


@Override
public String toString() {
	return "PartimeSal [wages=" + wages + ", days=" + days + ", dayWages=" + dayWages + "]";
}
 
 
}

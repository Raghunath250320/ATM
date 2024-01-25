package com.java.atmProject;
import java.util.*;


public 	class Bank {
	    int bankaccountNo;
	    String bankName;
	    double bankBalance;
	    String bankLoc;
	    double bankRoi;
	    int bankPin;
	    String bankpersonName;

	    public Bank(int bankaccountNo, String bankName, double bankBalance, String bankLoc, double bankRoi, int bankPin, String bankpersonName) {
	        super();
	        this.bankaccountNo = bankaccountNo;
	        this.bankName = bankName;
	        this.bankpersonName = bankpersonName;
	        this.bankBalance = bankBalance;
	        this.bankLoc = bankLoc;
	        this.bankRoi = bankRoi;
	        this.bankPin = bankPin;
	    }

	    public void displayDetails() {
	    	System.out.println(bankaccountNo);
	        System.out.println(bankName);
	        System.out.println(bankLoc);
	        System.out.println(bankpersonName);
	        System.out.println(bankBalance);
	        System.out.println(bankPin);
	        System.out.println(bankRoi);
	    }
	

}

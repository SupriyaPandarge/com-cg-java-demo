package com.cg.demo.abs;

interface CentralGovtRules{
	public abstract void payInterest();
}
interface StateGovtRules{
	public abstract void giveLoan();
}

abstract class RBI{
	public abstract void doKyc();
	
	public void openAccount() {
		System.out.println("Open account..");
	}
}

class HDFC extends RBI implements CentralGovtRules, StateGovtRules{
	public void doKyc() {
		System.out.println("Adhaar");
	}
	public void giveLoan() {
		System.out.println("HDFC is giving loan..");
	}
	public void payInterest() {
		System.out.println("HDFC is paying interest");
	}
}


public class BankingDemo {
	public static void main(String[] args) {
		HDFC hdfc = new HDFC();
		hdfc.doKyc();
		hdfc.giveLoan();
		hdfc.openAccount();
		hdfc.payInterest();
		
	}
}

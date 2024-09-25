package com.index;

 	class Account {
	int acc_no; //
	String name;
	float amount; //initial amount
	//method to initialize object
	
	void insert(int a,String n,float amt) {
		acc_no=a;
		name = n;
		amount = amt;	
	}
	//deposit method
	void deposit(float amt) {
		amount=amount+amt;
		System.out.println(amt+"deposited");
	}
	
	void withdraw(float amt) {
		if(amount<amt) {
			System.out.println(amt+"withdrawn");
		}
		else{
			
		}
	}
	void checkBalance() {
		{
			System.out.println("Balance is :"+amount);
		}
	}
	void diplay() {
			{
				System.out.println(acc_no+" "+name+" "+amount);
			}
		}
 	}
	
	class TestAccount{
		public static void main(String args[]) {
			Account a1=new Account();
			
			a1.insert(832345, "vishwa", 1000); //method parsing(using object)
			a1.diplay();	//method passing
			a1.checkBalance();
			a1.deposit(40000);
			a1.checkBalance();
			a1.withdraw(15000);
			a1.checkBalance();
		}
	}
 	

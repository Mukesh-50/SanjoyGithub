package day14;

public class BankingSystem {

	public static void main(String[] args) 
	{
		
		// Rule 1 - You are not allowed to create object of interfaces
		
		// Rule 2 - //You can have variable in interfaces and these variables works as constant
					// variables in interface are by default static and final
		
		// Rule 3 -  From Java 8 - interfaces can have method implementation using default and static keyword
		
		// Rule 4 -  Java supports multiple inheritance using Interfaces
		
		RBI customer1=new SBI();
		
		customer1.videoKYC();
		
		customer1.aadharverified();
	
		System.out.println(RBI.interest_rate);
		
		
		

	}

}

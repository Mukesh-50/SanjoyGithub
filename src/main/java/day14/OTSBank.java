package day14;

// by default each and every method will be overridden in java when it comes to interface
public class OTSBank implements RBI{

	public void videoKYC()
	{
		System.out.println("OTS-We will finish KYC using Scanner app");
	}
	

	public void aadharverified() 
	{
		System.out.println("OTS - We will verify aadhar using OTP or Bio");
		
	}
	
	public void backgroundVerification()
	{
		System.out.println("OTS - We will follow backgroundVerification before working with us");
	}

}

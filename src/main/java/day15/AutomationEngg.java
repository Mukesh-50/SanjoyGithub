package day15;

public class AutomationEngg implements APIAutomation , UIAutomation
{
	
	public void writetest()
	{
		System.out.println("Automation Test Engg is responsible for both");
	}
	
	public static void main(String[] args) 
	{
		
		APIAutomation qa1=new AutomationEngg();
		
		qa1.writetest();
	}

}

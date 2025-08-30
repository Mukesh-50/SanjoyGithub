package day15;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngDemo implements ITestListener 
{

	public void onTestSuccess(ITestResult result) 
	{
		// logic here when test will be success
	}

	public void onTestFailure(ITestResult result) 
	{
		// logic here to capture screenshot stop the test and write logs

	}

}

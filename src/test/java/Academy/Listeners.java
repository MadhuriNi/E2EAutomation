package Academy;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.CaptureScreenshot;

public class Listeners implements ITestListener{
	
	CaptureScreenshot cs=new CaptureScreenshot();
	Base b=new Base();

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		String name=result.getName();
		System.out.println("The result is "+name);
		
		try {
			//cs.get_Screenshot(name);
			b.get_Screenshot(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("The Exception is "+e);
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		
	}


}

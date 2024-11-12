package reporting;

import org.testng.*;

public class listenerinterface implements ITestListener {


	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		String sucess =	result.getHost();
				
		System.out.println("success:-" + sucess);
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String fail =	result.getName();
		System.out.println("fail:-" + fail);
		ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		String skip =	result.getName();
		System.out.println("skip:-" + skip);
		ITestListener.super.onTestSkipped(result);
	}

	

	

}

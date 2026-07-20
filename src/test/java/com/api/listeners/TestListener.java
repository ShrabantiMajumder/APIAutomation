package com.api.listeners;



import org.apache.logging.log4j.*;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;



@Listeners(com.api.listeners.TestListener.class)

public class TestListener implements ITestListener {

	
	private static final Logger logger = LogManager.getLogger(TestListener.class);
	
	
	  public void onStart(ITestContext context) {
	        logger.info("Test Suite Started!!!");
	    }

	
	    public void onTestStart(ITestResult result) {
	        logger.info("Test Started: " + result.getName());
	        logger.info("Description!!"+result.getMethod().getMethodName());
	    }
	  
	  public void onFinish(ITestContext context) {
	        logger.info("Test Suite Completed!!!");
	    }
	    

	    
	    public void onTestSuccess(ITestResult result) {
	        logger.info("Test Passed: " + result.getName());
	        
	       
	    }

	    public void onTestFailure(ITestResult result) {
	        logger.error("Test Failed: " + result.getName(), result.getThrowable());
	    
	
	    }
	    
	    public void onTestSkipped(ITestResult result) {
	        logger.info("Skipped!!!!" + result.getMethod().getMethodName());
	    }


}

package commonLibs;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import commonLibsInterfaces.IReport;

public class ExtentFactory implements IReport {
	private ExtentReports extent;
	private ExtentTest test;
	
	
	public ExtentFactory(String path) throws Exception{
		
		extent = new ExtentReports(path,false);
		extent.addSystemInfo("selee", "2.52");}
		
		
	
	@Override
	public ExtentReports GetExtentReports() throws Exception {
		return extent;
		
	}
	
	
	
	@Override
	public void StartTest(String Title) throws Exception {
		 test = extent.startTest(Title);
		
		
	}
	
	@Override
	public void ExtentTest(String info) throws Exception {
		  test.log(LogStatus.INFO, info);
		
		
	}
	
	@Override
	public void ReportPass(String info) throws Exception {
		test.log(LogStatus.PASS, info);
		
	}
	@Override
	public ExtentTest GetExtentTest() throws Exception{
		return test;
	}

	@Override
	public void End() throws Exception {
		extent.endTest(test);
		extent.flush();	
		
	}
	@Override
	public void ReportFail(String info) throws Exception {
		test.log(LogStatus.FAIL, info);
		
	}
	

	
	
	

	
	

}

package commonLibsInterfaces;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
public interface IReport {
	
	
	public  ExtentReports GetExtentReports() throws Exception;
	public ExtentTest GetExtentTest() throws Exception;
	public void StartTest(String Title) throws Exception;
	public void ExtentTest(String info) throws Exception;
	public void ReportPass(String info) throws Exception;
	public void ReportFail(String info) throws Exception;
	public void End() throws Exception;
	
}


import org.testng.TestListenerAdapter;
import org.testng.internal.TestResult;

public class Listner extends TestListenerAdapter
{
	public void onTestFailure(TestResult tr){
		System.out.println("Fail" +tr.getName());
	}
	public void onTestSucess(TestResult tr)
	{
		System.out.println("Pass"+tr.getName());	
	}
	public void onTestSkipped(TestResult tr)
	{
		System.out.println("Skipp" +tr.getName());
	}

}


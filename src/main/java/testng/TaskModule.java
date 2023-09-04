package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModule {
	@Test
	public void createtask()
	{
	Reporter.log("Create Task",true);
	}
	@Test
	public void modifytask()
	{
		Reporter.log("modify task,true");
	}
	@Test
	public void deletetask()
	{
		Reporter.log("delete task",true);
	}

}

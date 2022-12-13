package org.pageexe;

import org.baseutils.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.pagefactory.LoginpageRepo;

public class LoginpageExe extends BaseClass{
	@Before
	public void before()
	{
		System.out.println("Before class");
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test()
	{
		System.out.println("Test");
		LoginpageRepo repo=new LoginpageRepo();
		typeData(repo.getUsername(), "Suba");
		typeData(repo.getPassword(), "123");
		
	}
	@After
	public void after()
	{
		System.out.println("After class");
		
	}

}

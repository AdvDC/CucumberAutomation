package stepDefinitions;

import adcLibrary.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	
	@Before("@smokeTest")
	public void beforeSmokeTest() {
		System.out.println("Smoke Test HOOKS - Modified Version from Dev Branch");
	}
	
	@After("@smokeTest")
	public void afterSmokeTest() {
		System.out.println("Closing Smoke Test HOOKS - Modified Version Dev Branch");
//		this.close();
	}
	
	@Before("@sanityTest")
	public void beforeSanityTest() {
		System.out.println("Sanity HOOKS - Modified Version Dev Branch");
	}
}

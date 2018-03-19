package stepDefinitions;

import adcLibrary.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	
	@Before("@smokeTest")
	public void beforeSmokeTest() {
		System.out.println("Smoke Test HOOKS - Browser Type is FireFox");
	}
	
	@After("@smokeTest")
	public void afterSmokeTest() {
		System.out.println("Closing Smoke Test HOOKS - Browser Type is FireFox");
//		this.close();
	}
	
	@Before("@sanityTest")
	public void beforeSanityTest() {
		System.out.println("Sanity HOOKS - Browser Type is FireFox");
	}
}

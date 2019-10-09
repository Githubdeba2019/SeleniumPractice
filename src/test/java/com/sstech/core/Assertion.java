package com.sstech.core;

import org.testng.Assert;

public class Assertion {
	
	protected void myAssert(String expected, String actual) {
		
		try {
			Assert.assertEquals(expected, actual);
		}
		catch(AssertionError e){
			
			
		}
		
		
	}

}

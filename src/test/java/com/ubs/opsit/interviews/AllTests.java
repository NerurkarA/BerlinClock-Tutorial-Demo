package com.ubs.opsit.interviews;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for com.ubs.opsit.interview");
		// $JUnit-BEGIN$
		suite.addTestSuite(BerlinClockTest.class);
		suite.addTestSuite(BerlinClockAppTest.class);
		// $JUnit-END$
		return suite;
	}

}

/**
 * 
 */
package com.ubs.opsit.interviews;

import org.junit.Test;

import com.ubs.opsit.interviews.BerlinClockApp;
import com.ubs.opsit.interviews.Constants;

import junit.framework.TestCase;

/**
 * @author Anand
 * 
 */
public class BerlinClockAppTest extends TestCase {
	BerlinClockApp berlinClockApp = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		berlinClockApp = new BerlinClockApp();
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConvertTimeLengthCheck() {
		berlinClockApp.convertTime("23:45:56:45");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConvertTimeFormatCheck() {
		berlinClockApp.convertTime("23:45:BB");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConvertTimeFormatHoursRangeCheck() {
		berlinClockApp.convertTime("25:45:32");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConvertTimeFormatMinutesRangeCheck() {
		berlinClockApp.convertTime("23:60:12");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConvertTimeFormatSecondsRangeCheck() {
		berlinClockApp.convertTime("20:45:60");
	}

	/*
	 * Scenario: Midnight When the time is 24:00:00 Then the clock should look
	 * like
	 */
	@Test
	public void testConvert_midnight_24_00_00() {

		assertEquals(berlinClockApp.convertTime("24:00:00"),
				Constants.midnight_24_00_00);
	}

	@Test
	public void testConvert_just_bf_midnight_23_59_59() {
		/*
		 * Scenario: Just before midnight When the time is 23:59:59 Then the
		 * clock should look like
		 */
		assertEquals(berlinClockApp.convertTime("23:59:59"),
				Constants.just_bf_midnight_23_59_59);
	}

	@Test
	public void testConvert_middle_afternoon_13_17_01() {
		/*
		 * Scenario: Middle of the afternoon When the time is 13:17:01 Then the
		 * clock should look like
		 */
		assertEquals(berlinClockApp.convertTime("13:17:01"),
				Constants.middle_afternoon_13_17_01);
	}

	@Test
	public void testConvert_midnight_00_00_00() {
		/*
		 * Scenario: Midnight When the time is 00:00:00 Then the clock should
		 * look like
		 */
		assertEquals(berlinClockApp.convertTime("00:00:00"),
				Constants.midnight_00_00_00);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
		berlinClockApp = null;
	}

}

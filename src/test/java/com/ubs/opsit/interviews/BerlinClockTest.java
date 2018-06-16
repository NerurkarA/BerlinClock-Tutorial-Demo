/**
 * 
 */
package com.ubs.opsit.interviews;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ubs.opsit.interviews.BerlinClock;
import com.ubs.opsit.interviews.Constants;

/**
 * @author Anand
 * 
 */
public class BerlinClockTest extends TestCase {
	BerlinClock clock = null;

	// BerlinClockApp berlinClockApp=null;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		clock = new BerlinClock();
		// berlinClockApp= new BerlinClockApp();
	}

	@Test
	public void testGet13HrsRepresentation() {
		/*
		 * Scenario: Middle of the afternoon When the time is 13:17:01 Then the
		 * clock should look like
		 * 
		 * hr=13 String strexpected="RROO\nRRRO\n";
		 */
		clock.setHrs(13);
		// String str="RROO\nRRRO\n";
		// clock.setHrs(13);
		assertEquals(clock.getHrsRepresentation(),
				Constants.Hrs13Representation);

	}

	@Test
	public void testGet24HrsRepresentation() {

		/*
		 * Scenario: Midnight When the time is 24:00:00 Then the clock should
		 * look like hr=24 String str24="RRRR\nRRRR\n";
		 */
		clock.setHrs(24);
		// String str24="RRRR\nRRRR\n";
		assertEquals(clock.getHrsRepresentation(),
				Constants.Hrs24Representation);
		// (clock.getHrsRepresentation().equals(str));

	}

	@Test
	public void testGet23HrsRepresentation() {
		/*
		 * Scenario: Just before midnight When the time is 23:59:59 Then the
		 * clock should look like
		 * 
		 * hr=23 String strexpected="RRRR\nRRRO\n";
		 */
		clock.setHrs(23);
		// String str="RRRR\nRRRO\n";

		assertEquals(clock.getHrsRepresentation(),
				Constants.Hrs23Representation);

	}

	@Test
	public void testGet00HrsRepresentation() {
		/*
		 * Scenario: Midnight When the time is 00:00:00 Then the clock should
		 * look like
		 * 
		 * hr=00 String str24="OOOO\nOOOO\n";
		 */
		clock.setHrs(00);
		// String str00="OOOO\nOOOO\n";
		assertEquals(clock.getHrsRepresentation(),
				Constants.Hrs00Representation);
		// (clock.getHrsRepresentation().equals(str));

	}

	@Test
	public void testGet00MinsRepresentation() {
		/*
		 * Scenario: Midnight When the time is 00:00:00 Then the clock should
		 * look like
		 * 
		 * min=00 String str00="OOOOOOOOOOO\nOOOO\n";
		 */

		clock.setMins(00);
		// String strmin00="OOOOOOOOOOO\nOOOO";
		assertEquals(clock.getMinsRepresentation(),
				Constants.Mins00Representation);
	}

	@Test
	public void testGet17MinsRepresentation() {
		/*
		 * Scenario: Middle of the afternoon When the time is 13:17:01 Then the
		 * clock should look like
		 * 
		 * min=17 String str17="YYROOOOOOOO\nYYOO\n";
		 */

		clock.setMins(17);
		// String strmin17="YYROOOOOOOO\nYYOO";
		assertEquals(clock.getMinsRepresentation(),
				Constants.Mins17Representation);
	}

	@Test
	public void testGet59MinsRepresentation() {
		/*
		 * Scenario: Just before midnight When the time is 23:59:59 Then the
		 * clock should look like
		 * 
		 * 
		 * min=59 String str59="YYRYYRYYRYY\nYYYY\n";
		 */

		clock.setMins(59);
		// String strmin59="YYRYYRYYRYY\nYYYY";
		assertEquals(clock.getMinsRepresentation(),
				Constants.Mins59Representation);
	}

	@Test
	public void testGet00SecRepresentation() {
		/*
		 * Scenario 1 EVEN SECONDS LAMP YELLOW sec=00 String strsec00="Y\n";
		 */
		clock.setSec(00);
		String strsec00 = "Y\n";
		assertEquals(clock.getSecRepresentation(),
				Constants.Sec00Representation);
	}

	@Test
	public void testGet48SecRepresentation() {
		/*
		 * Scenario 1 EVEN SECONDS LAMP YELLOW sec=48 String strsec48="Y\n";
		 */
		clock.setSec(48);
		// String strsec48="Y\n";
		assertEquals(clock.getSecRepresentation(),
				Constants.Sec48Representation);
	}

	@Test
	public void testGet59SecRepresentation() {
		/*
		 * Scenario 1 ODD SECONDS LAMP O sec=59 String strsec59="O\n";
		 */
		clock.setSec(59);
		// String strsec59="O\n";
		assertEquals(clock.getSecRepresentation(),
				Constants.Sec59Representation);
	}

	@After
	public void tearDown() throws Exception {
		clock = null;
	}

}

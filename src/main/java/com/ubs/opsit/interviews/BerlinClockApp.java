package com.ubs.opsit.interviews;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Anand
 * 
 */

public class BerlinClockApp implements TimeConverter {

	private static final Logger LOG = LoggerFactory.getLogger("BerlinClockApp");

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ubs.opsit.interviews.TimeConverter#convertTime(java.lang.String)
	 */
	@Override
	public String convertTime(String aTime) {
		LOG.info("start=== String convertTime(String aTime)");
		LOG.info("start=== String convertTime(String aTime)");
		BerlinClock clock = new BerlinClock();

		String[] time = aTime.split(":");
		if (time.length != 3) {
			LOG.error(Constants.INVALID_TIME_FORMAT);
			throw new IllegalArgumentException(Constants.INVALID_TIME_FORMAT);

		}
		int hours = 0;
		int minutes = 0;
		int seconds = 0;
		try {
			hours = Integer.parseInt(time[0]);
			minutes = Integer.parseInt(time[1]);
			seconds = Integer.parseInt(time[2]);
		} catch (NumberFormatException e) {
			LOG.error(e.getMessage(), Constants.NUMERIC_TIME_FORMAT);
			throw new IllegalArgumentException(Constants.NUMERIC_TIME_FORMAT);

		}
		if (hours < 0 || hours > 24) {
			LOG.error("hours < 0 || hours > 24", Constants.NUMERIC_TIME_FORMAT);
			throw new IllegalArgumentException(Constants.HRS_NOT_IN_RANGE);
		}
		if (minutes < 0 || minutes > 59) {
			LOG.error("minutes < 0 || minutes > 59",
					Constants.NUMERIC_TIME_FORMAT);
			throw new IllegalArgumentException(Constants.MINS_NOT_IN_RANGE);
		}
		if (seconds < 0 || seconds > 59) {
			LOG.error("seconds < 0 || seconds > 59",
					Constants.NUMERIC_TIME_FORMAT);
			throw new IllegalArgumentException(Constants.SECS_NOT_IN_RANGE);
		}
		/*
		 * if (hours==24 &&( minutes> 0 || seconds>0)){ LOG.error("Invalid Time ",
		 * Constants.CORRECT_TIME_FORMAT); throw new
		 * IllegalArgumentException(Constants.CORRECT_TIME_FORMAT); }
		 */
		BerlinClock bClock = new BerlinClock(hours, minutes, seconds);

		String berlinString = "";
		String secRep = bClock.getSecRepresentation();
		String hrRep = bClock.getHrsRepresentation();
		String minRep = bClock.getMinsRepresentation();

		berlinString = secRep + hrRep + minRep;
		System.out.println("Input Time= " + aTime + " " + "\nOutput=\n "
				+ berlinString);

		LOG.info("End=== String convertTime(String aTime)");

		return berlinString;
	}

	public static void main(String arg[]) {

		BerlinClockApp c = new BerlinClockApp();
		LOG.info("Start- Main method");
		c.convertTime("24:00:00");
		// LOG.debug(c.convertTime("24:00:00")+"\n");
		// System.out.println(c.convertTime("24:17:01")+"\n");
		LOG.info("End- Main method");
	}

}

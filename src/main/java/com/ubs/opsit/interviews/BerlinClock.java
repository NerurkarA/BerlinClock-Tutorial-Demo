package com.ubs.opsit.interviews;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Anand
 * 
 */

public class BerlinClock {
	private static final Logger LOG = LoggerFactory
			.getLogger(BerlinClock.class);
	int hrs;
	int mins;
	int sec;

	/**
	 * 
	 */
	public BerlinClock() {
		// TODO Auto-generated constructor stub
	}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	public int getMins() {
		return mins;
	}

	public void setMins(int mins) {
		this.mins = mins;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}

	public BerlinClock(int h, int m, int s) {
		// TODO Auto-generated constructor stub
		hrs = h;
		mins = m;
		sec = s;

	}

	public String getHrsRepresentation() {
		LOG.info("start===String getHrsRepresentation()");
		System.out.println("start===String getHrsRepresentation()");
		String hrsRep = "";
		int reminder = 0;
		int div = 0;
		try {
			reminder = hrs % 5;
			div = hrs / 5;
		} catch (NumberFormatException nfe) {
			LOG.error(nfe.getMessage(), nfe);
			System.err.println(nfe.getMessage() + " " + nfe);
		}

		if (hrs > 0) {
			if (div > 0) {
				String firstHRROW = "";
				String elsefirstHRROW = "";
				int count = 1;
				for (int i = 1; i <= Constants.FIRST_HRROW_MAX; i++) {
					if (count <= div) {

						firstHRROW = firstHRROW + Constants.LAMP_RED;

					} else {
						firstHRROW = firstHRROW + Constants.LAMP_OFF;

					}
					count++;
				}
				firstHRROW += Constants.NEW_LINE;
				hrsRep = firstHRROW;
			}
			String secondHRROW = "";
			if (reminder > =0) {

				int remcount = 1;
				for (int i = 1; i <= Constants.SECOND_HRROW_MAX; i++) {
					if (remcount <= reminder) {

						secondHRROW = secondHRROW + Constants.LAMP_RED;

					} else {
						secondHRROW = secondHRROW + Constants.LAMP_OFF;

					}
					remcount++;
				}
				secondHRROW += Constants.NEW_LINE;
				hrsRep = hrsRep + secondHRROW;
			} else {
				secondHRROW = Constants.LAMP_OFF + Constants.LAMP_OFF
						+ Constants.LAMP_OFF + Constants.LAMP_OFF;

				hrsRep = hrsRep + secondHRROW;
			}
		} else {
			hrsRep = Constants.hr0rep;
		}
		LOG.info("End===String getHrsRepresentation()");
		System.out.println("End===String getHrsRepresentation()");
		return hrsRep;
	}

	public String getMinsRepresentation() {
		LOG.info("start===String getMinsRepresentation()");
		System.out.println("start===String getMinsRepresentation()");
		String minssRep = "";
		int reminder = 0;
		int div = 0;
		try {
			div = mins / 5;
			reminder = mins % 5;
		} catch (NumberFormatException nfe) {
			LOG.error(nfe.getMessage(), nfe);
		}
		String secondMINROW = "";
		if (mins > 0) {
			if (div > 0) {
				String firstMINROW = "";
				String elsefirstMINROW = "";
				int count = 1;
				for (int i = 1; i <= Constants.FIRST_MINROW_MAX; i++) {
					if (count <= div) {
						if (i == 3 || i == 6 || i == 9) {
							firstMINROW = firstMINROW + Constants.LAMP_RED;
						} else {
							firstMINROW = firstMINROW + Constants.LAMP_YELLOW;
						}

					} else {
						firstMINROW = firstMINROW + Constants.LAMP_OFF;

					}
					count++;
				}
				firstMINROW += Constants.NEW_LINE;
				minssRep = firstMINROW;
			}

			if (reminder > 0) {

				int remcount = 1;
				for (int i = 1; i <= Constants.SECOND_MINROW_MAX; i++) {
					if (remcount <= reminder) {

						secondMINROW = secondMINROW + Constants.LAMP_YELLOW;

					} else {
						secondMINROW = secondMINROW + Constants.LAMP_OFF;

					}
					remcount++;
				}

				minssRep = minssRep + secondMINROW;
			} else {
				secondMINROW = Constants.LAMP_OFF + Constants.LAMP_OFF
						+ Constants.LAMP_OFF + Constants.LAMP_OFF;

				minssRep = minssRep + secondMINROW;
			}
		} else {
			minssRep = Constants.min0rep;

		}

		LOG.info("End===String getMinsRepresentation()");
		System.out.println("End===String getMinsRepresentation()");
		return minssRep;

	}

	public String getSecRepresentation() {
		LOG.info("start===String getSecRepresentation()");
		System.out.println("start===String getSecRepresentation()");
		String secRep = Constants.LAMP_OFF;
		try{
			
		if (sec % 2 == 0) {
			secRep = Constants.LAMP_YELLOW;
			}
		}catch(NumberFormatException nfefs){
			LOG.error(nfe.getMessage(), nfe);
		}
		secRep = secRep + Constants.NEW_LINE;
		LOG.info("End===String getSecRepresentation()");
		System.out.println("End===String getSecRepresentation()");
		return secRep;
	}

}

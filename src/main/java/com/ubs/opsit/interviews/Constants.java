package com.ubs.opsit.interviews;

public class Constants {

	public static final String LAMP_OFF = "O";
	public static final String LAMP_YELLOW = "Y";
	public static final String LAMP_RED = "R";
	public static final int FIRST_ROW_HRS = 5;
	public static final int FIRST_ROW_MIN = 11;
	public static final int SECOND_ROW_MIN = 4;
	public static final int FIRST_HRROW_MAX = 4;
	public static final int SECOND_HRROW_MAX = 4;
	public static final int FIRST_MINROW_MAX = 11;
	public static final int SECOND_MINROW_MAX = 4;
	public static final String NEW_LINE = "\n";
	public static final String Hrs13Representation = "RROO\nRRRO\n";
	public static final String Hrs24Representation = "RRRR\nRRRR\n";
	public static final String Hrs23Representation = "RRRR\nRRRO\n";
	public static final String Hrs00Representation = "OOOO\nOOOO\n";
	public static final String Mins00Representation = "OOOOOOOOOOO\nOOOO";
	public static final String Mins17Representation = "YYROOOOOOOO\nYYOO";
	public static final String Mins59Representation = "YYRYYRYYRYY\nYYYY";
	public static final String Sec00Representation = "Y\n";
	public static final String Sec48Representation = "Y\n";
	public static final String Sec59Representation = "O\n";
	public static final String midnight_24_00_00 = "Y\n" + "RRRR\n" + "RRRR\n"
			+ "OOOOOOOOOOO\n" + "OOOO";
	public static final String just_bf_midnight_23_59_59 = "O\n" + "RRRR\n"
			+ "RRRO\n" + "YYRYYRYYRYY\n" + "YYYY";
	public static final String middle_afternoon_13_17_01 = "O\n" + "RROO\n"
			+ "RRRO\n" + "YYROOOOOOOO\n" + "YYOO";
	public static final String midnight_00_00_00 = "Y\n" + "OOOO\n" + "OOOO\n"
			+ "OOOOOOOOOOO\n" + "OOOO";
	public static final String hr0rep = "OOOO" + "\n" + "OOOO" + "\n";
	public static final String min0rep = "OOOOOOOOOOO" + "\n" + "OOOO";
	public static final String NO_TIME_FOUND = "No time provided";
	public static final String INVALID_TIME_FORMAT = "Invalid Time Format.";
	public static final String NUMERIC_TIME_FORMAT = "Time Format Must be Numeric.";
	public static final String CORRECT_TIME_FORMAT = "Time Format Should Be of 24:00:00";
	public static final String HRS_NOT_IN_RANGE = "Hrs Not In Range- 00-24";
	public static final String MINS_NOT_IN_RANGE = "Minutes Not In Range- 00-59";
	public static final String SECS_NOT_IN_RANGE = "Seconds Not In Range- 00-59";
}

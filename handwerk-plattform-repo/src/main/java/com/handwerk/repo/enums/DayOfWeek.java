package com.handwerk.repo.enums;

import java.util.Calendar;

/**
 * This class provides an enumeration of the allowed dayOfWeek types.
 */
public enum DayOfWeek {

	DAY_MONDAY("mon"),
	DAY_TUESDAY("tue"),
	DAY_WEDNESDAY("wed"),
	DAY_THURSDAY("thu"),
	DAY_FRIDAY("fri"),
	DAY_SATURDAY("sat"),
	DAY_SUNDAY("sun");

	private String day = null;

	/**
	 * Creates a new enumeration type for the specified bind rule dayOfWeek
	 * type.
	 *
	 * @param day The day name.
	 */
	DayOfWeek(String day) {
		this.day = day;
	}

	/**
	 * Check a new enumeration type for the specified bind rule dayOfWeek
	 * type.
	 *
	 * @param day The boolean type name.
	 * @return True if the keyword is equal to the specified name.
	 */
	public boolean isDayOfWeek(String day) {
		return day.equalsIgnoreCase(this.day);
	}

	/**
	 * Create a new enumeration type for the specified dayOfweek type name.
	 *
	 * @param day The name of the enumeration to create.
	 * @return A new enumeration type for the name or null if the name is
	 * not valid.
	 */
	public static DayOfWeek createDayOfWeek(String day) {
		if (day != null) {
			for (DayOfWeek t : DayOfWeek.values()) {
				if (t.isDayOfWeek(day)) {
					return t;
				}
			}
		}
		return null;
	}

	/**
	 * Return a enumeration relating to a Calendar day of week field.
	 *
	 * @param day The day of week index to get.
	 * @return An enumeration corresponding to the wanted day of the week or
	 * null if the day index is invalid.
	 */
	public static DayOfWeek getDayOfWeek(int day) {
		switch (day) {
			case Calendar.SUNDAY:
				return DAY_SUNDAY;

			case Calendar.MONDAY:
				return DAY_MONDAY;

			case Calendar.TUESDAY:
				return DAY_TUESDAY;

			case Calendar.WEDNESDAY:
				return DAY_WEDNESDAY;

			case Calendar.THURSDAY:
				return DAY_THURSDAY;

			case Calendar.FRIDAY:
				return DAY_FRIDAY;

			case Calendar.SATURDAY:
				return DAY_SATURDAY;
		}
		return null;
	}
}

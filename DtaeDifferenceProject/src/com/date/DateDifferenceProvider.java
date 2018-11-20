package com.date;

public class DateDifferenceProvider {

	public static int getDateDifference(MyDate startDate, MyDate endDate,MyDate actualDifference) {

		return endDate.getDd() - startDate.getDd();

	}
}

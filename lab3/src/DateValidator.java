/* * * * * * * * * * * * * * ** * * * * * * * * *  * * * *
* 
* ENSE375 Lab3 Test-Driven Development
* Author: Li Pan SID: 200371281
* Reference: The lab material from Adam
* DateValidator: The date format validator funtion. 
*
* * * * * * * * * * * * *  * * * * * * * * * * * * * * * */
public class DateValidator {

    private final int longDateLength = 10;
    private final int shortDateLength = 8;

    private boolean isDateIllegal(int month, int day, int year) {
        return
        // obviously illegal
        day >= 32 || month >= 13 ||
        // not obviously illegal
                (month == 2 && day == 31) || (month == 4 && day == 31) || (month == 6 && day == 31)
                || (month == 9 && day == 31) || (month == 11 && day == 31) || (month == 2 && day == 30) ||
                // illegal... except on leap years
                (month == 2 && day == 29 && (year % 4 != 0));
    }

    /**Checking the input weekday is correct responding the given date */
    public boolean isLegal(String weekDay, String month, int dayNum, int year) {

        int weekDayNum;
        int monthNum;

        /**Convert the weekday to number  */
        if (weekDay.equals("Sunday") || weekDay.equals("Sun"))
            weekDayNum = 0;
        else if (weekDay.equals("Monday") || weekDay.equals("Mon"))
            weekDayNum = 1;
        else if (weekDay.equals("Tuesday") || weekDay.equals("Tues"))
            weekDayNum = 2;
        else if (weekDay.equals("Wednesday") || weekDay.equals("Wed"))
            weekDayNum = 3;
        else if (weekDay.equals("Thursday") || weekDay.equals("Thurs"))
            weekDayNum = 4;
        else if (weekDay.equals("Friday") || weekDay.equals("Fri"))
            weekDayNum = 5;
        else
            weekDayNum = 6;

        /**Convert the month to number */
        if (month.equals("January") || month.equals("Jan"))
            monthNum = 11;
        else if (month.equals("February") || month.equals("Feb"))
            monthNum = 12;
        else if (month.equals("March") || month.equals("Mar"))
            monthNum = 1;
        else if (month.equals("April") || month.equals("Apr"))
            monthNum = 2;
        else if (month.equals("May"))
            monthNum = 3;
        else if (month.equals("June") || month.equals("Jun"))
            monthNum = 4;
        else if (month.equals("July") || month.equals("Jul"))
            monthNum = 5;
        else if (month.equals("August") || month.equals("Aug"))
            monthNum = 6;
        else if (month.equals("September") || month.equals("Sep"))
            monthNum = 7;
        else if (month.equals("October") || month.equals("Oct"))
            monthNum = 8;
        else if (month.equals("November") || month.equals("Nov"))
            monthNum = 9;
        else
            monthNum = 10;

        int century = year / 100;
        int yearNum;

        if (month.equals("January") || month.equals("Jan") || month.equals("February") || month.equals("Feb"))
            yearNum = year % 100 - 1;
        else
            yearNum = year % 100;

        //Using the formula to get the responding weekday
        int week_day = (int) ((dayNum + Math.floor(2.6 * monthNum - 0.2) - 2 * century + yearNum
                + Math.floor(yearNum / 4) + Math.floor(century / 4)) % 7);

        return (weekDayNum == week_day);

    }

    /**Check the Format of the data  */

    public boolean validate(String date) {
        int mm;
        int dd;
        int yyyy;

        if (date.length() == longDateLength) {

            char firstSeparator = date.charAt(2);
            char secondSeparator = date.charAt(5);
            if (firstSeparator != secondSeparator) {
                return false;
            }

            // 12/23/2012
            mm = Integer.parseInt(date.substring(0, 2));
            dd = Integer.parseInt(date.substring(3, 5));
            yyyy = Integer.parseInt(date.substring(6, 10));
            if (isDateIllegal(mm, dd, yyyy)) {
                return false;
            } else {
                return true;
            }

        } else if (date.length() == shortDateLength) {
            mm = Integer.parseInt(date.substring(0, 2));
            dd = Integer.parseInt(date.substring(2, 4));
            yyyy = Integer.parseInt(date.substring(4, 8));
            if (isDateIllegal(mm, dd, yyyy)) {
                return false;
            } else {
                return true;
            }

        }

        else if (date.length() > 10) {
            String[] dateArray = date.split(", ");

            String weekDay = dateArray[0];

            String monthDay = dateArray[1];

            String[] month_Day = monthDay.split("\\s");

            String month = month_Day[0];

            String day = month_Day[1];
            int dayNum = Integer.parseInt(day);

            String yearString = dateArray[2];
            int year = Integer.parseInt(yearString);

            if ((weekDay.equals("Sunday") || weekDay.equals("Sun") || weekDay.equals("Monday") || weekDay.equals("Mon")
                    || weekDay.equals("Tuesday") || weekDay.equals("Tues") || weekDay.equals("Wednesday")
                    || weekDay.equals("Wed") || weekDay.equals("Thursday") || weekDay.equals("Thurs")
                    || weekDay.equals("Friday") || weekDay.equals("Fri") || weekDay.equals("Saturday")
                    || weekDay.equals("Sat"))
                    && (month.equals("January") || month.equals("Jan") || month.equals("February")
                            || month.equals("Feb") || month.equals("March") || month.equals("Mar")
                            || month.equals("April") || month.equals("Apr") || month.equals("May")
                            || month.equals("June") || month.equals("Jun") || month.equals("July")
                            || month.equals("Jul") || month.equals("August") || month.equals("Aug")
                            || month.equals("September") || month.equals("Sep") || month.equals("October")
                            || month.equals("Oct") || month.equals("November") || month.equals("Nov")
                            || month.equals("December") || month.equals("Dec"))
                    && isLegal(weekDay, month, dayNum, year)

            ) {
                return true;
            }

            else
                return false;

        }

        else {
            return false;
        }

    }
}

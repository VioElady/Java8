
public class Date {
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth =
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


    public Date(int month, int day, int year) {

        if (month <= 0 || month > 12)
            throw new IllegalArgumentException(
                    "month (" + month + ") must be 1-12");

        if (day <= 0 ||
                (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day +
                    ") out-of-range for the specified month and year");

        if (month == 2 && day == 29 && !(year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("day (" + day +
                    ") out-of-range for the specified month and year");

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf(
                "Date object constructor for date %s%n", this);
    }

    public void nextDay() {
        if (day == 28 && month == 2 && year % 400 == 0) {
            day++;
        } else if (day >= daysPerMonth[month]) {
            nextMonth();
        } else {
            day++;
        }
    }

    public void nextMonth() {
        if (month == 12) {
            nextYear();
        } else {
            month++;
            day = 1;
        }
    }

    public void nextYear() {
        year++;
        month = 1;
        day = 1;
    }


    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}
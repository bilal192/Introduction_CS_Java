public class Date {
    private int _day;
    private int _month;
    private int _year;

    public Date(int day, int month, int year) {
        if(isValidDate(day, month, year)) {
            this._day = day;
            this._month = month;
            this._year = year;
        }
        else{
            throw new IllegalArgumentException("Invalid date: " + day + "/" + month + "/" + year);
        }
    }

    public Date(){
        _day = 01;
        _month = 01;
        _year = 2024;
    }

    public Date(Date other) {
        this._day = other._day;
        this._month = other._month;
        this._year = other._year;
    }

    private boolean isLeapYear(int year){
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }

    /**
     * Checks if the given date is valid.
     * @param day the day of the month, must be between 1 and 31.
     * @param month the month of the year, must be between 1 and 12.
     * @param year the year of the date, must be 4 digits.
     * @return true if the given date is valid, false otherwise.
     */
    private boolean isValidDate(int day, int month, int year) {
        if(isLeapYear(year)){

        }
        if(day < 1 || day > 31) {
            return false;
        }
        if(month < 1 || month > 12) {
            return false;
        }
        if (year < 1000 || year > 9999){
            return false;
        }
        return true;
    }

    /** Setters */
    public void setDay(int dayToSet) {
        if (dayToSet >= 1 && dayToSet <= 31) {
            this._day = dayToSet;
        }
    }

    public void setMonth(int monthToSet) {
        if(monthToSet >= 1 && monthToSet <= 12){
            this._month = monthToSet;
        }
    }

    public void setYear(int yearToSet) {
        if(yearToSet >= 1000 && yearToSet <= 9999){
            this._year = yearToSet;
        }
    }

    /** Getters */
    public int getDate(){
        return _day;
    }

    public int getMonth(){
        return _month;
    }

    public int getYear(){
        return _year;
    }

}
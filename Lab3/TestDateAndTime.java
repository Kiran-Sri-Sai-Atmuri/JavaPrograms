package javaLab.Lab3;

public class TestDateAndTime {

	public static void main(String[] args) {
		
		DateAndTime dt = new DateAndTime(new Date(29,01,2026),new Time(11,04,54));
		System.out.println(dt);

	}

}


class Date{
	int day;
	int month;
	int year;
	public Date(int day, int maonth, int year) {
		super();
		this.day = day;
		this.month = maonth;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int maonth) {
		this.month = maonth;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return  day + "/" + month + "/" + year;
	}
	
	
	
	
}


class Time{
	int hour;
	int minute;
	int second;
	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	
	@Override
	public String toString() {
		return hour + "/" + minute + "/" + second;
	}
}


class DateAndTime{
	
	Date date;
	Time time;
	public DateAndTime(Date date, Time time) {
		this.date = date;
		this.time = time;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "DateAndTime : " +date + "-" + time ;
	}
	
	
	
}
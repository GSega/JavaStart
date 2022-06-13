package com.outlook.sl1601004.main;

public class Time {
	private int hour;
	private int min;
	private int sec;

	public Time() {
		this.setHour(0);
		this.setMin(0);
		this.setSec(0);
	}

	public Time(int hour, int min, int sec) {
		this.setHour(hour);
		this.setMin(min);
		this.setSec(sec);
	}
	
	
	public void changeHour(int hour) {
		if (this.hour + hour >= 0 && this.hour + hour < 24) {
			this.hour +=hour;
		} else {
			this.hour = 0;
		}
	}
	
	public void changeMinute(int min) {
		if (this.min + min >= 0 && this.min + min < 60) {
			this.min +=min;
		} else {
			this.min = 0;
		}
	}
	
	public void changeSecond(int sec) {
		if (this.sec + sec >= 0 && this.sec + sec < 60) {
			this.sec +=sec;
		} else {
			this.sec = 0;
		}
	}
	
	

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if (min >= 0 && min < 60) {
			this.min = min;
		} else {
			this.min = 0;
		}
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour >= 0 && hour < 24) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		if (sec >= 0 && sec < 60) {
			this.sec = sec;
		} else {
			this.sec = 0;
		}
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", min=" + min + ", sec=" + sec + ".]";
	}

	
	
	
}

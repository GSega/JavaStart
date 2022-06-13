package com.outlook.sl1601004.main;

public class DecimalCounter {

	private int min;
	private int max;
	private int current;

	public DecimalCounter() {
		this.setMin(1);
		this.setMax(10);
		this.setCurrent(1);
	}

	public DecimalCounter(int min, int current) {
		if (current >= min && current <= max) {
			this.setMin(min);
			this.setMax(min + 9);
			this.setCurrent(current);
		} else {
			System.out.println("wrong value. current is invalid");
		}

	}

	public void incrementCounter() {
		if (current == max) {
			this.setCurrent(min);
		} else {
			current++;
		}
	}

	public void decrementCounter() {
		if (current == min) {
			this.setCurrent(max);
		} else {
			current--;
		}
	}

	public int getMin() {
		return min;
	}

	private void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	private void setMax(int max) {
		this.max = max;
	}

	public int getCurrent() {
		return current;
	}

	private void setCurrent(int current) {
		this.current = current;
	}

	@Override
	public String toString() {
		return "min=" + min + ", max=" + max + ", current=" + current + ".";
	}

}

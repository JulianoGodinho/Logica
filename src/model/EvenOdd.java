package model;

public class EvenOdd {
	
	private int number;
	
	public EvenOdd(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String evenOrOdd() {
		if (this.number % 2 == 0) {	
			return "O número " + this.number + " é par \n";
		} else {
			return "O número " + this.number + " é ímpar \n";
		}
	}

}

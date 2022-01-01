package model;

public class BiggerSmaller {

	private float number1;
	private float number2;
	private float number3;
	
	public BiggerSmaller(float number1, float number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public BiggerSmaller(float number1, float number2, float number3) {
		this.number1 = number1;
		this.number2 = number2;
		this.number3 = number3;
	}

	public float getNumber1() {
		return number1;
	}

	public void setNumber1(float number1) {
		this.number1 = number1;
	}

	public float getNumber2() {
		return number2;
	}

	public void setNumber2(float number2) {
		this.number2 = number2;
	}
	
	public float getNumber3() {
		return number3;
	}

	public void setNumber3(float number3) {
		this.number3 = number3;
	}
	
	public String bigger() {
		if (this.number1 > this.number2) {
			return "O maior número é " + this.number1;
		} else if (this.number2 > this.number1) {
			return "O maior número é " + this.number2; 
		} else {
			return "Os números " + this.number1 + " e " + this.number2 + " são iguais \n";
		}
	}
	
	public String smaller() {
		if (this.number1 < this.number2) {
			return "O menor número é " + this.number1 + "\n";
		} else if (this.number2 < this.number1) {
			return "O menor número é " + this.number2 + "\n";
		} else {
			return "";
		}
	}
	
	public String biggerWithThreeNumbers() {
		float bigger = this.number1;
		if ((this.number1 == this.number2) && (this.number1 == this.number3)) {
			return "Os números " + this.number1 + " , " + this.number2 + " e " + this.number3 + " são iguais!! \n";
		} else if ((this.number2 > this.number1) && (this.number2 > this.number3)) {
			bigger = this.number2;
			return "O maior número é " + bigger;
		} else if ((this.number3 > this.number1) && (this.number3 > this.number2)) {
			bigger = this.number3;
			return "O maior número é " + bigger;
		} else {
			return "O maior número é " + bigger;
		}
	}
	
	public String smallerWithThreeNumbers() {
		float smaller = this.number1;
		if ((this.number1 == this.number2) && (this.number1 == this.number3)) {
			return "";
		} else if ((this.number2 < this.number1) && (this.number2 < this.number3)) {
			smaller = this.number2;
			return "O menor número é " + smaller + " \n";
		} else if ((this.number3 < this.number1) && (this.number3 < this.number2)) {
			smaller = this.number3;
			return "O menor número é " + smaller + "  \n";
		} else {
			return "O menor número é " + smaller + " \n";
		}
	}
	
}
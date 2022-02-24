package week1.day2;

public class Calculator {

	public int add(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		System.out.println("Sum of Three numbers is " + sum);
		return sum;
	}

	public int sub(int num1, int num2) {
		int sub = num1 - num2;
		System.out.println("Subraction of Two numbers is " + sub);
		return sub;
	}

	public double mul(double num1, double num2) {
		double mul = num1 * num2;
		System.out.println("Multiplication of Two numbers is " + mul);
		return mul;
	}

	public float div(float num1, float num2) {
		float div = num1 / num2;
		System.out.println("Division of Two numbers is " + div);
		return div;
	}

}

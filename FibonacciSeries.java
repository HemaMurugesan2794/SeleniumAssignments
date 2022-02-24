package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstNum = 0, secondNum = 1;
		int sum = 0, range = 8;
		System.out.print("Fibonacci series of " + range + " : " + firstNum + " " + secondNum);
		for (int i = 0; i <= range; i++) {
			sum = firstNum + secondNum;
			System.out.print(" " + sum);
			firstNum = secondNum;
			secondNum = sum;

		}
	}

}


public class NegativeToPositiveNumber {

	public static void main(String[] args) {
		int Number= -40;
		if (Number < 0) {
			System.out.println("Entered Number is Negative Number");
			int AbsoluteNumber= Math.abs(Number);
			System.out.println("Absolute Number is " +""+ AbsoluteNumber);
		}
		else
		{
			System.out.println("Entered Number is a Positive Number");
		}
	}

}

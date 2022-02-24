package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		int num=47;
		int sum =0;
		int reminder=0;
		while (num>0)
		{
			reminder=num%10;
			sum=sum+reminder;
			num=num/10;
			
		}
		System.out.println("Sum of Digits is:  " +sum);

	}

}

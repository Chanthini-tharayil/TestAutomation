package dataStructures;

public class IntegerReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m=1234;
		int reverse = 0;
        int lastDigit = 0;

        while (m >= 1) {
            lastDigit = m % 10; // gives you last digit
            reverse = reverse * 10 + lastDigit;
            m = m / 10; // get rid of last digit
        }
        System.out.println(reverse);


	}

}

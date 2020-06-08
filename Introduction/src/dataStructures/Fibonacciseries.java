package dataStructures;

public class Fibonacciseries {

	public static void main(String[] args) {
		// First 10 number of fibonocci series
        int n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        
        // Fibonocci series till 100
 int n1 = 100, t3 = 0, t4 = 1;
        
        System.out.print("\nUpto " + n1 + ": ");
        while (t3 <= n1)
        {
            System.out.print(t3 + " + ");
            int sum = t3 + t4;
            t3 = t4;
            t4 = sum;
        }
	
	}
	

}

package prep1;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;
//min difference between 2 prime numbers
public class kpairwithsmallestdiff {

	
		// TODO Auto-generated method stub
		
		public static void main(String[] args) {
			int[] input = { 22, 3, 56, 73, 11, -7, 67, 98 };
			int output = PrimeNumbers(input);
			//System.out.println(output);
		}

		static int PrimeNumbers(int[] input) {
			TreeSet<Integer> prime = new TreeSet<Integer>();
			for (int i = 0; i < input.length; i++) {
				if (IsPrime(input[i]))
					prime.add(input[i]);
			}

			int difference = (int) prime.last() - (int) prime.first();
			
			return difference;
		}

		private static boolean IsPrime(int p) {
			int count = 0;

			boolean flag = false;
			for (int j = 2; j < p / 2; j++) {
				if (p % j == 0)
					count++;
			}
			if (count == 0)
				flag = true;

			else
				flag = false;

			return flag;
		}
		
		
	     }
	



package Careercup;

public class LeftRightSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Write a program to display numbers having sum of left side numbers
		 *  equal to right side numbers.
{1,0,-11,1,12}=>0 {Left side number 1+0=1, Right side number -11+1+12=1}*/

		int[] a = {1, 1, -11, 1, 12};
		int sum1 = 0, sum2 = 0, index = 0;
		
		while(index<a.length){
			sum1 = 0;
			sum2 = 0;
			for(int i=0; i<=index; i++){
				sum1 = sum1+a[i];
			}
			for(int i=index+1; i<a.length; i++){
				sum2 = sum2+a[i];
			}
			if(sum1==sum2){
				System.out.println("LeftSide sum equals right side");
				break;
			}else{
				index++;
			}
		}
		System.out.println("Common Sum : " + sum1);
	}

}

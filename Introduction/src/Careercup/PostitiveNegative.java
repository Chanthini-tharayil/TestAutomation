package Careercup;

import java.util.Arrays;

/*Given an array of positive and negative integers
 *  {-1,6,9,-4,-10,-9,8,8,4} (repetition allowed) sort the
 *   array in a way such that the starting from a positive number,
 *    the elements should be arranged as one positive and one negative element maintaining
 *     insertion order. First element should be starting from positive integer and the
 *      resultant array should look like {6,-1,9,-4,8,-10,8,-9,4}
 * */
 

//TWO SOLUTIONS BELOW
public class PostitiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {-1,6,9,-4,-10,-9,8,8,4};
int negcount=-1,temp=0;

//BRING ALL NEGATIVE NUMBERS TO FRONT
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<0)
		{
			negcount++;
			temp=a[negcount];
			a[negcount]=a[i];
			a[i]=temp;
		}
	}
	//SWAP POSITIVE AND NEGATIVE NUMBERS
	int pos=negcount+1;int neg=0;
	while (pos < a.length && neg < pos && a[neg] < 0) 
    { 
        temp = a[neg]; 
        a[neg] = a[pos]; 
        a[pos] = temp; 
        pos++; 
        neg += 2; 
    } 
	System.out.println("After 1st swapping:\n");
	for(int i=0;i<a.length;i++)
	System.out.println(a[i]);
	
//ALTERNATE NEGATIVE AND POSITIVE MAINTAING ORDER OF INSERTION IN ORIGINAL ARRAY
	int pos1=0;int neg1=0,j=0;int[] c= new int[a.length];

	for(int i=0;i<a.length-1;i++) {
		
		while(a[pos1]<0) {
			pos1++;
		}
		c[i]=a[pos1];pos1++;
		i++;
		while(a[neg1]>0 ) {
			neg1++;
		}
		if(i<a.length)
		c[i]=a[neg1];neg1++;		
	}
	System.out.println("Maintaining insertion order");
	for(int i=0;i<c.length-1;i++)
		System.out.println(c[i]);
	
    }
	
	}



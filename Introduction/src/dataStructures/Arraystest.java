

// Contains program to find size of array,insert,delete elements from array
//and dynamically resize array

package dataStructures;

public class Arraystest {
	
	public static void main(String[] args) {
		
		int[] array=new int[6];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		int index=2;
		
		//Find number of records in an array
		 int count = 0;
		 int size=array.length;
	      for(int i : array)
	      {
	         if(i > 0)
	         {
	            count++;
	         }
	      }
	      System.out.println("Printing Size:");
	      System.out.println(count);
	      //insert records to an index value
	     for(int i=count+1;i>index;i--)
			{
				array[i]=array[i-1];
			}
			count++;
			array[index]=5;
		//print values in an array
			System.out.println("After Insertion of 5:");
			for(int i=0;i<count;i++)
			{
				
				System.out.println(array[i]);
			}
			// Delete element from index
			int del=3;
			for(int i=del;i<count;i++)
			{
				array[i]=array[i+1];
			}
			count--;
			//code to set last elemt to 0 if the index for last element given 
			//is same as size then last element is accessible. To avoid this we have to do like this
		    if (del == count) {
	            array[del] = 0;
		    }
			System.out.println("After Deletion 3:");
			for(int i=0;i<count;i++)
			{
				
				System.out.println(array[i]);
			}
			
			//Dynamic Resizing of array:
			int size1=array.length;
			System.out.println("Size Before Resizing:"+array.length);
			int[] newData = new int[size1 * 2];
	        for (int i = 0; i < size1; i++) {
	            newData[i] = array[i];
	        }
	        array = newData;
	        size1=size1*2;
	        System.out.println("size after resizing:"+array.length);
	}

}

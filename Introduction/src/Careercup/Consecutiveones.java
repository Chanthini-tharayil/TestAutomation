package Careercup;

import java.util.HashMap;
import java.util.Map;

public class Consecutiveones {

	/*
	 * Write a code to return a value 'True' if the number '1' throughout
	 *  the array appears consecutively. Ex: S = {1,1,1,0,0,3,4}.
Else, return 'False' if the array does not have the given number 
(char = '1' in this case) in 
the consecutive order. Ex: S = {1,1,0,0,1,3,4}
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[] = {1,1,1,0,1,3,4};
		 int i=0;
	        boolean isOneStart = false;
	        boolean isOneEnd = false;
	        boolean isConsec = true;
	        while(i<s.length){

	            if(isOneStart==false && s[i]==1){
	                isOneStart = true;
	            }

	            else if(isOneStart==true && isOneEnd==false && s[i]!=1){
	                isOneEnd = true;
	            }

	            else if(isOneEnd== true && s[i]==1){
	                isConsec = false;
	                break;
	            }

	            i++;
	        }

	        if(isOneStart==false){
	            System.out.println("Array doesnt have any Ones");
	        } else {
	            if (isConsec) {
	                System.out.println("It is consecutive");
	            } else {
	                System.out.println("It is not consecutive");
	            }
	        }
	
	}

}

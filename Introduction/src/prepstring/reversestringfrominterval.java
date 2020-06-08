package prepstring;

import java.util.Stack;

public class reversestringfrominterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Runinteractive";
String test ="";
int n=2;
/*char[] a=s.toCharArray();
int n=2,left=0,right=0;
char temp=' ';
Stack<Character> m=new Stack<Character>();
for(int i=0;i<a.length;i+=n)
{
	left=i;
	right=i+n-1;
	while(left<right)
	{
		temp=a[right];
		a[right]=a[left];
		a[left]=temp;
		left++;
		right--;
		
	}
}
for(int i=0;i<a.length;i++)
	System.out.println(a[i]);*/
	
StringBuilder test1=new StringBuilder();
for(int i=0;i<s.length();i+=n)
{
	test=s.substring(i,i+n);
	StringBuilder sb= new StringBuilder(test);
	sb.reverse();
	test1.append(sb);
	
}
System.out.println(test1.toString());
	}
}

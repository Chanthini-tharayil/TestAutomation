package BasicJava;

public class Minmultidimensionarray {
	public static void main(String[] args) {
	
		int a[][]=new int[2][2];
		a[0][0]=1;
	    a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		int test=a[0][0];
		int test1=a[0][0];
		int k=0;
		//print min number from array
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				
				if(a[i][j]<test)
				{
					test=a[i][j];
					k=j;
				}
			
		}
		
	}
System.out.println("min number is"+test);
//print max number from array
for(int i=0;i<2;i++)
{
	for(int j=0;j<2;j++)
	{
		
		if(a[i][j]>test1)
		{
			test1=a[i][j];
		}
	
}

}

System.out.println("max number is"+test1);
//print max number from column which has min number

int max= a[0][k];
int m=0;
while(m<2) {
	
	if(a[m][k]>max)
	{
		max=a[m][k];
	}
	m++;
}
System.out.println("max number from column is"+max);
}
}

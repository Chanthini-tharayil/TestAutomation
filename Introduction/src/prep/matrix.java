package prep;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = { { 1, 2, 3, 4 }, 
                { 5, 6, 7, 8 }, 
                { 9, 10, 11, 12 } };
		int mat1[][] = { { 1, 2, 3, 4 }, 
                { 5, 6, 7, 8 }, 
                { 9, 10, 11, 12 } };
		
		int mat2[][]=new int[mat.length][mat.length];
		for (int i = 0; i < mat.length; i++) 
		{
            // Loop through all elements of current row 
            for (int j = 0; j < mat[i].length; j++) 
                System.out.print(mat[i][j] + " ");
            System.out.println("\n");
            
            //logic for matrix addition-same applies for multiplication and substraction
         /*   for (i = 0; i < N; i++)  
                for (j = 0; j < N; j++)  
                    C[i][j] = A[i][j] + B[i][j];*/
            
            //Logic to find diagonal elements
            
            //Principal diagonal
            /* System.out.print("Principal Diagonal: "); 
  
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < n; j++)  
            { 
  
                // Condition for principal diagonal 
                if (i == j) 
                { 
                    System.out.print(mat[i][j] + ", "); 
                } 
            } 
        } 
        System.out.println(""); */
            
            //Secondary diagonal
            
            /*System.out.print("Secondary Diagonal: "); 
  
        for (int i = 0; i < n; i++)  
        { 
            for (int j = 0; j < n; j++)  
            { 
  
                // Condition for secondary diagonal 
                if ((i + j) == (n - 1))  
                { 
                    System.out.print(mat[i][j] + ", "); 
                } 
            } 
        } 
        System.out.println(""); */
		}

	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixmultiplication;

/**
 *
 * @author srahul.bscs13seecs
 */
public class MatrixMultiplication {
    
    public static int [][] iterative_multiplication(int[][] matrixA,int[][] matrixB) {
        // TODO code application logic here
        int col=matrixA.length;
        int row=matrixB[0].length;
        if (col != row )
            throw new IllegalArgumentException();
        
        int [][] result = new int [matrixA.length][matrixB[0].length];
        
        for (int i=0;i<result.length;i++)
        {
            for (int j=0;j<result[0].length;j++)
            {
                int sum=0;
                for(int k=0;k<col;k++)
                {
                    sum+=matrixA[i][k]*matrixB[j][k];
                }
                result[i][j]=sum;
            }
            
        }
        return result;
        
    }
    
    public static void stassen_multiplication(int[][] matrixA,int[][] matrixB){
        // TODO code application logic here
        
        // convert matrix in 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

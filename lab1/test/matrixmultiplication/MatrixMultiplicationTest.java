/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixmultiplication;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author srahul.bscs13seecs
 */
public class MatrixMultiplicationTest {
    
    public MatrixMultiplicationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of iterative_multiplication method, of class MatrixMultiplication.
     */
    @Test
    public void testIterative_multiplication() {
        System.out.println("iterative_multiplication");
        int[][] matrixA = {{2,2},{2,2}};
        int[][] matrixB = {{1,1},{1,1}};
        int[][] expResult = {{4,4},{4,4}};
        int[][] result = MatrixMultiplication.iterative_multiplication(matrixA, matrixB);
        assertArrayEquals(expResult, result);
        
        int[][] matrixA1 = {{0,1},{1,0}};
        int[][] matrixB1= {{1,1},{1,1}};
        int[][] expResult1 = {{1,1},{1,1}};
        int[][] result1= MatrixMultiplication.iterative_multiplication(matrixA1, matrixB1);
        assertArrayEquals(expResult1, result1);
       
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of stassen_multiplication method, of class MatrixMultiplication.
     */
    @Test
    public void testStassen_multiplication() {
        System.out.println("stassen_multiplication");
        int[][] matrixA = null;
        int[][] matrixB = null;
        MatrixMultiplication.stassen_multiplication(matrixA, matrixB);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}

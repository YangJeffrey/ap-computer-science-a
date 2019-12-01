package mp2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//algorithm:
//print menu
//prompt user for option
//read data from file	

public class MatrixProgram {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner matrixfile = new Scanner(new File("Z:\\csa\\MP2\\src\\mp2\\matrix.txt"));
		int line = matrixfile.nextInt();
		int[][] matrix = new int[line][line];
		int[][] matrix2 = new int[line][line];
		
		for (int i = 0; i < line * 4; i++) {
			line = matrixfile.nextInt();
			int[][] matrix = {{1,2},{3,4}};
			int[][] matrix2 = {{5,6},{7,8}};
		}
		
		int[][] matrix = {{1,2},{3,4}};
		int[][] matrix2 = {{5,6},{7,8}};
		
		printMenu();
		
		if (menuOption() == 1) {
			addMatrix(matrix, matrix2);
		}
		
		
	}
	
	/* Get the menu option selected by user */
	public static int menuOption() {
		Scanner obj =  new Scanner(System.in);
		int option = obj.nextInt();
		return option;
	}
	
	/* Print the menu */
	public static void printMenu() {
		System.out.println("Matrix Program");
		System.out.println("1. Print matrices");
		System.out.println("2. Sum of 2 matrices");
		System.out.println("3. Scalar multiplication of each matrix");
		System.out.println("4. Product of two matrices (A * B)");
		System.out.println("5. Product of two matrices (B * A)");
		System.out.println("6. Differences of two matrices (A - B)");
		System.out.println("7. Differences of two matrices (B - A)");
		System.out.println("8. Exit");
	}
	
	/* Print out a matrix in row column form */
	public static void printMatrix(int matrix[][]) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	/* Add one matrix to another */
	public static int[][] addMatrix(int[][] matrix, int[][] matrix2) {
		int[][] newmatrix = new int[matrix.length][matrix.length];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				newmatrix[row][col] = matrix[row][col] + matrix2[row][col];
			}
		}
		return newmatrix;
	}
	
	/* Subtracts one matrix from another */
	public static int[][] subtractMatrix(int[][] matrix, int[][] matrix2) {
		int[][] newmatrix = new int[matrix.length][matrix.length];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				newmatrix[row][col] = matrix[row][col] - matrix2[row][col];
			}
		}
		return newmatrix;
	}
	
	/* Multiply a scalar with a matrix*/
	public static int[][] scalarMultiplication(int[][] matrix, int scalar) {
		int[][] newmatrix = new int[matrix.length][matrix.length];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				newmatrix[row][col] = matrix[row][col] * scalar;
			}
		}
		return newmatrix;
	}
	
	/* Multiplies two matrices together */
	public static int[][] multiplyMatrix(int[][] matrix, int[][] matrix2) {
		int[][] newmatrix = new int[matrix.length][matrix.length];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				int sum = 0;
					for (int k = 0; k < matrix.length; k++) {
					sum += matrix[row][k] * matrix2[k][col];
				}
				newmatrix[row][col] = sum;
			}
		}
		return newmatrix;
	}	
	
	private static int singleMatrixDotProduct(int[][] matrix, int[][] matrix2, int i, int j) {
		int sum = 0;
		for (int k = 0; k < matrix.length; k++) {
			sum += matrix[i][k] * matrix2[k][j];
		}
		return sum;
	}
}




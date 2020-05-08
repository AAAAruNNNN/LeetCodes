package Array;

import java.util.Arrays;

public class RotateImage {
	public static void main(String args[]) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix);
		System.out.println(Arrays.deepToString(matrix));
	}
    public static void rotate(int[][] matrix) {
        int temp,n = matrix.length;
        for(int i = 0; i < n/2; i++){
            for(int j = 0; j < Math.ceil(n/2.0); j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                matrix[j][n-i-1] = temp;
            }
        }
    }
}

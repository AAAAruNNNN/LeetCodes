package LeetCode;

import java.util.Arrays;

public class FloodFill {
	
	public static void main(String args[]) {
		int[][] image = {{0,1,1},{0,1,1}};
		System.out.println(Arrays.deepToString(floodFill(image,1,1,1)));
	}
	
	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
//      [1,1,1]   [2,2,2]
//      [1,1,0]   [2,2,0]  0 0 0   1,1
//      [1,0,1]   [2,0,1]  0 1 1  (1,2)
//sr = 1, sc = 1, newColor = 2

     int n = image[sr][sc];
     floodFillRecursive(image,sr,sc,newColor,n,-1,-1);
     for(int i=0;i<image.length;i++)
         for(int j=0;j<image[i].length;j++)
             if(image[i][j] == -1)
                 image[i][j] = newColor;
     return image;
 }
 
 public static int[][] floodFillRecursive(int[][] image, int sr, int sc, int newColor, int i,int prevx,int prevy){
      if(image[sr][sc] != i)
          return image;
      image[sr][sc] = -1;
      if(sr>0 )
          floodFillRecursive(image,sr-1,sc,newColor,i,sr,sc);
      if(sr< image.length - 1 )
          floodFillRecursive(image,sr+1,sc,newColor,i,sr,sc);
      if(sc>0 )
          floodFillRecursive(image,sr,sc-1,newColor,i,sr,sc);
      if(sc< image[0].length-1 )
          floodFillRecursive(image,sr,sc+1,newColor,i,sr,sc);

      return image;
  }
}

package SortingAndSearching;

import java.util.Arrays;

public class MergeSortedArray {
	public static void main(String args[]) {
		int[] nums = {1,5,7,0,0,0};
		merge(nums ,3, new int[] {3,4,6},3);
		System.out.println(Arrays.toString(nums));
	}
	
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//      int temp = 0;
//      for(int i = 0,j=0; i < m + n; i++){
//          if(i>=m && j<n){
//              nums1[i] = nums2[j++];
//          }
//          if(i>0 && temp >= nums2[j]){
//              int temp2 = nums2[j];
//              nums2[j] = temp;
//              temp = nums1[i];
//              nums1[i] = temp2;
//              continue;
//          }
//          if(nums1[i] > nums2[j]){
//              temp = nums1[i];
//              nums1[i] = nums2[j++];
//          }
         
//          }//Use while when you are not sure about the number of iterations needed.
     while(m>0 && n>0){
         if(nums1[m-1] >= nums2[n-1]){
             nums1[m+n-1] = nums1[m-1];
             m--;
         }
         else{
             nums1[m+n-1] = nums2[n-1];
             n--;                
         }
     }
     while(n>0){
         nums1[m+n-1] = nums2[n-1];
         n--;
     }
     }
}

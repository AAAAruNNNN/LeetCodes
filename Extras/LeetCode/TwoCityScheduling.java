package LeetCode;

import java.util.Arrays;

public class TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
        /*
        Input:
            551       394       259     45          772        108
        [[259,770],[448,54],[926,667],[184,139],[840,118],[577,469]]
        Output:
        1706
        Expected:
        1859
        */
        int N = costs.length/2;
        int cost = 0;
        int[] A = new int[N*2];
        int countA = N, countB = N;
        int j=0;
        for(int[] i : costs){
            A[j++] = Math.abs(i[0]-i[1]);
        }
        Arrays.sort(A);
        for(int i=2*N - 1;i>=0;i--)
            if(countA > 0) {
                //cost+=(i[0]>i[1]?i[1]:i[0]);
            }
        return cost;
    }
}

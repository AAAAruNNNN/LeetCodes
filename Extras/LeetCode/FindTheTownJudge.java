package LeetCode;

public class FindTheTownJudge {
    
	public static void main(String args[]) {
		int[][] trust = {
				{1,2},{2,3}
				
				};
		System.out.println(findJudge(3,trust));
	}
	
    public static int findJudge(int N, int[][] trust) {
        int[] vote = new int[N];
        int[] count = new int[N];
        for(int i=0;i<trust.length;i++){
            vote[trust[i][1] - 1] += 1; 
            if(count[trust[i][0] - 1] == 0)
                count[trust[i][0] - 1]++;
        }
        int sum = 0;
        for(int i: count)
            sum += i;
        for(int i=0;i<N;i++)
            if(vote[i] == (N-1) && sum == (N-1))
                return i+1;
        return -1;
    }
}

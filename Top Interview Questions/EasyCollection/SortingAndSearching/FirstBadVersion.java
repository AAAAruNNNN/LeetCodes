package SortingAndSearching;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2; // mid = (l + r)/2
            if (isBadVersion(mid)) { //I've called a mock isBadVersion which'll always return true
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    
    public boolean isBadVersion(int a) {
    	return true;
    }
}

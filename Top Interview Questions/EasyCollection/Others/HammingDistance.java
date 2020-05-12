package Others;

public class HammingDistance {

	public static void main(String args[]) {
		System.out.println(hammingDistance(47,23));
	}
	
    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
	
}

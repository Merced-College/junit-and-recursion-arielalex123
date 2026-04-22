// Ariel Penaloza
// 04 / 21 / 2026
//Testing Recursion

public class TestingRecursion {
	public static int count8(int n) {
		
		if(n < 10)
			if(n == 8) 
				return 1;
			else
				return 0;
		
		int onesPlace = n % 10;
		n /= 10;
		int tensPlace = n %10;
		
		if(onesPlace == 8)
			if(tensPlace == 8)
				return 2 + count8(n);
			else 
				return 1 + count8(n);
		else 
			return count8(n);
	}//end count8
	
	public static void main(String [] arg) {
		System.out.println(count8(8818));
	
	
	
	}
	
}

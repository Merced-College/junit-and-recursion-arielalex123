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
	
	public static int strCount(String str, String sub) {
		
		if(str.length() < sub.length())
			return 0;
		if(str.substring(0 , sub.length()).equals(sub))
			return 1 + strCount(str.substring(sub.length()), sub);
		else
			return strCount(str.substring(1), sub);
	}// end strCount
	
	public static  String stringClean(String str) {
		
		
	}
	
	public static void main(String [] arg) {
		//System.out.println(count8(8818));
		//System.out.println(strCount("catcowcat", "cat"));
	
	
	
	}
	
}

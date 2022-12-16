import java.util.*;
public class LongestPalinSubstring {

	static int longestPalSubstr(String str)
	{
		int n = str.length(); 
		if (n < 2) {
			return n; 
		}
		int maxLen = 1,start=0;
		int low, high;
		System.out.println("All possible palindromes: ");
		for (int i = 0; i < n; i++) {
			low = i - 1;
			high = i + 1;
			while ( high < n && str.charAt(high) == str.charAt(i)) 							
				high++;
	
			while ( low >= 0 && str.charAt(low) == str.charAt(i))				
				low--;
	
			while (low >= 0 && high < n && str.charAt(low) == str.charAt(high) ){
				low--;
				high++;
		}

		int length = high - low - 1;
		
		
		if (str.substring(low+1, high).length() > 2) {
			System.out.println(str.substring(low+1, high));
		}
		
		if (maxLen < length){
			maxLen = length;
			start=low+1;
		}
	}
	System.out.print("Longest palindrome substring is: ");
	System.out.println(str.substring(start, start + maxLen ));
	return maxLen;
	
}

	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.next();
		System.out.println("Length is: " + longestPalSubstr(str));
		sc.close();
	}
}

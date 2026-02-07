//	We'll say that a "pair" in a string is two instances of a char separated by a 
//	char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x.
//	Recursively compute the number of pairs in the given string.

package javaLab.Lab2;

public class CountPairs {
	static int pairs;

	public static void main(String[] args) {
		

		System.out.println(countPairs("axa"));
		System.out.println(countPairs("axax"));
		System.out.println(countPairs("axbx"));
	}

	private static int countPairs(String string) {
		if(string.length()< 3)
			return 0;
		
		if(string.charAt(0) == string.charAt(2))
			pairs++;
		
		
		return pairs+countPairs(string.substring(1));
	}

}

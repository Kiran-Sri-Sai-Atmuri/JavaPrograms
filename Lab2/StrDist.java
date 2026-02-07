//	Given a string and a non-empty substring sub, compute recursively the largest 
//	substring which starts and ends with sub and return its length

package javaLab.Lab2;

public class StrDist {
	
	public static int strDist(String s,String sub) {
		

		if(s.length() < sub.length())
			return 0;
		
		if(s.startsWith(sub) && s.endsWith(sub))
			return s.length();
		
		if(!s.startsWith(sub))
			return strDist(s.substring(1),sub);
		
		
		if(!s.endsWith(sub))
			return strDist(s.substring(0,s.length()-1),sub);
		
		else return 0;
	}

	public static void main(String[] args) {
		System.out.println(strDist("catcowcat", "cat"));
		System.out.println(strDist("catcowcat", "cow") );
		System.out.println(strDist("cccatcowcatxx", "cat"));
		System.out.println(strDist("cat", "cccatcowcatxx"));
	}

}

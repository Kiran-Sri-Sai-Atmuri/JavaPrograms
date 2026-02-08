package javaLab.Lab7;

public class NumberCheck {

	public static void numCheck(int n) throws PrimeException {
		boolean flag = true;
		for(int i=3 ; i<n ; i++)
			if(n % i == 0)
				flag = false;
		if(flag)
			System.out.println(n);
		else
			throw new PrimeException();
	}
}

//	Create class Number with only one private instance variable as a double 
//	primitive type. To include the following methods (include respective 
//	constructors) isZero( ), isPositive(), isNegative( ), isOdd( ), isEven( ), 
//	isPrime(), isAmstrong() the above methods return boolean primitive type. 
//	getFactorial(), getSqrt(), getSqr(), sumDigits(), getReverse() the above 
//	methods return double primitive type

package javaLab.Lab3;

public class Myclass{
	
	public static void main(String[] args) {
		Number n = new Number(12);
		System.out.println(n.getReverse());
	}
}



class Number {

private double num;

public Number(double num) {
	this.num = num;
}

public boolean isPositive() {
	if(num >= 0)
		return true;
	return false;
}

public boolean isNegative() {
	if(num <= 0)
		return true;
	return false;
}

public boolean isOdd() {
	if(!(num%2==0))
		return true;
	return false;
}

public boolean isEven() {
	if(num%2==0)
		return true;
	return false;
}

public boolean isPrime() {
	for(int i=2;i<num;i++)
		if(num%i==0)
			return false;
	return true;
}

public boolean isAmstrong() {
	int x = (int)num;
	int y=x;
	int z=x;
	int c=0;
	
	while(y!=0) {
		c++;
		y/=10;
	}
	
	double n=0;
	
	while(z!=0){
		int a=z%10;
		double d = Math.pow(a,c);
		n = n+d;
		z/=10;
	}
	
	if(n==x)
		return true;
	else
		return false;

}

public double getFactorial() {
	double fact = 1; 
	for(double i = num ; i>=1 ; i--)
		fact*=i;
	return fact;
}

public double getSqrt() {
	return Math.sqrt(num);
}

public double getSqr() {
	return (num * num);
}

public double sumDigits() {
	int n = (int)num;
	int sum = 0;
	while(n!=0) {
		int x = n%10;
		sum+=x;
		n/=10;
	}
	
	return sum;
}

public double getReverse() {
	int x=(int)num;
	int y=x;
	int c=0;
	
	while(y!=0) {
		c++;
		y/=10;
	}
	
	int n=0;
	
	for(int i=0;i<c;i++) {
		int a = x%10;
		n=(n*10)+(a);
		x/=10;
	}
	return n;
}
}

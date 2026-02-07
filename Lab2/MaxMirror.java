//	Say that a "mirror" section in an array is a group of contiguous elements such 
//	that somewhere in the array, the same group appears in reverse order. For 
//	example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 
//	3} part). Return the size of the largest mirror section found in the given array


package javaLab.Lab2;

public class MaxMirror {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 8, 9, 3, 2, 1};
		
		
		int last = a.length-1;
		int weight = 0;
		for(int i=0;i<a.length/2 ; i++) {
			if(a[i] == a[last]) {
				weight++;
				last--;
			}
			
		}
	
	
		
		
		
		System.out.println(weight);
	}
}
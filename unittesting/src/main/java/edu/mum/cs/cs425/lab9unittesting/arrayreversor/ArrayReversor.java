package edu.mum.cs.cs425.lab9unittesting.arrayreversor;

import edu.mum.cs.cs425.lab9unittesting.arrayreversor.service.ArrayFlattenerServirce;

public class ArrayReversor {
	private ArrayFlattenerServirce arrayFlattenerServirce; 
	
	public ArrayReversor(ArrayFlattenerServirce arrayFlattenerServirce) {
		this.arrayFlattenerServirce = arrayFlattenerServirce;
	}
	
	public int[] reverseArray(int[][] array) {	
		
		int[] flatArray = arrayFlattenerServirce.flattenArray(array);
		if(flatArray == null) return null;
		int start = 0;
		int end = flatArray.length -1;
		
		while(start < end) {
			int temp = flatArray[start];
			flatArray[start] = flatArray[end];
			flatArray[end] = temp;
			start++;
			end--;
		}
		
		return flatArray;
	}

	

}

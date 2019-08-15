package edu.mum.cs.cs425.lab9unittesting.flattenArray;

import java.util.ArrayList;
import java.util.List;

public class FlatteningArray {
	
	public int[] flattenArray(int[][]  a_in) {
		if(a_in == null) return null;
		List<Integer> flattenedList = new ArrayList<Integer>();
		
		for(int i = 0; i < a_in.length; i++) {
			for(int j =0; j < a_in[i].length; j++) {
				flattenedList.add(a_in[i][j]);
			}
		}
		int[] flattenedArray = new int[flattenedList.size()];
		for(int i = 0; i < flattenedList.size(); i++) {
			flattenedArray[i] = flattenedList.get(i);
		}
		
		return flattenedArray;
		
	}

}

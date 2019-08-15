package edu.mum.cs.cs425.lab9unittesting.flattenArray;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FlatteningArrayTest {
	private FlatteningArray flatteningArray;
	

	@Before
	public void setUp() throws Exception {
		flatteningArray = new FlatteningArray();
	}

	@After
	public void tearDown() throws Exception {
		flatteningArray = null;
	}

	@Test
	public void test() {
		int[] expected = {1,3,0,4,5,9};
		int[] actual = flatteningArray.flattenArray(new int [][] {{1,3},{0},{4,5,9}});
		assertArrayEquals(expected, actual);
	}

}

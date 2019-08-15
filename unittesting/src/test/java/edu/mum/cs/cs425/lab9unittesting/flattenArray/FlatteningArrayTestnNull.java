package edu.mum.cs.cs425.lab9unittesting.flattenArray;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FlatteningArrayTestnNull {

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
		int[] expected = null;
		int[] actual = flatteningArray.flattenArray(null);
		assertArrayEquals(expected, actual);
	}


}

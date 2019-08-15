package edu.mum.cs.cs425.lab9unittesting.arrayreversor;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.mum.cs.cs425.lab9unittesting.arrayreversor.service.ArrayFlattenerServirce;
import junit.framework.TestCase;

public class ArrayReversorTest extends TestCase {
	
	private ArrayReversor arrayReversor;
	private ArrayFlattenerServirce arrayFlattenerServirce = mock(ArrayFlattenerServirce.class);

	@Before
	protected void setUp() throws Exception {
		this.arrayReversor = new ArrayReversor(arrayFlattenerServirce);
	}

	@After
	protected void tearDown() throws Exception {
		this.arrayReversor = null;
	}
	
	@Test
	public void testReverseArrayNull() {
		int[][] input = null;
		int[] expected = null;
		when(arrayReversor.reverseArray(input)).thenReturn(null);
		int[] actual = arrayReversor.reverseArray(input);
		assertArrayEquals(expected, actual);
		verify(arrayFlattenerServirce).flattenArray(input);
		
	}

}

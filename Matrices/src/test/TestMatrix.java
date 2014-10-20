package test;

import static org.junit.Assert.*;
import junit.framework.Assert;
import logic.Matrix;

import org.junit.Test;

public class TestMatrix {

	@Test
	public void testConstructDefault() {
		Matrix matrix = new Matrix();
		assertEquals(0, matrix.sum());
	}
	
	@Test
	public void testConstruct4x3() {
		Matrix matrix = new Matrix(40, 30);
		assertEquals(0, matrix.sum());
	}
	
	@Test
	public void testConstructMyData1() {
		int[][] mat = {{1,1},{2,2}};
		Matrix matrix = new Matrix(mat);
		assertEquals(6,matrix.sum());
	}
	
	@Test
	public void testConstructMyData2() {
		int[][] mat = {{1,1,1},{2,2,2}};
		Matrix matrix = new Matrix(mat);
		assertEquals(9, matrix.sum());
	}
	
	@Test
	public void testConstructMyData3() {
		int[][] mat = {{1,1,1},{2,2},{5,5,5}};
		Matrix matrix = new Matrix(mat);
		assertEquals(22, matrix.sum());
	}

}

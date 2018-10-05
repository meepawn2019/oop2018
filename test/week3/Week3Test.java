package week3;
import org.junit.Test;

import static org.junit.Assert.*;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax1(){
      assertEquals(5, Week3.max(3,5));
    }
	@Test
    public void testMax2(){
      assertEquals(999, Week3.max(-1,999));
    }
	@Test
    public void testMax3(){
      assertEquals(-3, Week3.max(-9,-3));
    }
	@Test
    public void testMax4(){
      assertEquals(1, Week3.max(-5,1));
    }
	@Test
    public void testMax5(){
      assertEquals(8, Week3.max(-100,8));
    }
    @Test
    // TODO: Viết 5 testcase cho phương thức minOfArray()
    public void testMinOfArray5(){
      int[] a = {0, 1, 2, 3};
      assertEquals(0, Week3.minOfArray(a));
    }
	@Test
    // TODO: Viết 5 testcase cho phương thức minOfArray()
    public void testMinOfArray4(){
      int[] a = {-5, 0, -2, 7};
      assertEquals(-5, Week3.minOfArray(a));
    }
	@Test
    // TODO: Viết 5 testcase cho phương thức minOfArray()
    public void testMinOfArray3(){
      int[] a = {-10, -11, -12, -13};
      assertEquals(-13, Week3.minOfArray(a));
    }
	@Test
    // TODO: Viết 5 testcase cho phương thức minOfArray()
    public void testMinOfArray2(){
      int[] a = {-5, -2, -7, 100};
      assertEquals(-7, Week3.minOfArray(a));
    }
	@Test
    // TODO: Viết 5 testcase cho phương thức minOfArray()
    public void testMinOfArray1(){
      int[] a = {6, 5, 100, -100};
      assertEquals(-100, Week3.minOfArray(a));
    }
    @Test
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    public void testCalculateBMI1(){
      assertEquals("Binh thuong",Week3.calculateBMI(50.5, 1.6));
    }
	 @Test
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    public void testCalculateBMI2(){
      assertEquals("Beo phi",Week3.calculateBMI(90,1.8));
    }
	 @Test
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    public void testCalculateBMI3(){
      assertEquals("Thieu can",Week3.calculateBMI(40, 1.59));
    }
	 @Test
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    public void testCalculateBMI4(){
      assertEquals("Binh thuong",Week3.calculateBMI(57,1.62));
    }
	 @Test
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    public void testCalculateBMI5(){
      assertEquals("Binh thuong",Week3.calculateBMI(50.5, 1.6));
    }
}

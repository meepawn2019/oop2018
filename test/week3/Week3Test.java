package week3;
import org.junit.Test;

import static org.junit.Assert.*;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax(){
      assertEquals(5, Week3.max(3,5));
      assertEquals(5, Week3.max(5,2));
      assertEquals(-3, Week3.max(-5, -3));
      assertEquals(0, Week3.max(-1, 0));
      assertEquals(3, Week3.max(-2,3));
    }
    @Test
    // TODO: Viết 5 testcase cho phương thức minOfArray()
    public void testMinOfArray(){
      int[] a = {0, 1, 2, 3};
      int[] b = {-3, 0, 1, 3};
      int[] c = {5, 4, 3, -1, 2};
      int[] d = {-100, 3, 5, 4, 200};
      int[] e = {-200, -500, 600, 571};
      assertEquals(0, Week3.minOfArray(a));
      assertEquals(-3, Week3.minOfArray(b));
      assertEquals(-1, Week3.minOfArray(c));
      assertEquals(-100, Week3.minOfArray(d));
      assertEquals(-500, Week3.minOfArray(e));
    }
    @Test
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    public void testCalculateBMI(){
      assertEquals("Binh thuong",Week3.calculateBMI(50.5, 1.6));
    }
}

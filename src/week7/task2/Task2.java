package week7.task2;
import java.io.*;

public class Task2 {
	public static void main(String[] args){
		// int[] data = null;
		// try{
		// 	System.out.println(data[2]); //NullPointerException
		// }
		// catch(NullPointerException e){
		// 	System.out.println("Loi null pointer");
		// }
		// ***************************
		// int[] data = {1, 2};
		// try{
		// 	System.out.println(data[3]); // IndexOutOfBoundException
		// }
		// catch(IndexOutOfBoundsException e){
		// 	System.out.println("Index out of bound");
		// }
		// ****************************
		// try{
		// 	Object i = Integer.valueOf(5);
		// 	String a = (String) i; // ClassCastException
		// }
		// catch(ClassCastException e){
		// 	System.out.println("Ep kieu khong hop le");
		// }
		// ****************************
		try{
			BufferedReader rd = new BufferedReader(new FileReader(new File("/src/test.txt"))); //IOException hoac FileNotFoundException
        rd.readLine();
		}catch(IOException e){
			System.out.println("Khong thay file");
		}
	}
}

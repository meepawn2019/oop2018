package week9;

//import java.io.IOException.*;
import java.io.*;
import java.util.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class Utils {
    public static String readContentFromFile(String path) throws IOException{
    	File file = new File(path);
    	Scanner sc = new Scanner(file);
    	String content = sc.useDelimiter("\\Z").next();
    	return content;
    }

    public static void writeContentToFile(String path) throws IOException{
    	System.out.println("Nhap tu muon viet: ");
    	Path path1 = Paths.get(path);
    	Scanner sc = new Scanner(System.in);
    	String content = sc.next();
    	byte[] strToBytes = content.getBytes(); 
    	Files.write(path1, strToBytes);
    }

    public static void writeContentToFile1(String path) throws IOException{
    	System.out.println("Nhap tu muon viet: ");
    	Path path1 = Paths.get(path);
    	Scanner sc = new Scanner(System.in);
    	String content = sc.next();
    	byte[] strToBytes = content.getBytes(); 
    	Files.write(path1, strToBytes, StandardOpenOption.APPEND);
    }
    public static File findFileByName(String folderPath, String fileName){
    		String findFile = folderPath + "/" + fileName;
    		System.out.println(findFile);
    		return new File(findFile);
    }

    public static void main(String[] args) throws IOException{
    	System.out.println(Utils.readContentFromFile("./src/week9/test.txt"));
    	Utils.writeContentToFile("./src/week9/test.txt");
    	Utils.writeContentToFile1("./src/week9/test.txt");
    	File test = Utils.findFileByName("./src/week9", "test1.txt");
    }

}

package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
	private static List<String> getAllFunction(File path) throws FileNotFoundException {
		List<String> stringList = new ArrayList<>();
		Scanner sc = new Scanner(path);
		String[] strings = path.getName().split("\\.");
		String add = "";
		int dem = 0;
		int dem1 = 0;
		while(sc.hasNext()){
			String temp = sc.nextLine();
			if(temp.contains("class " + strings[0])) dem1++;
			if(temp.contains("static")) dem++;
			if(dem > 0){
				add += temp + "\n";
			}
			if(temp.contains("{") && !temp.contains("static") && !temp.contains("class " + strings[0])) dem++;
			if(temp.contains("}")) dem--;
			if(dem == 0 && dem1 > 0){
				stringList.add(add);
				add = "";
			}
		}
		return stringList;
	}

	public String findFunctionByName(String name) throws FileNotFoundException {
		File file = new File("./src/week9/Utils.java");
		boolean isRight = false;
		Scanner sc = new Scanner(file);
		String method = "";
		String[] getMethod = name.split("\\(");
		String nameMethod = getMethod[0];
		String variable = getMethod[1].replace(")", "");
		String[] getEV = variable.split(",");
		int countComment = 0;
		int dem = 0;
		while(sc.hasNext()){
			String temp = sc.nextLine();
			if(temp.contains("{")) dem++;
			if(temp.contains("}")) dem--;
			if(temp.contains("/*")) countComment++;
			if(temp.contains("*\\")) countComment--;
			if(countComment == 0 && dem == 2 && temp.contains(nameMethod) && !temp.contains("//")){
				String getVariable = temp.substring(temp.indexOf("(")+1,temp.lastIndexOf(")"));
				String[] getEachVar = getVariable.split(",");
				if(getEV.length==getEachVar.length){
					int i;
					for(i=0; i<getEV.length; i++){
						if(!getEachVar[i].contains(getEV[i])) break;
					}
					if(i == getEV.length) isRight = true;
				}
			}
			if(dem == 1 && isRight){
				method += temp + "\n";
				isRight = false;
			}
			if(isRight) method += temp + "\n";
		}
		return method;
	}

	public static void main(String[] args) throws FileNotFoundException {
		List<String> test;
		test = getAllFunction(new File("./src/week9/Utils.java"));
		/*for(String string : test){
			System.out.println(string);
		}*/
		System.out.println(test.get(1));
		File file = new File("./src/week9/Utils.java");
		String[] strings = file.getName().split("\\.");
		System.out.println(strings[0] + "\n" + strings[1]);
		Task1 task1 = new Task1();
		System.out.println(task1.findFunctionByName("writeContentToFile(String)"));
	}
}

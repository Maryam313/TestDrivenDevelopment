
package TDD2;

import java.util.ArrayList;

/**
 * Implement a method that takes a string and a delimiter character 
 * as an argument and returns a reversed value as a string.
 * 
 */
public class SplitMethod {

	public static void main(String[] args) {
		String str="Reverse me if you can";
		char delimiter = ' ';
		System.out.println("Output  is:" + splitMethod(str,delimiter));
		splitMethod(str,delimiter);
	}
	
	public static ArrayList<String> splitMethod(String str, Character delimiter) {
		String chaString=" ";
		ArrayList<String> char1 = new ArrayList<>();
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index)== delimiter) {
				char1.add(chaString);
				chaString=" ";
			} else {
				chaString=chaString+str.charAt(index);
			}	
		}
		char1.add(chaString);
		return char1;
	}
}








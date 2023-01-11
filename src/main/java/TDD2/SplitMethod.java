/**
 * 
 */
package TDD2;

import java.util.ArrayList;

/**
 * @author LAP-2
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
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)== delimiter) {
				char1.add(chaString);
				chaString=" ";
			} else {
				chaString=chaString+str.charAt(i);
			}	
		}
		char1.add(chaString);
		return char1;
	}
}








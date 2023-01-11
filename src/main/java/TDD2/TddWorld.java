package TDD2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 */

/**
 * @author LAP-2
 *
 */
public class TddWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting Application..!");
	}

	public int subtract(int first, int second) {
		return first - second;
	}

	public HashMap<String, String> getData() {
		HashMap<String, String> retrieveData = new HashMap<String, String>();
		String StatusCode = "FAIL";
		StatusCode = "SUCCESS";
		retrieveData.put("status", StatusCode);
		retrieveData.put("data", "<html><h1>Some Data</h1></html>");
		return retrieveData;

	}

	public double calculatePower(int base, int exponent) {
		HashMap<String, Integer> power = new HashMap<String, Integer>();
		int result = base;
		for (int i = 1; i < exponent; i++) {
			result *= base;
			power.put("result:", result);
		}
		for (String k : power.keySet()) {
			System.out.println(k + "{" + power.get(k) + "}");
		}
		return result;

	}

	public HashMap<String, ArrayList<Integer>> evenOrOdd(int[] arr) {
		ArrayList<Integer> evenNum = new ArrayList<Integer>();
		ArrayList<Integer> oddNum = new ArrayList<Integer>();
		HashMap<String, ArrayList<Integer>> Hsmap = new HashMap<String, ArrayList<Integer>>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenNum.add(arr[i]);
			}
			if (arr[i] % 2 == 1) {
				oddNum.add(arr[i]);

			}

		}
		Hsmap.put("even:", evenNum);
		Hsmap.put("odd:", oddNum);

		System.out.println(Hsmap);

		return Hsmap;

	}

	public String reverse(String input) {
		if (input == null) {
			return null;
		}
		char[] chars = new char[input.length()];
		for (int i = 0; i < input.length(); i++) {
			chars[i] = input.charAt(input.length() - 1 - i);
		}
		return new String(chars);
	}
	
	
	
	
}

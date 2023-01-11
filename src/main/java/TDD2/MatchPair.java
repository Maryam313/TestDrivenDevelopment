package TDD2;

import java.util.Stack;
import javax.sound.midi.VoiceStatus;

/**
 * @author Done by Maryam..
 *
 */
public class MatchPair {

	public static boolean BalancedExpression(String string) {
		Stack<Character> stack = new Stack<Character>();
		try {
			for (int index = 0; index < string.length(); index++) {
				char par = string.charAt(index);
				if (par == '[' || par == '{' || par == '(') {
					stack.push(par);
				} else if (par == ']' || par == '}' || par == ')') {
					if (stack.empty()) {
						return true;
					}
					switch (par) {
					case ']':
						if (stack.pop() != '[') {
							return false;
						}
						break;
					case '}':
						if (stack.pop() != '{') {
							return false;
						}
						break;
					case ')':
						if (stack.pop() != '(') {
							return false;
						}
						break;
					default:
						break;
					}
				}
			}
			if (!stack.empty()) {
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			throw new IllegalArgumentException("Invalid characters in expression");
		}
	}

	public static void main(String[] args) {

		String string = "([arr{(10)}])";
		System.out.println("-->> " + BalancedExpression(string) + "-->>");
	}

}
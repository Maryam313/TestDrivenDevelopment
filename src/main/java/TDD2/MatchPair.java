package TDD2;

import java.util.Stack;
import javax.sound.midi.VoiceStatus;

/**
 * @author Done by Maryam..
 *
 *Implement a method that takes a string and tells if it contains 
 *the right amount of opening and closing parenthesis, braces && brackets.
 *
 *
 */

public class MatchPair {
	public  boolean BalancedExpression(String string) {
		Stack<Character> stack = new Stack<Character>();
		try {
			for (int index = 0; index < string.length(); index++) {
				char pair = string.charAt(index);
				if (pair == '[' || pair == '{' || pair == '(') {
					stack.push(pair);
				} else if (pair == ']' || pair == '}' || pair == ')') {
					if (stack.empty()) {
						return true;
					}
					switch (pair) {
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
			throw new NullPointerException("Invalid characters in expression");
		}
	}

	public static void main(String[] args) {

		String string = "([arr{(10)}])";
		System.out.println("-->> " + BalancedExpression(string) + "-->>");
	}

}

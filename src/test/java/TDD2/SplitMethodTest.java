package TDD2;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import TDD2.SplitMethod;

class SplitMethodTest {
	@Test
	@DisplayName("Take null for both of the arguments. ")
	void spliteNull() {
	String input=null;
	ArrayList<String> str = new ArrayList<>();
	str.add("");
	SplitMethod split = new SplitMethod();
	assertEquals(str,split.splitMethod(input,null));	
	}

	@Test
	@DisplayName("Take empty for both of the arguments. ")
	void splitEmpty() {
	SplitMethod split = new SplitMethod();	
	char input=' ';
	ArrayList<String> str = new ArrayList<>();
	assertEquals(str,split.splitMethod(" ", input));

	}

	@Test
	@DisplayName("Take input. ")
	void split() {
		SplitMethod split = new SplitMethod();
		ArrayList<String> str = new ArrayList<>();
		String input="Reverse me ";
		str.add("Reverse");
		str.add("me");
	assertEquals(str,split.splitMethod(input, ' '));

	}


}
package TDD2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MatchPairTest {

	@Test
	@DisplayName("Take an empty string :")
	void test() {	
	String str="";
	MatchPair pair=new MatchPair();
	assertEquals(true, pair.BalancedExpression(str));
	}
	
	@Test
	@DisplayName("Take null: ")
	void Null() {
	MatchPair pair=new MatchPair();
	String str=null;
	assertThrows(NullPointerException.class, () -> pair.BalancedExpression(str));
   
	}
	
	@Test
	@DisplayName("Can throw an exception.: ")
	public void testBalancedExpression() {
		MatchPair pair=new MatchPair();
	    try {
	        pair.BalancedExpression("[{(a+b)}]");
	        fail("Expected an IllegalArgumentException to be thrown");
	    } catch (IllegalArgumentException e) {
	        assertEquals("Invalid characters in expression", e.getMessage());
	    }
	}

	
}

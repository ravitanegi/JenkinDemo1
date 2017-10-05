import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CountLetterTest {
 CountLetter obj1;
 String str;
	@Before
	public void setUp() throws Exception {
		obj1= new CountLetter();
		str="ravita";
	}

	@After
	public void tearDown() throws Exception {
		obj1= null;
		str=null;
	}

	@Test
	public void testCountA() {
		int output = obj1.CountA(str);
		assertEquals(2,output);
		
	}

}

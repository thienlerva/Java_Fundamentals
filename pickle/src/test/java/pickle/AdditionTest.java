package pickle;

import org.junit.Test;



import static org.junit.Assert.*;

import org.junit.BeforeClass;

public class AdditionTest {
	
	private static MathematicianBean bean;
	
	@BeforeClass
	public static void setup() {
		bean = new AlbertEinsteinBean();
	}
	
	@Test
	public void testAddition() {
		
		assertEquals(10, bean.add(5, 5));
		
	}

}

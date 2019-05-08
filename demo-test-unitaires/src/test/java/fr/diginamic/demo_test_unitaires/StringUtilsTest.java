package fr.diginamic.demo_test_unitaires;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Ignore;
import org.junit.Test;

public class StringUtilsTest {
	
	@Test
	public void testLevenshteinDistance() {
		
		int result = StringUtils.levenshteinDistance("chine", "chien");
		assertEquals(2, result);
	
	}
	
	@Ignore
	@Test
	public void testLevenshteinDistanceIfValuesNull() {
				assertNull(StringUtils.levenshteinDistance(null, null));
	}

}

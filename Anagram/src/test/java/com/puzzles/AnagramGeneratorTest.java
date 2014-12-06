/**
 * 
 */
package com.puzzles;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author family
 *
 */
public class AnagramGeneratorTest {

	/**
	 * Test method for {@link com.puzzles.AnagramGenerator#generateAnagrams(java.util.List)}.
	 */
	@Test
	public final void testGenerateAnagrams() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.puzzles.AnagramGenerator#readInputFile(java.lang.String)}.
	 */
	@Test
	public final void testNullReadInputFile() {
		AnagramGenerator anagram = new AnagramGenerator();
		assertNull(anagram.readInputFile(""));
	}

}

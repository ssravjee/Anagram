/**
 * 
 */
package com.io;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author family
 *
 */
public class FileReaderTest {

	/**
	 * Test method for {@link com.io.FileReader#getWords(java.lang.String)}.
	 */
	@Test
	public final void testNullGetWords() {
		FileReader reader = new FileReader();
		assertNull(reader.getWords(""));
	}

}

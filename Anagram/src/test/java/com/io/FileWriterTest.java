/**
 * 
 */
package com.io;

import static org.junit.Assert.assertNull;

import java.util.HashMap;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

/**
 * @author family
 *
 */
public class FileWriterTest {

	/**
	 * Test method for {@link com.io.FileWriter#writeWords(java.lang.String, java.util.HashMap)}.
	 */
	@Test
	public final void testWriteWords() {
		FileWriter writer = new FileWriter();
		HashMap<String, List<String>> words = null;
		assertNull(writer.writeWords("", words));
		//Assert.assertEquals(expected, actual)
	}

}

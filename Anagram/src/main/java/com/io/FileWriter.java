package com.io;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * This class is responsible for writing to a file
 * 
 * @author family
 * 
 */
public class FileWriter {
	/**
	 * This method writes to a file
	 * <code>List<String></code>
	 * 
	 * @param fileName
	 * @return
	 */
	public boolean writeWords(String fileName, HashMap<String, List<String>> words) {
		
		java.io.BufferedWriter fWriter = null;
		
		try {
		
			fWriter = new java.io.BufferedWriter(new java.io.FileWriter(fileName));
			Set<String> keys = words.keySet();
			for (Iterator<String> iterator = keys.iterator(); iterator.hasNext();) {
				String string = (String) iterator.next();
				List<String> wordList = words.get(string);
				for (Iterator<String> iterator2 = wordList.iterator(); iterator2
						.hasNext();) {
					String output = (String) iterator2.next();
					fWriter.write(output + " ");
				}
				fWriter.write("\n");
				
			}
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				fWriter.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return true;
	}
}

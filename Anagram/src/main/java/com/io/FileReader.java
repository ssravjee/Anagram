package com.io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is responsible for reading a file
 * 
 * @author family
 * 
 */
public class FileReader {
	/**
	 * This method reads the file and returns the words as a
	 * <code>List<String></code>
	 * 
	 * @param fileName
	 * @return
	 */
	public List<String> getWords(String fileName) {
		List<String> words = new ArrayList<String>();
		
		File fileObj = new File(fileName);
		
		if(!isValidReadableFile(fileObj)) {
			return null;
		}
		
		java.io.BufferedReader fReader = null;
		
		try {
		
			fReader = new java.io.BufferedReader(new java.io.FileReader(fileName));
			String word = null;
			while((word = fReader.readLine()) != null) {
				words.add(word);
			}
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				fReader.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return words;
	}

	/**
	 * @param fileName
	 */
	private boolean isValidReadableFile(File fileObj) {
		if(!fileObj.exists()) {
			System.out.println("Please ensure that the file exist  : " + fileObj.getName());
			return false;
		}
		if(!fileObj.canRead()) {
			System.out.println("Please ensure that the file has read access  : " + fileObj.getName());
			return false;
		}
		return true;
	}
}

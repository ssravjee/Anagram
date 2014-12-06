package com.puzzles;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.io.FileReader;

public class AnagramGenerator {
	/**
	 * @param words
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	public HashMap<String, List<String>> generateAnagrams(URL url, List<String> words)
			throws MalformedURLException, IOException {
		// load the dictionary into sc object
		Scanner sc = loadDictionary(url);

		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

		while (sc.hasNextLine()) {
			String word = sc.nextLine();
			String sortedWord = sortString(word); // this is a key
			ArrayList<String> anagrams = map.get(sortedWord); // this is a value

			if (anagrams == null)
				anagrams = new ArrayList<String>();
			anagrams.add(word);
			map.put(sortedWord, anagrams);
		}
		HashMap<String, List<String>> writeMap = new HashMap<String, List<String>>();
		List<String> anagrams = null;
		for (int i = 0; i < words.size(); i++) {
			anagrams = map.get(sortString(words.get(i))); // testing
			writeMap.put(words.get(i), anagrams);
		}
		sc.close();
		return writeMap;
	}

	/**
	 * @param url
	 * @return
	 * @throws IOException
	 */
	public Scanner loadDictionary(URL url) throws IOException {
		Scanner sc = new Scanner(url.openStream());
		return sc;
	}

	/**
	 * @return
	 */
	public List<String> readInputFile(String fileName) {
		// read input_word.txt
		FileReader f = new FileReader();
		List<String> words = f.getWords(fileName);
		return words;
	}

	private static String sortString(String w) {
		char[] ch = w.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}
}
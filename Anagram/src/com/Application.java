package com;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

import com.puzzles.AnagramGenerator;

public class Application {
	private static final String INPUT_FILE = "input_words.txt";
	private static final String OUTPUT_FILE = "output_words.txt";
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://codekata.com/data/wordlist.txt");
		AnagramGenerator generator = new AnagramGenerator();
		List<String> words = generator.readInputFile(INPUT_FILE);
		HashMap<String, List<String>> writeMap = generator
				.generateAnagrams(url, words);
		com.io.FileWriter fWriter = new com.io.FileWriter();
		fWriter.writeWords(OUTPUT_FILE, writeMap);
	}
}

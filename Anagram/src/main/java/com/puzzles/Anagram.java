package com.puzzles;

import java.util.*;
import java.io.*;
import java.net.*;

public class Anagram
{
	public static void main(String[] args) throws IOException
	{
		URL url = new URL("http://andrew.cmu.edu/course/15-121/dictionary.txt");
		Scanner sc = new Scanner( url.openStream() );

		HashMap<String, ArrayList<String>> map =  new HashMap<String, ArrayList<String>>();

		while( sc.hasNextLine() )
		{
			String word = sc.nextLine();
			String sortedWord = sortString(word); // this is a key

			ArrayList<String> anagrams = map.get( sortedWord );  //this is a value

			if( anagrams == null ) anagrams = new ArrayList<String>();

			anagrams.add(word);
			map.put(sortedWord, anagrams);
		}
		System.out.println(map.get(sortString("jaw")));   //testing
		sc.close();

	}
	private static String sortString( String w )
	{
		char[] ch = w.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}
}
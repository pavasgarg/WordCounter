package com.pg.business;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

public class WordCounter {

	// using static collection object: ConcurrentHashMap,
	// in case there are multiple thread trying to use this collection object
	private static Map<String, Integer> wordMap = new ConcurrentHashMap<String, Integer>();
	
	private WordTranslator wordTranslator = new WordTranslator();

	public int getWordCount(String word) {
		Integer value = 0;
		if (wordMap.containsKey(word)) {
			value = wordMap.get(word);
		} else {
			value = 0;
		}
		return value;
	}

	public boolean addWord(String word) {
		boolean returnValue = false;

		if (isAlphabeticWord(word)) {

			word = wordTranslator.translate(word);

			Integer value = 0;
			if (wordMap.containsKey(word)) {
				value = wordMap.get(word);
				value++;
			} else {
				value = 1;
			}
			wordMap.put(word, value);
			returnValue = true;
		}
		return returnValue;
	}

	public boolean isAlphabeticWord(String word) {
		boolean returnValue = false;
		if (Pattern.matches("[a-zA-Z]+", word)) {
			returnValue = true;
		}
		return returnValue;
	}
	
	public static void main(String[] args) {
		WordCounter wc = new WordCounter();
		System.out.println(wc.addWord("coffee"));
		System.out.println(wc.addWord("book"));

		System.out.println(wc.addWord("flower"));
		System.out.println(wc.addWord("blume"));
		System.out.println(wc.getWordCount("flower"));
		
		System.out.println(wc.addWord("flor"));
		System.out.println(wc.getWordCount("flower"));

		System.out.println(wc.addWord("chair"));
		System.out.println(wc.addWord("pickle"));
		System.out.println(wc.getWordCount("pickle"));
		
		System.out.println(wc.addWord("home"));
		System.out.println(wc.addWord("dome"));
		System.out.println(wc.getWordCount("home"));
		
		System.out.println(wc.addWord("pickle1"));
		System.out.println(wc.getWordCount("pickle1"));
		
		
	}

}

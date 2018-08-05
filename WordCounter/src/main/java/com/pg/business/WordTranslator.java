package com.pg.business;


/**
 * Comments: For the simplicity of the task assume that translation of words will be done via external class 
 * provided to you called "Translator" 
 * that will have method "translate" accepting word as an argument and it will return English name for it.
 * @author PavasGarg
 */
public class WordTranslator {
	
	public String translate(String word) {
		
		// we can use google translate 
		// https://github.com/GoogleCloudPlatform/java-docs-samples/tree/master/translate/
		
		String inEnglish = word;
		
		if ("blume".equals(word) | "flor".equals(word))
			inEnglish = "flower";

		if ("dome".equals(word))
			inEnglish = "home";

		return inEnglish;
	}
}

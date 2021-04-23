package LambdaExpression;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.sun.javafx.collections.MappingChange.Map;

public class WordFrequencyCounter {
	static Map<String, Long> countFrequency(List<String> words) {
		Map<String, Long> frequencyMap = (Map<String, Long>) new HashMap<String, Long>();
		for (String word : words) {
					

		}
		return frequencyMap;
	}

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Hello", "World", "Dhaka", "Bangladesh", "Hello", "Java", "Lambda", "Java");
		Map<String, Long> wordFrequency= countFrequency(words);
		System.out.println(wordFrequency);
		
	}

}

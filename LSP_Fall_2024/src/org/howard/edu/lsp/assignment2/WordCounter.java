/**
*  Name: Abdulmujeeb Lawal
*/
package org.howard.edu.lsp.assignment2;

import java.util.Map;
import java.util.HashMap;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class WordCounter {
    // checks if word is less than
    public static boolean isTrivial(String word) {
        return word.length() <= 3;
    }

    // checks is its a numeric string
    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        // Map to hold counts
        Map<String, Integer> wordCounts = new HashMap<>();

        // File name (I put this in the base directory)
        String fileName = "words.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // change to lower case
                line = line.toLowerCase().replaceAll("[^a-z\\s]", "");

                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty() && !isTrivial(word) && !isNumeric(word)) {
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Display output
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.printf("%-10s %d%n", entry.getKey(), entry.getValue());
        }
    }
}

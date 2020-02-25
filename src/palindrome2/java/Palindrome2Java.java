/*
 * Kaia Mac
 * allow the user to enter a sentence, and then count the number of words in 
 * the sentence that are palindromes.
 * 25/02/2020
 */

package palindrome2.java;

import javax.swing.*;



/**
 *
 * @author kamac8665
 */
public class Palindrome2Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sentence, word, backwardsWord, palindromes = "";
        int spacePos, pos, palCounter = 0;

        //get the word from the user
        sentence = JOptionPane.showInputDialog(
                "Words that are the same forwards and backwards are called palindromes.\n"
                + "This program determines if the words are palindromes.\n\n"
                + "Enter a sentence(do not include a punctuation mark):");
        sentence += " ";

        //while the sentence has words in it
        while (sentence.length() > 0) {
            //find the first word and delete it from the sentence
            spacePos = sentence.indexOf(" ");
            word = sentence.substring(0, spacePos);
            sentence = sentence.substring(spacePos + 1, sentence.length());

            //Reverse the word
            backwardsWord = "";
            for (pos = word.length() - 1; pos >= 0; pos--) {
                backwardsWord += word.charAt(pos);
            }

            //Compare the words
            if (word.equalsIgnoreCase(backwardsWord)) {
                palCounter += 1;
                palindromes += word + ", ";
            }
        }

        JOptionPane.showMessageDialog(null, "There are " + palCounter + " palindromes in the sentence");

        if (palCounter > 0) {
            //take off the last 2 characters because there is an extra ", "
            JOptionPane.showMessageDialog(null, "The palindromes are:\n"
                    + palindromes.substring(0, palindromes.length() - 2));
        }
    }
}
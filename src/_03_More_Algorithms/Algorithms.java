package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {
		int inta = num1 * num2;
		String ans = String.valueOf(inta);
		return num1 + " x " + num2 + " = " + ans;
	}

	public static int findBrokenEgg(List<String> eggs) {
		int pos = -1;
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i) == "cracked") {
				pos = i;
				break;
			}
		}
		return pos;
	}

	public static boolean isPrime(int i) {
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isCube(int i) {
		int cube = 1;
		while ((cube * cube * cube) <= i) {
			if (i == cube * cube * cube) {
				return true;
			}
			cube++;
		}
		return false;
	}

	public static boolean isSquare(int i) {
		int square = 1;
		while ((square * square) <= i) {
			if (i == square * square) {
				return true;
			}
			square++;
		}
		return false;
	}

	public static Object countPearls(List<Boolean> oysters) {
		int count = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				count++;
			}
		}
		return count;
	}

	public static double findTallest(List<Double> peeps) {
		double tall = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tall) {
				tall = peeps.get(i);
			}
		}
		return tall;
	}

	public static Object findLongestWord(List<String> words) {
		String longest = "";
		for (int i = 0; i < words.size(); i++) {
			if(words.get(i).length()>longest.length()) {
				longest = words.get(i);
			}
		}
		return longest;
	}

	public static Object containsSOS(List<String> message) {
		for (int i = 0; i < message.size(); i++) {
			if(message.get(i).contentEquals("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		for (int i = 0; i < results.size(); i++) {
			for (int j = 0; j < results.size()-1; j++) {
				if(results.get(j)>results.get(j+1)) {
					double temp = results.get(j+1);
					results.set(j+1, results.get(j));
					results.set(j, temp);
				}
			}
		}
		return results;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		for (int i = 0; i < unsortedSequences.size(); i++) {
			for (int j = 0; j < unsortedSequences.size()-1; j++) {
				if(unsortedSequences.get(j).length()>unsortedSequences.get(j+1).length()) {
					String temp = unsortedSequences.get(j);
					unsortedSequences.set(j, unsortedSequences.get(j+1));
					unsortedSequences.set(j+1, temp);
				}
			}
		}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		for (int i = 0; i < words.size(); i++) {
			for (int j = 0; j < words.size()-1; j++) {
			if(words.get(j).compareTo(words.get(j+1))==1) {
				String temp = words.get(j);
				words.set(j,words.get(j+1));
				words.set(j+1, temp);
			}
			}
		}
		return words;
	}
}

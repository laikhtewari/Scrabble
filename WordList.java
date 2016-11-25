import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class WordList {
	private Scanner dictionary;
	private String fileName;
	private final String VOWELS = "AEIOUaeiou";

	public WordList(String fileName) {
		try {
			this.dictionary = new Scanner(new File(fileName));
			this.fileName = fileName;
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public String[] lengthN(int n) {
		ArrayList<String> retAL = new ArrayList<String>();
		while (dictionary.hasNextLine()) {
			String temp = dictionary.nextLine();
			if (temp.length() == n) {
				retAL.add(temp);
			}
		}
		
		String[] ret = new String[retAL.size()];
		for (int i = 0; i < retAL.size(); i++) {
			ret[i] = retAL.get(i);
		}

		try {
			dictionary = new Scanner(new File(fileName));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		return ret;
	}

	public String[] startsWith(int n, char firstLetter) {
		ArrayList<String> retAL = new ArrayList<String>();
		while (dictionary.hasNextLine()) {
			String temp = dictionary.nextLine();
			if (temp.length() == n && temp.charAt(0) == firstLetter) {
				retAL.add(temp);
			}
		}
		
		String[] ret = new String[retAL.size()];
		for (int i = 0; i < retAL.size(); i++) {
			ret[i] = retAL.get(i);
		}

		try {
			dictionary = new Scanner(new File(fileName));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		return ret;
	}

	public String[] containsLetter(int n, char included) {
		ArrayList<String> retAL = new ArrayList<String>();
		while (dictionary.hasNextLine()) {
			String temp = dictionary.nextLine();
			if (temp.length() == n) {
				boolean b = false;
				for (int a = 1; a < temp.length(); a++) {
					if (temp.charAt(a) == included && temp.charAt(0) != included) {
						b = true;
					}
				}
				if (b) {
					retAL.add(temp);
				}
			}
		}
		
		String[] ret = new String[retAL.size()];
		for (int i = 0; i < retAL.size(); i++) {
			ret[i] = retAL.get(i);
		}

		try {
			dictionary = new Scanner(new File(fileName));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		return ret;
	}

	public String[] vowelHeavy(int n, int m) {
		ArrayList<String> retAL = new ArrayList<String>();
		while (dictionary.hasNextLine()) {
			String temp = dictionary.nextLine();
			if (temp.length() == n && ) {
				retAL.add(temp);
			}
		}
		
		String[] ret = new String[retAL.size()];
		for (int i = 0; i < retAL.size(); i++) {
			ret[i] = retAL.get(i);
		}

		try {
			dictionary = new Scanner(new File(fileName));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		return ret;
	}

	// public String[] multiLetter(int m, char included) {

	// }
}
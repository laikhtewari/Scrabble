public class ScrabbleTester {
	public static void main(String[] args) {
		WordList wl = new WordList("dictionary.txt");
		System.out.print("Words that are 2 letters long: ");
		System.out.println(arrayPrinter(wl.lengthN(2)) + "\n");

		System.out.print("Words that are 2 letters long and start with 'a': ");
		System.out.println(arrayPrinter(wl.startsWith(2, 'a')) + "\n");

		System.out.print("Words that are 3 letters long and include 'a': ");
		System.out.println(arrayPrinter(wl.containsLetter(3, 'a')) + "\n");
	}

	public static String arrayPrinter(String[] arr) {
		String ret = "(";
		for (String str : arr) {
			ret += str + ", ";
		}
		try {
			ret = ret.substring(0, ret.length() - 2);
		} catch (StringIndexOutOfBoundsException e) {
			return "No such words";
		}
		ret += ")";
		return ret;
	}
}
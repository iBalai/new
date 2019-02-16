
public class PalidromeString {
	public static void main(String args[]) {
		String a = "Hello";
		StringBuilder reversed = new StringBuilder();
		for (int i = a.length() - 1; i >= 0; i--) {
			reversed.append(a.charAt(i));

		}
		System.out.println(reversed.toString());
		if (a.equals(reversed.toString())) {
			System.out.println("a este palidrom");
		}

		else {
			System.out.println("a nu este palidrom");

		}

	}
}

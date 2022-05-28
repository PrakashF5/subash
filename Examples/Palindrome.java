package Examples;

public class Palindrome {
	public static void main(String[] args) {
		String a = "Madam";
		String b = "";
		for(int i=a.length()-1; i>=0; i--) {
			b = b+a.charAt(i);
		}
		System.out.println(b);
		if(b.equalsIgnoreCase(a)) {
		System.out.println("It is a Palindrome");
	}
		else {
			System.out.println("It is not a Palindrome");
		}
}
}

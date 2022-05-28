package Examples;

public class Prime {
	public static void main(String[] args) {
		int num = 21;
		String a = "";
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				a = "Not Prime";
			}
		}
		if(a.equalsIgnoreCase("Not Prime")) {
			System.out.println(num+" is Not Prime");
		}
		else { 
			System.out.println(num+" is Prime");
		}
	}

}

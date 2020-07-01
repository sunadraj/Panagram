package string;

public class Panagram {

	static boolean panagram(String s) {
		String s1=s.toUpperCase();//The given input might be mix of both upper case and 
		//lower case so we are changing all characters in the input string to upper.
		for(char c='A';c<='Z';c++) {
			if(s1.indexOf(c)==-1) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		boolean a=panagram("The quick brown fox jumps over a lazy dog");
	
		System.out.println(a);
		System.out.println(panagram("sunad"));
		System.out.println(panagram("abcdefghijklmnopqrstuvwxyz"));
	}

}

package Zoho_set1;

public class Pattern {
	public static void main(String[] args) {
		String s = "PROGRAM";
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				if(j==i) {
					System.out.print(s.charAt(i));
				}else if(j==s.length()-i-1) {
					System.out.print(s.charAt(s.length()-i-1));
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

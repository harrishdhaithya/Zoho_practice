package Zoho_set1;

import java.util.ArrayList;

public class Family {
	public static void main(String[] args) {
		String[][] inp = new String[][] {
			{"luke","shaw"},
			{"wayne","rooney"},
			{"rooney","ronaldo"},
			{"shaw","rooney"}
		};
		ArrayList<String> al = new ArrayList<>();
		String name = "ronaldo";
		for(int i=0;i<4;i++) {
			if(inp[i][1]==name) {
				al.add(inp[i][0]);
			}
		}
		int count = 0;
		for(String s:al) {
			for(int i=0;i<4;i++) {
				if(inp[i][1]==s) {
					count+=1;
				}
			}
		}
		System.out.println(count);
	}
}

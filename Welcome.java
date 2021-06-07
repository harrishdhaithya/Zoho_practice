package Zoho_set1;

public class Welcome {

	public static void main(String[] args) {
		String s = "WELCOMETOZOHOCORPORATION";
		char[][] arr = new char[5][5];
		int c=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5&&c<s.length();j++) {
				arr[i][j]=s.charAt(c);
				c++;
			}
		}
		outerloop:
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(arr[i][j]=='T'&&arr[i][j+1]=='O'&&arr[i][j+2]=='O') {
					System.out.println("Start Index:"+"<"+i+","+j+">");
					System.out.println("Start Index:"+"<"+i+","+(j+2)+">");
					break outerloop;
				}
				else if(arr[i][j]=='T'&&arr[i+1][j]=='O'&&arr[i+2][j]=='O') {
					System.out.println("Start Index:"+"<"+i+","+j+">");
					System.out.println("Start Index:"+"<"+(i+2)+","+j+">");
					break outerloop;
				}
			}
		}
	}

}

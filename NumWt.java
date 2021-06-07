package Zoho_set1;

import java.util.Map;
import java.util.TreeMap;
public class NumWt {
	public static boolean isPerfect(int n) {
		double r = Math.sqrt(n);
		return (r*r==n);
	}
	public static void main(String[] args) {
		TreeMap<Integer, Integer> hm = new TreeMap<>();
		int[] inp = new int[] {
				10,36,54,89,12
		};
		for(int i=0;i<inp.length;i++) {
			int wt=0;
			if(isPerfect(inp[i])) {
				wt+=5;
			}
			if(inp[i]%4==0&&inp[i]%6==0) {
				wt+=4;
			}
			if(inp[i]%2==0) {
				wt+=3;
			}
			hm.put(inp[i],wt);
		}
		for(Map.Entry<Integer, Integer> entry:hm.entrySet()) {
			System.out.println("<"+entry.getKey()+","+entry.getValue()+">");
		}
//		System.out.println(hm.toString());
	}
}

package Zoho_set1;

import java.util.Arrays;

public class Sudoku {
	public static boolean checkRow(int[][] arr) {
		boolean[] row = new boolean[10];
		for(int i=0;i<9;i++) {
			Arrays.fill(row, false);
			for(int j=0;j<9;j++) {
				int z=arr[i][j];
				if(row[z]==true) {
					return false;
				}
				row[z]=true;
			}
		}
		return true;
		
	}
	public static boolean checkCol(int[][] arr) {
		boolean[] col = new boolean[10];
		for(int i=0;i<9;i++) {
			Arrays.fill(col, false);
			for(int j=0;j<9;j++) {
				int z=arr[j][i];
				if(col[z]==true) {
					return false;
				}
				col[z]=true;
			}
		}
		return true;
	}
	public static boolean checkGrid(int[][] arr) {
		boolean grid[] = new boolean[10];
		for(int i=0;i<7;i=i+3) {
			for(int j=0;j<7;j=j+3) {
				Arrays.fill(grid, false);
				for(int k=i;k<i+3;k++) {
					for(int l=j;l<j+3;l++) {
						int z=arr[k][l];
						if(grid[z]==true) {
							return false;
						}
						grid[z]=true;
					}
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[][] arr = {{7, 9, 2, 1, 5, 4, 3, 8, 6}, 
		             {6, 4, 3, 8, 2, 7, 1, 5, 9},
		             {8, 5, 1, 3, 9, 6, 7, 2, 4},
		             {2, 6, 5, 9, 7, 3, 8, 4, 1},
		             {4, 8, 9, 5, 6, 1, 2, 7, 3},
		             {3, 1, 7, 4, 8, 2, 9, 6, 5},
		             {1, 3, 6, 7, 4, 8, 5, 9, 2},
		             {9, 7, 4, 2, 1, 5, 6, 3, 8},
		             {5, 2, 8, 6, 3, 9, 4, 1, 7}};
		boolean c1 = checkRow(arr);
		boolean c2 = checkCol(arr);
		boolean c3 = checkGrid(arr);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}

package src.oop_concepts;

public class Lab126 {
	public static void main(String[] args) {
		
		int[][] array_2d = new int[3][3];
		array_2d[0][0] = 1;
		array_2d[0][1] = 2;
		array_2d[0][2] = 3;
		array_2d[1][0] = 4;
		array_2d[1][1] = 5;
		array_2d[1][2] = 6;
		array_2d[2][0] = 7;
		array_2d[2][1] = 8;
		array_2d[2][2] = 9;
		
//		for(int i=0; i<array_2d.length; i++) {
//			for(int j=0; j<array_2d[i].length; j++) {
//				System.out.println("\t"+array_2d[i][j]);
//				if (i == j) {
//					System.out.println(array_2d[i][j]);
//				}
//			}
//			sysout();
//		}
		
		for(int i=0; i<array_2d.length; i++) {
			System.out.println(array_2d[i][i]);
		}
	}

}

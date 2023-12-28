package classworkjava;

public class UsingMultiDimensionArray {

	public static void main(String[] args) {
		
//		int [][] A;
//		A = new int [4][5];
		
		int[][] A = new int[4][5];
		
		A[0][0] = 10;
		A[0][1] = 20;
		A[0][2] = 30;
		A[0][3] = 40;
		A[0][4] = 50;
		
		A[1][0] = 11;
		A[1][1] = 21;
		A[1][2] = 31;
		A[1][3] = 41;
		A[1][4] = 51;
		
		A[2][0] = 12;
		A[2][1] = 22;
		A[2][2] = 32;
		A[2][3] = 42;
		A[2][4] = 52;
		
		A[3][0] = 13;
		A[3][1] = 23;
		A[3][2] = 33;
		A[3][3] = 43;
		A[3][4] = 53;
		
		int i = 0;
		int j = 0;
		
		for(i=0;i<A.length;i++){
			for(j=0;j<A.length;j++){
				System.out.print(A[i][j] + " ");
				
			}
			System.out.println();
		}
			System.out.println("***********************");
			
		String [][] names= {
							{"Maruthi", " Vivek", " Manchiraju"},
							{"Bhavani", "Kalyani", "Manchiraju"},
							{"Jasritha","Anjana", "Manchiraju"}
		};
		for(i=0;i<names.length;i++){
			for(j=0;j<names.length;j++){
				System.out.print(names[i][j] + " ");
				
			}
			System.out.println();
			
		}
			
	}

}

import java.util.Scanner;

public class VetoresExercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		
		for(int i=0; i<A.length; i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i=0; i<B.length; i++) {
			B[i] = sc.nextInt();
		}
		
		int[] C = new int[N];
		
		for(int i=0; i<C.length; i++) {
			C[i] = A[i] + B[i];
			System.out.printf("%d ", C[i]);
		}
		
		sc.close();

	}

}

import java.util.Locale;
import java.util.Scanner;

public class VetoresExercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] vet = new int[N];
		int pares=0;
		
		for(int i=0; i<vet.length; i++) {
			vet[i] = sc.nextInt();
		}
		
		for(int i=0; i<vet.length; i++) {
			if(vet[i] % 2 == 0) {
				System.out.printf("%d ", vet[i]);
				pares++;
			}
		}
		
		System.out.printf("\n%d\n", pares);
		
		sc.close();

	}

}

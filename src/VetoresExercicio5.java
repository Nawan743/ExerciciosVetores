import java.util.Locale;
import java.util.Scanner;

public class VetoresExercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] vet = new int[N];
		double media = 0;
		int	pares = 0;
		
		for(int i=0; i<vet.length; i++) {
			vet[i] = sc.nextInt();
			if(vet[i] % 2 ==0) {
				media = media + vet[i];
				pares++;
			}
		}
		
		media = media / pares;
		
		System.out.printf("%.1f\n", media);
		
		sc.close();

	}

}

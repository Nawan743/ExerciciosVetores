import java.util.Locale;
import java.util.Scanner;

public class VetoresExercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] vet = new double[N];
		double media=0;
		
		for(int i=0; i<vet.length; i++) {
			vet[i] = sc.nextDouble();
			media = media + vet[i];
		}
		
		media = media / vet.length;
		System.out.printf("%.3f\n", media);
		
		for(int i=0; i<vet.length; i++) {
			if(vet[i] < media) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();
		
	}

}

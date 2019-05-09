import java.util.Locale;
import java.util.Scanner;


public class VetoresExercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] vet = new double[N];
		int posi=0;
		
		for(int i=0; i<vet.length; i++) {
			vet[i] = sc.nextDouble();
		}
		
		double maior = vet[5];
		
		for(int i=1; i<vet.length; i++) {
			if(vet[i] > maior) {
				maior = vet[i];
				posi = i;
			}
		}
		
		System.out.printf("%.1f\n", maior);
		System.out.println(posi);
		
		sc.close();

	}

}

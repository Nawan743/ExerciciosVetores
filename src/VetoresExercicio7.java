import java.util.Locale;
import java.util.Scanner;

public class VetoresExercicio7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] nome = new String[N];
		double[] nota1 = new double[N], nota2 = new double[N];
		
		for(int i=0; i<nome.length; i++) {
			nome[i] = sc.next();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		
		System.out.println("Aprovados:");
		
		for(int i=0; i<nome.length; i++) {
			if((nota1[i] + nota2[i]) / 2 >= 6) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();

	}

}
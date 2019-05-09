import java.util.Locale;
import java.util.Scanner;

public class VetoresExercicio8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), homem=0, mulher=0;
		double[] altura = new double[N];
		double maioralt=0, menoralt=0, medialtm=0;
		char[] sexo = new char[N];
		
		for(int i=0; i<altura.length; i++) {
			altura[i] = sc.nextDouble();
			sexo[i] = sc.next().charAt(0);
			if(sexo[i] == 'M') {
				homem++;
			}
			if(sexo[i] == 'F') {
				medialtm = medialtm + altura[i];
				mulher++;
			}
		}
		
		medialtm = medialtm / mulher;
		maioralt = altura[0];
		menoralt = altura[0];
		
		for(int i=1; i<altura.length; i++) {
			if(altura[i] > maioralt ) {
				maioralt = altura[i];
			}
			if(altura[i] < menoralt) {
				menoralt = altura[i];
			}
		}
		
		System.out.printf("Menor altura = %.2f\n", menoralt);
		System.out.printf("Maior altura = %.2f\n", maioralt);
		System.out.printf("Media das alturas das mulheres = %.2f\n", medialtm);
		System.out.println("Numero de homens = " + homem);
		sc.close();

	}

}

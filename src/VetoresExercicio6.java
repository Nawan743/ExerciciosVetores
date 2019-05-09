import java.util.Scanner;

public class VetoresExercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] nome = new String[N];
		String pessoa = " ";
		int idade, idademaior = 0;
		
		for(int i=0; i<nome.length; i++) {
			nome[i] = sc.next();
			idade = sc.nextInt();
			if(idade > idademaior) {
				idademaior = idade;
				pessoa = nome[i];
			}
		}
		
		System.out.println("Pessoa mais velha: " + pessoa);
		
		sc.close();

	}

}

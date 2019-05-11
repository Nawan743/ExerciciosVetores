import java.util.Locale;
import java.util.Scanner;

public class Num9Exercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), lucro10=0, lucro1020=0, lucro20=0;
		String[] produto = new String[N];
		double[] preccompra = new double[N], precvenda = new double[N];
		double totalcompra=0, totalvenda=0, lucrototal=0;
		
		for(int i=0; i<produto.length; i++) {
			produto[i] = sc.next();
			preccompra[i] = sc.nextDouble();
			precvenda[i] = sc.nextDouble();
			if(precvenda[i] / preccompra[i] < 1.1) {
				lucro10++;
			}
			else if(precvenda[i] / preccompra[i] >= 1.1 && precvenda[i] / preccompra[i] <= 1.2) {
				lucro1020++;
			}
			else {
				lucro20++;
			}
			totalcompra += preccompra[i];
			totalvenda += precvenda[i];
			lucrototal = totalvenda - totalcompra;
		}
		
		System.out.println("Lucro abaixo de 10%: " + lucro10);
		System.out.println("Lucro entre 10% e 20%: " + lucro1020);
		System.out.println("Lucro acima de 20%: " + lucro20);
		System.out.printf("Valor total de compra: %.2f\n", totalcompra);
		System.out.printf("Valor total de venda: %.2f\n", totalvenda);
		System.out.printf("Lucro total: %.2f", lucrototal);
		
		sc.close();

	}

}

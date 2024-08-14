package SwitchCase;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner ler = new Scanner(System.in)) {
			ArrayList<Integer> num = new ArrayList<Integer>();

			int valor=0;

			for (int i= 1; i<=5; i++) {
				System.out.println("Informe um valor inteiro: ");
				valor = ler.nextInt();
				num.add(valor);

				if(valor>=0) {
				}else {

				}

					}
			System.out.print("Desses valores os numeros positivos são: ");
			for (int y:num) {
				if(y>0) {
					System.out.println(y+", ");
				}
			}
		}
	}

}

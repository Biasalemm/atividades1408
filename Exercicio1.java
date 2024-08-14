package SwitchCase;
import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		int soma=0;
	    
	    
		for (int i= 0; i<=5; i++) {
		System.out.println("Informe um valor: ");
	    int val = ler.nextInt();
	    num.add(val);
		}
        
		for (int numero:num) {
        	soma+=numero;
        }
		System.out.println("A soma dos algoritmos é: " + soma);
        
        ler.close();
	}

}

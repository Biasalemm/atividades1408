package SwitchCase;
import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		int valor=0,somapar=0;
		
		for (int i= 1; i<=5; i++) {
		System.out.println("Informe um valor inteiro: ");
		valor = ler.nextInt();
	    num.add(valor);
	    
		if(valor % 2 == 0) {
		somapar++;
		}else {
			
		}
	
		   }
		System.out.println("A quantidade de numeros pares é: " +somapar++);
		ler.close();
		}
		
	}



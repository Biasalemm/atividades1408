package SwitchCase;
import java.util.Scanner;
public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		int carro=0;
		
		System.out.println("Quantos automoveis voce vendeu na primeira semana? : ");
		carro += ler.nextInt();
		System.out.println("Quantos automoveis voce vendeu na segunda semana? : ");
        carro += ler.nextInt();
        System.out.println("Quantos automoveis voce vendeu na terceira semana? : ");
        carro += ler.nextInt();
        System.out.println("Quantos automoveis voce vendeu na quarta semana? : ");
        carro += ler.nextInt();
        
        switch(carro) {
        case 1:System.out.println("Sem bônus");
        break;
        case 2:System.out.println("Sem bônus");
        break;
        case 3:System.out.println("Sem bônus");
        break;
        case 4:System.out.println("Sem bônus");
        break;
        case 5:System.out.println("Sem bônus");
        break;
        case 6:System.out.println("Sem bônus");
        break;
        case 7:System.out.println("Sem bônus");
        break;
        case 8:System.out.println("Sem bônus");
        break;
        case 9:System.out.println("Sem bônus");
        break;
        case 10:System.out.println("Bônus de r$:100,00");
        break;
        case 11:System.out.println("Bônus de r$:100,00");
        break;
        case 12:System.out.println("Bônus de r$:100,00");
        break;
        case 13:System.out.println("Bônus de r$:100,00");
        break;
        case 14:System.out.println("Bônus de r$:100,00");
        break;
        case 15:System.out.println("Bônus de r$:100,00");
        break;
        case 16:System.out.println("Bônus de r$:300,00");
        break;
        case 17:System.out.println("Bônus de r$:300,00");
        break;
        case 18:System.out.println("Bônus de r$:300,00");
        break;
        case 19:System.out.println("Bônus de r$:300,00");
        break;
        case 20:System.out.println("Bônus de r$:300,00");
        break;
        default:System.out.println("Bônus de r$:500,00 ");
		
		
	}
        ler.close();
}
}

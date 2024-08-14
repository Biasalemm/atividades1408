package SwitchCase;
import java.util.Arrays;
import java.util.ArrayList;
public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> cifra = new ArrayList <String>();
		int letra = 0;
		String[] alfabeto = {"A", "B", "C", "D", "E", "F", 
				"G", "H", "I", "נ", "K", "L", "M", "N", "0", 
				"P", "Q", "R", "5", "T", "0", "", "W", "X", "Y",
				"z"};
		
		ArrayList <String> Alpha = new ArrayList<String>(Arrays.asList(alfabeto));
		cifra.add("A");
		cifra.add("B");
		cifra.add("C");
		cifra.add("D");
		cifra.add("E");
		
			for(int j=0; j<cifra.size();j++){
				for(int i=0; i<Alpha.size();i++) {
					if (cifra.get(j).equals(Alpha.get(i))) { if(Alpha.get(i).equals("Z")) {
						i=0;
						letra= 1+2;
						System.out.println(Alpha.get(letra));
						letra= 1+3;
						System.out.println(Alpha.get(letra));

					}


					}
	}

}
}}


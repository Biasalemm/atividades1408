package SwitchCase;
import java.util.ArrayList;
import java.util.Arrays;
public class Atividade3 {

	public static void main(String[] args) {
        String[] disciplinas = {"Matematica", "Filosofia","História", "Fisica"};
        ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
        novaLista.add("Geográfia");
        novaLista.add("Lingua Inglesa");
        
        
        for (String i: novaLista)
        {
        	System.out.println("Disciplina: " +i);
        }
	}

}

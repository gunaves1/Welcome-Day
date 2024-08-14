package estruturaCondicional;

import java.util.ArrayList;
import java.util.Arrays;

public class Exemplo {

	public static void main(String[] args) {
		String[] disciplinas = {"matemática", "filosofia", "história", "fisíca"};
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
		novaLista.add("geografia");
		novaLista.add("língua inglesa");
		
		for (String i: novaLista)
		{
			System.out.println("Disciplinas " + i);
		}
	}
}
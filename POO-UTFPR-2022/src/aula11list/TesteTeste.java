package aula11list;

import java.util.List;
import java.util.ArrayList;


public class TesteTeste {

	public static void main(String[] args) {
		
		Teste p1 = new Teste("joao da silva", 20, 78.5);
		Teste p2 = new Teste("maria da silva", 23, 69.5);
		
		List <Teste> lista = new ArrayList<Teste>();
		
		lista.add(p1);
		lista.add(p2);
		
		
		for(Teste pessoa : lista) {
			System.out.println("nome : " + pessoa.getNome());
			System.out.println("idade : " + pessoa.getIdade());
			System.out.println("peso : " + pessoa.getPeso());
			
		}
	}

}

package lista04exercicio02;

public class DisciplinaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor prof1 = new Professor("saji", "23/12/2390", 2342.4, 238942);
		Disciplina disciplina1 = new Disciplina("jair", "ciencias", 23242, 23, prof1);
		
		
		prof1.emitirDados();
		disciplina1.emitirDados();
	}

}

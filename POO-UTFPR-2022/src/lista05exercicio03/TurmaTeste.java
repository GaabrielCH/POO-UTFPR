package lista05exercicio03;

public class TurmaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Turma turma1 = new Turma("poo");
		
		turma1.adicionarAluno("joao da silva", 2387955, 5, 8, 8, 5);
		turma1.adicionarAluno("maria da silva", 2398244, 3, 6, 6, 3);
		
		turma1.calcularMediaAluno();
		turma1.calcularMediaTurma();
	}	

}

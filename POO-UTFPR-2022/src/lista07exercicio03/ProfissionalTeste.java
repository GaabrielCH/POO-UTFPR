package lista07exercicio03;

public class ProfissionalTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Processo processo = new Processo("ciencias", "20/12/2021", "estudar");
		Tecnico tecnico = new Tecnico(12345, 2000, "joao da silva", "23/03/2012", processo, 500);
		
		tecnico.calcularSalario();
		
		Disciplina disciplina = new Disciplina(54321, 60, "libras", "4 periodo");
		Professor professor = new Professor(135790, 8000, "maria de solva", "20/03/2005", Titulacao.DOUTOR, disciplina);
		
		professor.calcularSalario();
	}

}

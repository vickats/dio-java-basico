package candidatura;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Processo Seletivo");
		/*
		 * analisarCandidato(1900.0); 
		 * analisarCandidato(2200.0);
		 * analisarCandidato(2000.0);
		 */
		//selecaoCandidatos();
		//imprimirSelecionados();
		
		String [] candidatos = {"FELIPE","M�RCIA","JULIA","PAULO","AUGUSTO"};
		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
		}
	}
	static void entrandoEmContato(String candidato) {
		
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
		do {
			atendeu= atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			
		}while(continuarTentando && tentativasRealizadas<3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("N�O CONSEGUIMOS CONTATO COM " + candidato +", N�MERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
		
		
	}
	//m�todo auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}
	static void imprimirSelecionados() {
		String [] candidatos = {"FELIPE","M�RCIA","JULIA","PAULO","AUGUSTO"};
		
		System.out.println("Lista de candidatos selecionados com indice de elementos:");
		
		for(int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de n�mero " + (indice+1) + " � " + candidatos[indice]);
		}
		System.out.println("Forma abreviada de itera��o for each");
		for(String candidato: candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}
	}
	static void selecaoCandidatos() {
		// Array com a lista de candidatos
		String [] candidatos = {"FELIPE","M�RCIA","JULIA","PAULO","AUGUSTO","M�NICA","FABR�CIO","MIRELA","DANIELA","JORGE"};
		
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " solicitou este valor de sal�rio: " + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
	}
	static double valorPretendido() {
	     return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}else if(salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
		}else {
			System.out.println("AGUARDAR DEMAIS CANDIDATOS");
		}
	}
}

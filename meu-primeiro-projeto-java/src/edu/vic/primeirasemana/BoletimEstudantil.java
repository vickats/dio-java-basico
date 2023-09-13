package edu.vic.primeirasemana;
public class BoletimEstudantil {
    public static void main(String[] args) {
        //sem tabulacão
        // int mediaFinal = 6;
        // if(mediaFinal<6)	
        // System.out.println("REPROVADO"); 
        // else if(mediaFinal==6)
        // System.out.println("PROVA MINERVA"); 
        // else
        // System.out.println("APROVADO"); 
        
        //com tabulacão
        int mediaFinal = 6;
		if (mediaFinal < 6)
			System.out.println("REPROVADO");
		else if (mediaFinal == 6)
			System.out.println("PROVA MINERVA");
		else
			System.out.println("APROVADO");
	
    }
}

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

        try {
            Integer [] qntdIteracoes = {parametroUm - parametroDois};
            //chamando método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        }catch(ParametrosInvalidosExeception e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosExeception{

        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois)
            throw new ParametrosInvalidosExeception();

        int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variavel contagem
       
        for(int numero = 0; numero < qntdIteracoes.length; numero++ ){
            System.out.println(numero);
        }
        
    }
}

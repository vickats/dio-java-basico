package edu.vic.segundasemana;

public class MinhaClasse {
    public static void main (String [] args){
        // System => class / print => método executável
        // System.out.print("Executando método main com class System e método print()");

        // variáveis
        String meuNome = "Vic";
        int anoFabricacao = 2022;
        boolean verdadeira = true;

        anoFabricacao = 2023;

        // variavel + método
        String primeiroNome = "Vic";
        String segundoNome = "Tsuha";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    // String => metodo que retorna string
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método nomeCompleto" + " " + primeiroNome.concat(" ").concat(segundoNome);
    }
}

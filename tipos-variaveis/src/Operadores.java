public class Operadores {
    public static void main(String[] args) {
        // concatenação
        String nomeComplete = "LINGUAGEM" + " " + "JAVA";
        System.out.println(nomeComplete); // LINGUAGEM JAVA

        String concatenacao ="?"; 

        System.out.println(concatenacao); // ?

        concatenacao = 1+1+1+"1";

        System.out.println("1+1+1+\"1\"" + " " +concatenacao); // 31

        concatenacao = 1+"1"+1+1;

        System.out.println("1+\"1\"+1+1"+ " " +concatenacao); // 1111

        concatenacao = 1+"1"+1+"1";

        System.out.println("1+\"1\"+1+\"1\""+ " " +concatenacao); // 1111

        concatenacao = "1"+1+1+1;

        System.out.println("\"1\"+1+1+1"+ " " +concatenacao); // 1111

        concatenacao = "1"+(1+1+1);

        System.out.println("\"1\"+(1+1+1)"+ " " +concatenacao); // 13

        // unários
        int numero = 5;

        // 'falso' negativo - não altera o valor verdadeiramente
        System.out.println(-numero); // -5
        System.out.println(numero); // 5
        
        // negativo
        numero = -numero;
        System.out.println("negativar" + " " +numero); //-5

        // positivar o numeor negativo
        numero = numero * -1;
        System.out.println("positivar" + " " +numero); // 5

        // incremento
        int incNum = 10;
        incNum++; // num = num + 1
        System.out.println("incremento" + " " +incNum); //11

        // decremento
        int decNum = 5;
        decNum--;
        System.out.println("decremento" + " " +decNum); // 4

        // inversão
        boolean variavel = true;
        variavel = !variavel;
        System.out.println("inversao" + " " +variavel); //false

        // ternário
        int a, b;

        a = 5;
        b = 6;

        // condicional tradicional

        // String resultado = "";

        // if(a == b)
        // resultado = "verdadeiro";
        // else
        // resultado = "falso";

        // condicional ternária
        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println("ternário" + " " + resultado);

        // relacionais

        int num1 = 1;
        int num2 = 2;

        boolean simNao = num1 == num2;

        if(num1 < num2)
        System.out.println("A nossa condição é verdadeira");

        System.out.println("1 é igual a 2 ? " + simNao);

        simNao = num1 != num2;

        System.out.println("1 é diferente de 2 ? " + simNao);

        simNao = num1 > num2;

        System.out.println("1 é maior que 2 ? " + simNao);

        String nomeUm = "Bob";
        String nomeDois = "Bob";
        System.out.println(nomeUm == nomeDois); // true

        String nomeTres = new String ("Bob");
        System.out.println(nomeTres == nomeDois); // false

        //comparar objetos ou texto, utiliza `equal`, comparando o conteudo - para números, pode continuar a utilizar relacionais
        System.out.println(nomeTres.equals(nomeDois)); // true

        String nomeQuatro = nomeTres;

        System.out.println(nomeUm.equals(nomeDois)); // true
        System.out.println(nomeDois.equals(nomeTres)); // true
        System.out.println(nomeTres.equals(nomeQuatro)); // true

        // lógicos
        boolean condicao1=true;
        boolean condicao2=false;

        // se a condiçao 1 E 2 forem verdadeiras...
        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 && (7 > 4)){
            System.out.println("A condição e o valor são verdadeiros");
        }

        // se a condiçao 1 OU 2 forem verdadeiras...
        if(condicao1 || condicao2){
            System.out.println("Uma das duas condições é verdadeira");
        }

        if(nomeQuatro.equals(nomeTres)){
            System.out.println("POde usar equals com if/else");
        }



        System.out.println("Fim");
    }
}

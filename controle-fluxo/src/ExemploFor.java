public class ExemploFor {
    public static void main(String[] args) {

        // carneirinhos
        // estrutura 1
        /* for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos ++){
            System.out.println(carneirinhos + " carneirinho(s)"); 
        } */

        //estrutura 2
        //o que importa é somente o bloco condicional
        int carneirinhos = 1;
        for( ; carneirinhos <=20; ) {
            System.out.println(carneirinhos + " Carneirinho(s)");
            carneirinhos ++;
        }
        //for( somente 1x ; deve ser uma expresão boolean; acontecerá a cada final da execução ) { }
        System.out.println("zZzZ");


    }
}

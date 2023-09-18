/* Vamos criar um exemplo de uma classe para representar uma SmartTV onde:
Ela tenha as características: ligada (boolean), canal (int) e volume (int);
Nossa TV poderá ligar e desligar e assim mudar o estado ligada;
Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente. */
public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTv = new SmartTV();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("TV ligada ? " + smartTv.ligada); // false
        System.out.println("Canal atual ? " + smartTv.canal); // 1
        System.out.println("Volume atual ? " + smartTv.volume); //10

        smartTv.ligar ();
        System.out.println("Novo status: TV ligada ? " + smartTv.ligada); // true

        smartTv.desligar ();
        System.out.println("Novo status: TV ligada ? " + smartTv.ligada); // false

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Novo status: Volume atual ? " + smartTv.volume);

        System.out.println("Canal atual ? " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Novo status: Canal atual ? " + smartTv.canal);
    }
}

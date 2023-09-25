public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "B"; //M / T

        // Modo condicional convencional
        /* if(plano == "B") {
          System.out.println("100 minutos de ligação");
        }else if(plano == "M") {
          System.out.println("100 minutos de ligação");
          System.out.println("WhatsApp e Instagram grátis");
        }else if(plano == "T") {
          System.out.println("100 minutos de ligação");
          System.out.println("WhatsApp e Instagram grátis");
          System.out.println("5Gb Youtube");
        } */

        // Modo condicional switch/case - por não ter o 'break', ele imprime a string correspondente + as demais strings logo abaixo, evitando repetir strings
        switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}

      }
}

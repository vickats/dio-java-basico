import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		//abrindo MSN Messenger
//		MSNMessenger msn = new MSNMessenger();
//		msn.enviarMensagem();
//		msn.receberMensagem();
//		
//		FacebookMessenger fb = new FacebookMessenger();
//		fb.enviarMensagem();
//		fb.receberMensagem();
//		
//		Telegram tel = new Telegram();
//		tel.enviarMensagem();
//		tel.receberMensagem();
		
		ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="fbm"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		

		smi.enviarMensagem();
		smi.receberMensagem();
	}
}

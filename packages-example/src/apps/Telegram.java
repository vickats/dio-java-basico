package apps;

public class Telegram extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}

	@Override
	public void salvarHistoricoMensagem() {
		// TODO Auto-generated method stub
		
	}

//	public void enviarMensagem() {
//		//primeiro confirmar se esta conectado a internet
//		validarConectadoInternet();
//		
//		System.out.println("Enviando mensagem pelo Telegram");
//		
//		//depois de enviada, salva o hist�rico da mensagem
//		salvarHistoricoMensagem();
//		
//		
//	}
//	public void receberMensagem() {
//		System.out.println("Recebendo mensagem pelo Telegram");
//	}
//	
//	//m�todos privadas, vis�veis somente na classe
//	private void validarConectadoInternet() {
//		System.out.println("Validando se est� conectado a internet");
//	}
//	private void salvarHistoricoMensagem() {
//		System.out.println("Salvando o hist�rico da mensagem");
//	}
}

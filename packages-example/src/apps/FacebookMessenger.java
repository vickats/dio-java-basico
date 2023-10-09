package apps;

public class FacebookMessenger extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
	
	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}

	@Override
	public void salvarHistoricoMensagem() {
		// TODO Auto-generated method stub
		
	}
	
//	public void enviarMensagem() {
//		//primeiro confirmar se esta conectado a internet
//		validarConectadoInternet();
//		
//		System.out.println("Enviando mensagem pelo Facebook Messenger");
//		
//		//depois de enviada, salva o histórico da mensagem
//		salvarHistoricoMensagem();
//		
//		
//	}
//	public void receberMensagem() {
//		System.out.println("Recebendo mensagem pelo Facebook Messenger");
//	}
//	
//	//métodos privadas, visíveis somente na classe
//	private void validarConectadoInternet() {
//		System.out.println("Validando se está conectado a internet");
//	}
//	private void salvarHistoricoMensagem() {
//		System.out.println("Salvando o histórico da mensagem");
//	}
}

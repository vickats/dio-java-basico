package apps;

public class MSNMessenger extends ServicoMensagemInstantanea{

	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN Messenger");		
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");		
	}
//	ANTES
//	public void enviarMensagem() {
//		System.out.println("Enviando mensagem");
//	}
//	public void receberMensagem() {
//		System.out.println("Recebendo mensagem");
//	}
//	public void validarConectadoInternet() {
//		System.out.println("Validando se está conectado a internet");
//	}
//	public void salvarHistoricoMensagem() {
//		System.out.println("Salvando o histórico da mensagem");
//	}
	@Override
	public void salvarHistoricoMensagem() {
		// TODO Auto-generated method stub
		
	}

	
// DEPOIS
//	public void enviarMensagem() {
//		//primeiro confirmar se esta conectado a internet
//		validarConectadoInternet();
//		
//		System.out.println("Enviando mensagem pelo MSN Messenger");
//		
//		//depois de enviada, salva o histórico da mensagem
//		salvarHistoricoMensagem();
//		
//		
//	}
//	public void receberMensagem() {
//		System.out.println("Recebendo mensagem pelo MSN Messenger");
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
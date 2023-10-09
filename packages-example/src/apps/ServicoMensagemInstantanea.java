package apps;
//a classe MSNMessenger � ou representa
public abstract class ServicoMensagemInstantanea {
//	public void enviarMensagem() {
//		//primeiro confirmar se esta conectado a internet
//		validarConectadoInternet();
//		System.out.println("Enviando mensagem");
//		//depois de enviada, salva o hist�rico da mensagem
//		salvarHistoricoMensagem();
//	}
//	public void receberMensagem() {
//		System.out.println("Recebendo mensagem");
//	}
//	
//	//m�todos privadas, vis�veis somente na classe
//	private void validarConectadoInternet() {
//		System.out.println("Validando se est� conectado a internet");
//	}
//	private void salvarHistoricoMensagem() {
//		System.out.println("Salvando o hist�rico da mensagem");
//	}
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	//mais um m�todo que todos os filhos dever�o implementar
	public abstract void salvarHistoricoMensagem();
	
	//somente os filhos conhecem este m�todo
	protected void validarConectadoInternet() {
		System.out.println("Validando se est� conectado a internet");
	}
	
}
package aplicativoMensagens;

public class ServicoMensagemInstantanea {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem");
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Mensagem recebida!");
	}
	private void validarConectadoInternet() {
		System.out.println("***Validando se está conectado a internet***");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando histórico de mensagens da conversa...");
	}
}

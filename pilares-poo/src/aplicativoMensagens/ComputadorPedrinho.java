package aplicativoMensagens;

import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		ServicoMensagemInstantanea smi = null;
		
		String appEscolhido ="tlg";
		
		if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		else if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else
			smi = new FacebookMessenger();
		
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}

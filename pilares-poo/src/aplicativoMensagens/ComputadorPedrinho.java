package aplicativoMensagens;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		MSNMessenger msn = new MSNMessenger();
		System.out.println("MSN");
		msn.enviarMensagem();
		msn.receberMensagem();

		FacebookMessenger fcb = new FacebookMessenger();
		System.out.println("Facebook");
		fcb.enviarMensagem();
		fcb.receberMensagem();
		
		Telegram tlg = new Telegram();
		System.out.println("Telegram");
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}
}

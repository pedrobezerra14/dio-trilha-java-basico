package aparelho;

import aparelho.funcionalidades.AparelhoTelefonico;
import aparelho.funcionalidades.NavegadorInternet;
import aparelho.funcionalidades.ReprodutorMusical;

public class iPhone {
	public static void main(String[] args) {
		
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        NavegadorInternet navegadorInternet = new NavegadorInternet();
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        
        aparelhoTelefonico.ligar("123456789");
        aparelhoTelefonico.atender("123456789");
        aparelhoTelefonico.iniciarCorreioVoz("123456789");
        
        navegadorInternet.exibirPagina("www.exemplo.com");
        navegadorInternet.adicionarNovaAba("www.outra.com");
        navegadorInternet.atualizarPagina("www.exemplo.com");
        
        reprodutorMusical.tocar("Minha Música Favorita");
        reprodutorMusical.pausar("Minha Música Favorita");
        reprodutorMusical.selecionarMusica("Outra Música");
		
	}
}

package estados;

public class SistemaIbge {
	public static void main(String[] args) {
		for(EstadoBrasileiro uf: EstadoBrasileiro.values() ) {
		   System.out.println(uf.getSigla() + "-" + uf.getNomeMaiusculo());
		}
		
		EstadoBrasileiro ufSelecionado = EstadoBrasileiro.PARAIBA;
		
		System.out.println("O estado selecionado foi: " + ufSelecionado.getNome());
		System.out.println("sigla: "+ufSelecionado.getSigla());
		System.out.println("nome maiusculo: "+ufSelecionado.getNomeMaiusculo());
		System.out.println("numero ibge: "+ufSelecionado.getIbge());
	}
}

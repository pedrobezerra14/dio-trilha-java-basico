package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
	public void adicionarLancheNoBalcao( ) {
		System.out.println("Adicionando lanche natural no balcão");
	}
	public void adicionarSucoNoBalcao( ) {
		System.out.println("Adicionando suco da fruta no balcão");
	}
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	private void prepararLanche() {
		System.out.println("Preparando lanche...");
	}
	private void prepararSuco() {
		System.out.println("Preparando suco...");
	}
	private void prepararCombo() {
		prepararLanche();
		prepararSuco();
	}
	private void selecionarIngredientesLanche( ) {
		System.out.println("Selecionando o pão, salada, ovo e carne");
	}
	private void selecionarIngredientesSuco( ) {
		System.out.println("Selecionando a fruta direto do pé e o leite direto da vaca");
	}
	private void lavarIngredientes() {
		System.out.println("Lavando ingredientes...");
	}
	private void baterSucoLiquidificador() {
		System.out.println("Batendo ingredientes no liquidificador...");
	}
	private void fritarIngredientesLanche() {
		System.out.println("Fritando a carne e o ovo...");
	}
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}

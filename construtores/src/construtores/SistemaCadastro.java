package construtores;

public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa("Marcos", "190.876.185-24", "Rua das marias");
		
		System.out.println("Nome: " + marcos.getNome() + " -  CPF: " + marcos.getCpf() + " - Endereço: " + marcos.getEndereco());
	}
}

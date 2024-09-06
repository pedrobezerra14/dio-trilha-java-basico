public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        String meuNome = "Pedro";

        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.println(numero);

        final int IDADE = 18;

        System.out.println("Meu nome é " + meuNome + " e eu tenho " + IDADE + " anos de idade.");

    }
}

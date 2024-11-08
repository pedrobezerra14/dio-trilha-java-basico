public class ResultadoEscolar {
    public static void main(String[] args) {
        // Utilizando operadores ternários
        int nota = 10;

        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
        
        /* UTILIZANDO IF E ELSE
        int nota = 10;

        if(nota >= 7)
            System.out.println("Aluno foi aprovado!");

        else if(nota >= 5 && nota < 7) //true or false
            System.out.println("Prova de recuperação");
        else
            System.out.println("Reprovado");
        */
    }
}

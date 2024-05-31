public class ResultadoEscolar {

    public static void main(String[] args) {
        
        /* Exemplo de condições encadeadas
        int nota = 7;

        if(nota > 6)
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)
		System.out.println("Recuperação");

         else
        System.out.println("Reporvado");
        */

        //Exemplo de condição ternária simples
        int nota = 7;
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);
        
        /* Exemplo de condição ternária composta (if-else-if)
        int nota = 6;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado); 
        */

    }
    
}

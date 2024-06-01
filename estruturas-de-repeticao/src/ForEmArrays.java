public class ForEmArrays {
    public static void main(String[] args) {

        String clientes [] = {"01", "02","03","04","05"};

        for (String cliente : clientes) {
            System.out.println("O cliente " + cliente + " está sendo solicitado na sala 2");
        }

        /* 
        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
	
        // Em arrays o índice sempre começa em 0
        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }*/
        /* 
        //Forma abreviada
	for(String aluno : alunos) {
	  System.out.println(alunos);
	}*/
    }
}

package edu.camila.primeirasemana;
public class TesteDeIdade {
    
public static void main (String[] args) {
    
    String meuNome = "Camila";
    int anoNascimento = 1997;
    boolean maiorDeIdade = true;

    { if (anoNascimento < 2006) 
    maiorDeIdade = true;
    else 
    maiorDeIdade = false;
    }

    {
        if (maiorDeIdade)
        System.out.println(meuNome + " é maior de idade");

        else
        System.out.println(meuNome + " é menor de idade");
    }
    

}

}

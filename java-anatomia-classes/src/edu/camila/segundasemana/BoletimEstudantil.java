package edu.camila.segundasemana;
public class BoletimEstudantil {

    public static void main(String [] args) {
        int mediaFinal = 5;

        if (mediaFinal < 6)
        System.out.println("REPROVADO");

        else if (mediaFinal == 6)
        System.out.println("Aprovado pelo Conselho");

        else 
        System.out.println("APROVADO");

    }
}
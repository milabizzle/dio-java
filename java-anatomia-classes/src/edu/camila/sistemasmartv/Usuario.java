package edu.camila.sistemasmartv;

public class Usuario {

public static void main(String[] args) {
    
    SmartTv smartTv = new SmartTv();

    System.out.println("TV ligada? " + smartTv.ligada);
    System.out.println("Canal atual: " + smartTv.canal);
    System.out.println("Volume atual: " + smartTv.volume);

    smartTv.ligar();
    System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    System.out.println("Volume atualizado: " + smartTv.volume);

    smartTv.aumentarCanal();
    smartTv.aumentarCanal();
    smartTv.aumentarCanal();
    smartTv.aumentarCanal();
    smartTv.aumentarCanal();
    System.out.println("Canal atualizado: " + smartTv.canal);

    smartTv.diminuirCanal();
    smartTv.diminuirCanal();
    System.out.println("Canal atualizado: " + smartTv.canal);

    smartTv.desligar();
    System.out.println("A TV ainda está ligada? " + smartTv.ligada);

}    

}

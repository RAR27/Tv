package org.example;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.ligada);

        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.desligar();
        System.out.println("Novo Status -> TV Desligada ? " + smartTv.ligada);
    }
}
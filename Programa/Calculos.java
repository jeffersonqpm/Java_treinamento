package Programa;

public class Calculos {

    private float media;

    public float getMedia() {
        return media;
    }

    public void calcMedia(float soma, int quantidadeNotas){

        media = soma / quantidadeNotas;

    }
    
}

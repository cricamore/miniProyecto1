package myProject;

public class ModelGeek {
    private Dado dado1, dado2, dado3, dado4, dado5, dado6, dado7, dado8, dado9, dado10, dado42;
    private int ronda, puntuacion, estado;
    private int[] caras;

    public ModelGeek(){
        dado1 = new Dado();
        dado2 = new Dado();
        dado3 = new Dado();
        dado4 = new Dado();
        dado5 = new Dado();
        dado6 = new Dado();
        dado7 = new Dado();
        caras = new int[7];
    }

    public void inicio(){
        caras[0]= dado1.getCara();
        caras[1]= dado2.getCara();
        caras[2]= dado3.getCara();
        caras[3]= dado4.getCara();
        caras[4]= dado5.getCara();
        caras[5]= dado6.getCara();
        caras[6]= dado7.getCara();
    }

    public int[] getCaras(){
        return caras;
    }


}

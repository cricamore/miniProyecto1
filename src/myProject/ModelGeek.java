package myProject;

public class ModelGeek {
    private Dado dado1, dado2, dado3, dado4, dado5, dado6, dado7, dado8, dado9, dado10, dado42;
    private int ronda, puntuacion, estado;
    private boolean elimActiv;
    private String estadoToString;
    private int[] caras;

    public ModelGeek(){
        dado1 = new Dado();
        dado2 = new Dado();
        dado3 = new Dado();
        dado4 = new Dado();
        dado5 = new Dado();
        dado6 = new Dado();
        dado7 = new Dado();
        dado8 = new Dado();
        dado9 = new Dado();
        dado10 = new Dado();
        caras = new int[10];
    }

    public void inicio(){
        caras[0] = dado1.getCara();
        caras[1] = dado2.getCara();
        caras[2] = dado3.getCara();
        caras[3] = dado4.getCara();
        caras[4] = dado5.getCara();
        caras[5] = dado6.getCara();
        caras[6] = dado7.getCara();
        caras[7] = dado8.getCara();
        caras[8] = dado9.getCara();
        caras[9] = dado10.getCara();
    }

    public int[] getCaras(){
        return caras;
    }

    public void carasDado1(){
        if(caras[0]==1){
            estado = 1;
        }else if(caras[0]==2){
            estado = 2;
        }else if(caras[0]==3){
            estado = 3;
        }else if(caras[0]==4){
            estado = 4;
        }else if(caras[0]==5){
            estado = 5;
        }else if(caras[0]==6){
            estado = 6;
        }
    }

    public void carasDado2(){
        if(caras[1]==1){
            estado = 1;
        }else if(caras[1]==2){
            estado = 2;
        }else if(caras[1]==3){
            estado = 3;
        }else if(caras[1]==4){
            estado = 4;
        }else if(caras[1]==5){
            estado = 5;
        }else if(caras[1]==6){
            estado = 6;
        }
    }

    public void carasDado3(){
        if(caras[2]==1){
            estado = 1;
        }else if(caras[2]==2){
            estado = 2;
        }else if(caras[2]==3){
            estado = 3;
        }else if(caras[2]==4){
            estado = 4;
        }else if(caras[2]==5){
            estado = 5;
        }else if(caras[2]==6){
            estado = 6;
        }
    }

    public void carasDado4(){
        if(caras[3]==1){
            estado = 1;
        }else if(caras[3]==2){
            estado = 2;
        }else if(caras[3]==3){
            estado = 3;
        }else if(caras[3]==4){
            estado = 4;
        }else if(caras[3]==5){
            estado = 5;
        }else if(caras[3]==6){
            estado = 6;
        }
    }

    public void carasDado5(){
        if(caras[4]==1){
            estado = 1;
        }else if(caras[4]==2){
            estado = 2;
        }else if(caras[4]==3){
            estado = 3;
        }else if(caras[4]==4){
            estado = 4;
        }else if(caras[4]==5){
            estado = 5;
        }else if(caras[4]==6){
            estado = 6;
        }
    }

    public void carasDado6(){
        if(caras[5]==1){
            estado = 1;
        }else if(caras[5]==2){
            estado = 2;
        }else if(caras[5]==3){
            estado = 3;
        }else if(caras[5]==4){
            estado = 4;
        }else if(caras[5]==5){
            estado = 5;
        }else if(caras[5]==6){
            estado = 6;
        }
    }

    public void carasDado7(){
        if(caras[6]==1){
            estado = 1;
        }else if(caras[6]==2){
            estado = 2;
        }else if(caras[6]==3){
            estado = 3;
        }else if(caras[6]==4){
            estado = 4;
        }else if(caras[6]==5){
            estado = 5;
        }else if(caras[6]==6){
            estado = 6;
        }
    }

    public void carasDado8(){
        if(caras[7]==1){
            estado = 1;
        }else if(caras[7]==2){
            estado = 2;
        }else if(caras[7]==3){
            estado = 3;
        }else if(caras[7]==4){
            estado = 4;
        }else if(caras[7]==5){
            estado = 5;
        }else if(caras[7]==6){
            estado = 6;
        }
    }

    public void carasDado9(){
        if(caras[8]==1){
            estado = 1;
        }else if(caras[8]==2){
            estado = 2;
        }else if(caras[8]==3){
            estado = 3;
        }else if(caras[8]==4){
            estado = 4;
        }else if(caras[8]==5){
            estado = 5;
        }else if(caras[8]==6){
            estado = 6;
        }
    }

    public void carasDado10(){
        if(caras[9]==1){
            estado = 1;
        }else if(caras[9]==2){
            estado = 2;
        }else if(caras[9]==3){
            estado = 3;
        }else if(caras[9]==4){
            estado = 4;
        }else if(caras[9]==5){
            estado = 5;
        }else if(caras[9]==6){
            estado = 6;
        }
    }

    public String getEstadoToString(){
        switch (estado){
            case 1:estadoToString= "Has elegido: 42\n"
                    +"Sumaste 1 punto";
                break;
            case 2:estadoToString= "Has elegido: Corazón\n"
                    +"Obtienes un dado inactivo";
                break;
            case 3:estadoToString= "No puedes elegir el dado Dragón\n"
                    +"Elige un dado diferente";
                break;
            case 4:estadoToString= "Has elegido: Superhéroe\n"
                    +"Elige un dado para darle la vuelta";
                break;
            case 5:estadoToString= "Has elegido: Meeple\n"
                    +"Vuelve a lanzar un dado activo";
                break;
            case 6:estadoToString= "Has elegido: Cohete\n"
                    +"Elimina un dado de la zona de activos";
                break;
        }
        return estadoToString;
    }

    public boolean dragon1(){
        if(caras[0]==3){
            return true;
        }else {
            return false;
        }
    }

    public boolean dragon2(){
        if(caras[1]==3){
            return true;
        }else {
            return false;
        }
    }

    public boolean dragon3(){
        if(caras[2]==3){
            return true;
        }else {
            return false;
        }
    }

    public boolean dragon4(){
        if(caras[3]==3){
            return true;
        }else {
            return false;
        }
    }

    public boolean dragon5(){
        if(caras[4]==3){
            return true;
        }else {
            return false;
        }
    }

    public boolean dragon6(){
        if(caras[5]==3){
            return true;
        }else {
            return false;
        }
    }

    public boolean dragon7(){
        if(caras[6]==3){
            return true;
        }else {
            return false;
        }
    }

    public boolean dragon8(){
        if(caras[7]==3){
            return true;
        }else {
            return false;
        }
    }

    public boolean dragon9(){
        if(caras[8]==3){
            return true;
        }else {
            return false;
        }
    }

    public boolean dragon10(){
        if(caras[9]==3){
            return true;
        }else {
            return false;
        }
    }

    public boolean corazon1(){
        if(caras[0]==2){
            return true;
        }else {
            return false;
        }
    }

    public boolean corazon2(){
        if(caras[1]==2){
            return true;
        }else {
            return false;
        }
    }

    public boolean corazon3(){
        if(caras[2]==2){
            return true;
        }else {
            return false;
        }
    }

    public boolean corazon4(){
        if(caras[3]==2){
            return true;
        }else {
            return false;
        }
    }

    public boolean corazon5(){
        if(caras[4]==2){
            return true;
        }else {
            return false;
        }
    }

    public boolean corazon6(){
        if(caras[5]==2){
            return true;
        }else {
            return false;
        }
    }

    public boolean corazon7(){
        if(caras[6]==2){
            return true;
        }else {
            return false;
        }
    }

    public boolean corazon8(){
        if(caras[7]==2){
            return true;
        }else {
            return false;
        }
    }

    public boolean corazon9(){
        if(caras[8]==2){
            return true;
        }else {
            return false;
        }
    }

    public boolean corazon10(){
        if(caras[9]==2){
            return true;
        }else {
            return false;
        }
    }

    public boolean dado421(){
        if(caras[0]==1){
            return true;
        }else{
            return false;
        }
    }

    public boolean dado422(){
        if(caras[1]==1){
            return true;
        }else{
            return false;
        }
    }

    public boolean dado423(){
        if(caras[2]==1){
            return true;
        }else{
            return false;
        }
    }

    public boolean dado424(){
        if(caras[3]==1){
            return true;
        }else{
            return false;
        }
    }

    public boolean dado425(){
        if(caras[4]==1){
            return true;
        }else{
            return false;
        }
    }

    public boolean dado426(){
        if(caras[5]==1){
            return true;
        }else{
            return false;
        }
    }

    public boolean dado427(){
        if(caras[6]==1){
            return true;
        }else{
            return false;
        }
    }

    public boolean dado428(){
        if(caras[7]==1){
            return true;
        }else{
            return false;
        }
    }

    public boolean dado429(){
        if(caras[8]==1){
            return true;
        }else{
            return false;
        }
    }

    public boolean dado4210(){
        if(caras[9]==1){
            return true;
        }else{
            return false;
        }
    }

    public boolean heroe1(){
        if(caras[0]==4){
            return true;
        }else{
            return false;
        }
    }

}



package myProject;

import java.util.Random;

/**
 * Class Dado generate a Random value between 1 and 6
 * @author Cristian Montaño 202024223
 * @author Maicol Montenegro 202026993
 * @version v.1.0.0 date 28/01/2022
 */
public class Dado {
    private int cara;

    /**
     * Method that generate a random value to cara
     * @return number between (1,6)
     */
    public int getCara() {
        Random aleatorio = new Random();
        cara = aleatorio.nextInt(6) + 1;
        return cara;
    }
}




package foundation;

import java.util.Random;

public class Oyun {

    int zerAt() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
    int xalTopla(int xal, int zer){
        if(xal + zer <= 30 ){
            return xal + zer;
        }
        return xal;
    }
}


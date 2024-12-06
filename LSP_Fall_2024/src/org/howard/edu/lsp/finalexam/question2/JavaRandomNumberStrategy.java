package org.howard.edu.lsp.finalexam.question2;

    /**
     * Uses the built in random module
     */
import java.util.Random;

public class JavaRandomNumberStrategy implements RandomNumberStrategy {
    public Random r;
    
    public JavaRandomNumberStrategy() {
        r = new Random(); 
    }

    public int getRandomNumber() {
        int x = r.nextInt(Integer.MAX_VALUE)+1;
        return x; // return random int
    }
}

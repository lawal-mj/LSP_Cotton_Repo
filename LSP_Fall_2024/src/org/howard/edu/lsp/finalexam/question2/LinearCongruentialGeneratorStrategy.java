package org.howard.edu.lsp.finalexam.question2;

    /**
     * Class that uses the LCG algorith to generate randomly
     */
public class LinearCongruentialGeneratorStrategy implements RandomNumberStrategy {
    long s; 
 
    public LinearCongruentialGeneratorStrategy() {
        s = System.currentTimeMillis();
    }
 
    public int getRandomNumber() {
        // some weird math found online
        s = (1664525*s+1013904223) % 4294967296L;
        int v=(int)(s & 0x7FFFFFFF);
        if(v==0) {
          v=1;
        }
        return v;
    }
 }
 

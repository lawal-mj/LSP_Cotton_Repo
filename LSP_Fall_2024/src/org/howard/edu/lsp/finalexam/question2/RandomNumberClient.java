package org.howard.edu.lsp.finalexam.question2;
    /**
     * test the service with two strategies
     */
public class RandomNumberClient {
    public static void main(String[] args) {
       RandomNumberService srv = RandomNumberService.getInstance();
       
       // use java random
       srv.setStrategy(new JavaRandomNumberStrategy());
       System.out.println("java random: " + srv.getRandomNumber());

       // use LCG
       srv.setStrategy(new LinearCongruentialGeneratorStrategy());
       System.out.println("lcg random: " + srv.getRandomNumber());
    }
}

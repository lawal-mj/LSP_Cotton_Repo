package org.howard.edu.lsp.finalexam.question2;
    /**
     * test the service with two strategies
     */
public class RandomNumberClient {
    public static void main(String[] args) {
       RandomNumberService service = RandomNumberService.getInstance();
       
       // use java random
       service.setStrategy(new JavaRandomNumberStrategy());
       System.out.println("java random: " + service.getRandomNumber());

       // use LCG
       service.setStrategy(new LinearCongruentialGeneratorStrategy());
       System.out.println("lcg random: " + service.getRandomNumber());
    }
}

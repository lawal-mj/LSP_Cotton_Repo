package org.howard.edu.lsp.finalexam.question2;

    /**
     * A Singleton class that uses a strategy to get random numbers
     */
public class RandomNumberService {
    // only one instance
    private static RandomNumberService instance;
    public RandomNumberStrategy strategy; // public to keep it simple

    private RandomNumberService() {
       // default strategy
       strategy = new JavaRandomNumberStrategy();
    }

    public static RandomNumberService getInstance() {
       if(instance==null) {
          instance=new RandomNumberService();
       }
       return instance;
    }

    public void setStrategy(RandomNumberStrategy s) {
        strategy = s;
    }

    public int getRandomNumber() {
       return strategy.getRandomNumber();
    }
}

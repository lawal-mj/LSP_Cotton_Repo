package org.howard.edu.lsp.midterm.question3;

/**
 * Class to test the fucntionality of the Voting machine class
 */
public class VotingMachineDriver {
    public static void main(String[] args) {
        // Create a VotingMachine instance
        VotingMachine vm = new VotingMachine();

        // adding the  candidates
        vm.addCandidate("Alsobrooks");
        vm.addCandidate("Hogan");

// casting votes 
        vm.castVote("Alsobrooks");
        vm.castVote("Alsobrooks");
        vm.castVote("Hogan");


        System.out.println(vm.toString()); 
    }
}

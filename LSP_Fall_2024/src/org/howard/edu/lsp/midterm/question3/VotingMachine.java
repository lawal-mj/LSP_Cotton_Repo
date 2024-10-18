/**
*  Name: Abdulmujeeb Lawal
*/
package org.howard.edu.lsp.midterm.question3;


// i thought to use a HashMap for this cuz its easy to track each candidate and i just care about number of votes 
import java.util.HashMap;
import java.util.Map;

/**
 * a voting mahcine to add candidates, cast votes for them and then also print out the total votes.
 */
public class VotingMachine {
    // Hashmap to store candidates names and vote number
    private HashMap<String, Integer> candidates;

    /**
     * the constrcutor to initialize voting machine
     */
    public VotingMachine() {
        candidates = new HashMap<>();
    }

    /**
     * adds a new candidate, also checks if the candiate exists and dosent add them if thats the case
     *
     * @param name candidate name 
     */
    public void addCandidate(String name) {
        if (!candidates.containsKey(name)) {
            candidates.put(name, 0);
        }
    }

    /**
     * Casts a vote for the candidate 
     * @param name candidate name 
     */
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1); // add one to their vote
        }
    }

    /**
     * This retusns a string representation of candidates and their votes with the format : "CandidateName: VoteCount"
     *
     * @return a string with the candidates and their vote counts
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return result.toString();
    }
}
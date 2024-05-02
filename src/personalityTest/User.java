
package personalityTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
 * Project: Moral Alignment Personality Test
 * Author: Anna Haller
 * Due Date: 4/8/24
 * 
 * User class stores information about the user including
 * name, answers to test questions, and personality type.
 * 
 */

public class User {

    private String name;
    private ArrayList<String> answers;
    private String alignment; 

    // Constructor to initialize the User with a name.
    public User(String name) {
        this.name = name;
        this.answers = new ArrayList<>();
        this.alignment = "";
    }

    // Method to record an answer into the user's list of answers.
    public void recordAnswer(String answer) {
        this.answers.add(answer);
    }

    // Method created to analyze the user's answers and determine the most fitting character result
    public String tabulateAlignment() {
        // Making a mapping for the characters
        Map<String, Integer> characterScores = new HashMap<>();
        characterScores.put("SpongeBob", 0);
        characterScores.put("Patrick", 0);
        characterScores.put("Squidward", 0);
        characterScores.put("Mr. Krabs", 0);
        characterScores.put("Sandy", 0);
        characterScores.put("Plankton", 0); // Including Plankton for additional options.

        // Loop through all answers and increment the score for the appropriate character based on the answer.
        for (String answer : answers) {
            switch (answer) {
                case "I keep smiling and stay optimistic":
                case "Jellyfishing":
                case "Friends and fun":
                case "Krabby Patty":
                case "Frying up food at a fast-food restaurant":
                case "Snail":
                    characterScores.put("SpongeBob", characterScores.get("SpongeBob") + 1);
                    break;
                case "I hardly notice":
                case "Sleeping":
                case "Loyal but clueless":
                case "Ice Cream":
                case "Being a star":
                case "Worm":
                    characterScores.put("Patrick", characterScores.get("Patrick") + 1);
                    break;
                case "I get grumpy and complain":
                case "Playing music":
                case "Cynical and sarcastic":
                case "Anything I don't have to cook":
                case "Being an artist":
                case "No pets, too much hassle":
                    characterScores.put("Squidward", characterScores.get("Squidward") + 1);
                    break;
                case "Counting my money":
                case "Money and power":
                case "Greedy and cheap":
                case "Managing a business":
                    characterScores.put("Mr. Krabs", characterScores.get("Mr. Krabs") + 1);
                    break;
                case "Practicing karate":
                case "Knowledge and inventing":
                case "Inventive and smart":
                case "A protein-packed snack":
                case "Inventing new gadgets":
                case "A high-energy squirrel":
                    characterScores.put("Sandy", characterScores.get("Sandy") + 1);
                    break;
                case "Scheming":
                case "Small but mighty":
                case "Mastermind":
                    characterScores.put("Plankton", characterScores.get("Plankton") + 1);
                    break;
            }
        }

        // Determine which character from SpongeBob has the highest score. Return their results as the user's character alignment
        return characterScores.entrySet().stream()
                               .max(Map.Entry.comparingByValue())
                               .map(Map.Entry::getKey)
                               .orElse("Unknown");
    }
}
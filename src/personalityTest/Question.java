package personalityTest;


import java.util.ArrayList;
import java.util.List;

/* 
 * Project: SpongeBob Alignment Personality Quiz
 * Author: Jay Melton
 * Due Date: 4/8/24
 * 
 * The question class, per Anna's advice, represents questions in the quiz.
 * The program can hold the question's text and, a list of
 * possible answers for multiple choice.
 * 
 */


 public class Question {

    private String questionText;
    private ArrayList<String> possibleAnswers;

    // Constructor for creating a question with no predefined answers
    public Question(String questionText) {
        this.questionText = questionText;
        this.possibleAnswers = new ArrayList<>();
    }

    // Constructor for creating a question with predefined answers
    public Question(String questionText, ArrayList<String> possibleAnswers) {
        this.questionText = questionText;
        this.possibleAnswers = new ArrayList<>(possibleAnswers);
    }

    // Add a possible answer to the question
    public void addAnswer(String answer) {
        if (!possibleAnswers.contains(answer)) {
            possibleAnswers.add(answer);
        }
    }

    // Remove a possible answer from the question
    public boolean removeAnswer(String answer) {
        return possibleAnswers.remove(answer);
    }

    // Check if the provided answer index is valid
    public boolean isAnswerIndexValid(int index) {
        return index >= 0 && index < possibleAnswers.size();
    }

    // Get a formatted string of all possible answers
    public String getFormattedAnswers() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < possibleAnswers.size(); i++) {
            builder.append((i + 1)).append(". ").append(possibleAnswers.get(i)).append("\n");
        }
        return builder.toString();
    }

    // Get the text of the question
    public String getQuestionText() {
        return questionText;
    }

    // Set the text of the question
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    // Get a copy of the list of possible answers to prevent external modifications
    public ArrayList<String> getPossibleAnswers() {
        return new ArrayList<>(possibleAnswers);
    }

    // Set possible answers with a new list, in turn replacing the old 
    public void setPossibleAnswers(ArrayList<String> possibleAnswers) {
        this.possibleAnswers = new ArrayList<>(possibleAnswers);
    }

    // Method to create and initialize a list of questions for the user in order to help match them to the characters
    public static ArrayList<Question> createQuestions() {
        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new Question("How do you react when things don't go your way?", new ArrayList<>(List.of("I get grumpy and complain", "I hardly notice", "I keep smiling and stay optimistic"))));
        questions.add(new Question("What's your ideal weekend activity?", new ArrayList<>(List.of("Practicing karate", "Jellyfishing", "Counting my money", "Playing music", "Sleeping"))));
        questions.add(new Question("What is most important to you?", new ArrayList<>(List.of("Friends and fun", "Knowledge and inventing", "Money and power", "Peace and quiet"))));
        questions.add(new Question("How do others describe you?", new ArrayList<>(List.of("Energetic and optimistic", "Loyal but clueless", "Cynical and sarcastic", "Inventive and smart", "Greedy and cheap"))));
        questions.add(new Question("Pick a favorite food", new ArrayList<>(List.of("Krabby Patty", "Ice Cream", "Anything I don't have to cook", "A protein-packed snack"))));
        questions.add(new Question("What is your dream job?", new ArrayList<>(List.of("Frying up food at a fast-food restaurant", "Being a star", "Managing a business", "Being an artist", "Inventing new gadgets"))));
        questions.add(new Question("Choose a pet", new ArrayList<>(List.of("Snail", "Worm", "No pets, too much hassle", "A high-energy squirrel"))));

        return questions;
    }
}

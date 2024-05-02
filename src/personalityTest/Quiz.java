package personalityTest;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class represents a quiz with attributes and methods that manage the process
 * of conducting a quiz including storing questions, interacting with the user,
 * and processing user responses to determine a personality match with SpongeBob characters.
 * 
 * @author: Dorris Tazi
 * @date due: 5/1/2024
 */
public class Quiz {
    
    // Instance variables
    private String quizName;  // Name of the quiz
    private ArrayList<Question> questions;  // List to store the questions of the quiz
    private User user;  // User taking the quiz to record answers and calculate results
    private boolean isCompleted;  // Flag to check if the quiz has been completed

    /**
     * Constructs a Quiz object with specified name and user. Initializes questions
     * from a predefined method and sets the completion status to false by default.
     * 
     * @param quizName The name of the quiz
     * @param user The user who will be taking the quiz
     */
    public Quiz(String quizName, User user) {
        this.quizName = quizName;
        this.questions = Question.createQuestions();  // Assuming createQuestions() returns a populated list of questions
        this.user = user;
        this.isCompleted = false;
    }
    
    /**
     * Starts the quiz, presents each question to the user, and records user responses.
     * Marks the quiz as completed once all questions are answered and displays the result.
     */
    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the " + this.quizName + " Quiz!");

        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            System.out.println(question.getFormattedAnswers());
            System.out.print("Your answer (number): ");
            int answerIndex = scanner.nextInt() - 1;
            if (question.isAnswerIndexValid(answerIndex)) {
                String chosenAnswer = question.getPossibleAnswers().get(answerIndex);
                user.recordAnswer(chosenAnswer);  // User class records the answer
            } else {
                System.out.println("Invalid choice, please try again.");
                answerIndex = scanner.nextInt() - 1;  // Simplified, consider looping until valid
            }
        }
        this.isCompleted = true;
        System.out.println("Quiz Completed. Calculating your results...");
        user.tabulateAlignment();
        System.out.print("user alignment: " + user.alignment); 
        System.out.println(user.displayResults()); // Displays the result of which character the user is like

        scanner.close();
    }
    
    // Standard getters and setters for class properties
    public String getQuizName() {
        return quizName;
    }
    
    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }
    
    public int getNumberOfQuestions() {
        return questions.size();
    }
    
    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
    
    public boolean isCompleted() {
        return isCompleted;
    }
}

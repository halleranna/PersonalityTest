package personalityTest;

/**
 * This class represents a quiz with attributes and methods.
 *
 * @author: Dorris Tazi
 * @date due: 5/1/2024
 */

public class Quiz {
    
    // Instance variables
    private String quizName;
    private int numberOfQuestions;
    private boolean isCompleted;
    
    // Constructors
    
    /* 
     * Constructs a Quiz object with the given quiz name, number of questions,
     * and completion status.
     */
    public Quiz(String quizName, int numberOfQuestions, boolean isCompleted) {
        this.quizName = quizName;
        this.numberOfQuestions = numberOfQuestions;
        this.isCompleted = isCompleted;
    }
    
    /* 
     * Constructs a Quiz object with the given quiz name and number of questions.
     * The completion status is set to false by default.
     */
    public Quiz(String quizName, int numberOfQuestions) {
        this.quizName = quizName;
        this.numberOfQuestions = numberOfQuestions;
        this.isCompleted = false; // Default completion status
    }
    
    /* 
     * Constructs a Quiz object with default values.
     */
    public Quiz() {
        this.quizName = "";
        this.numberOfQuestions = 0;
        this.isCompleted = false;
    }
    
    // Getters and Setters
    
    /* 
     * Returns the name of the quiz.
     */
    public String getQuizName() {
        return this.quizName;
    }
    
    /* 
     * Sets the name of the quiz.
     */
    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }
    
    /* 
     * Returns the number of questions in the quiz.
     */
    public int getNumberOfQuestions() {
        return this.numberOfQuestions;
    }
    
    /* 
     * Sets the number of questions in the quiz.
     */
    public void setNumberOfQuestions(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }
    
    /* 
     * Returns true if the quiz is completed; otherwise, false.
     */
    public boolean isCompleted() {
        return this.isCompleted;
    }
    
    /* 
     * Sets the completion status of the quiz.
     */
    public void setCompleted(boolean completed) {
        this.isCompleted = completed;
    }
    
    /* 
     * Records the answer to a question in the quiz.
     */
    public void recordAnswer(int questionNumber, String answer) {
        System.out.println("Answer recorded for question " + questionNumber + ": " + answer);
    }
}

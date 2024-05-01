package lab9;

public class Quiz {
    
    // Instance variables
    private String quizName;
    private int numberOfQuestions;
    private boolean isCompleted; // New instance variable to track quiz completion
    
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
        this(quizName, numberOfQuestions, false); // Delegating to the other constructor
    }
    
    /* 
     * Constructs a Quiz object with default values.
     */
    public Quiz() {
        this("", 0, false); // Delegating to the other constructor with default values
    }
    
    // Getters and Setters
    
    /* 
     * Returns the name of the quiz.
     */
    public String getQuizName() {
        return this.quizName;
    }
    
    /* 
     *Creates name of the quiz.
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
 
    
}
package personalityTest;


import java.util.ArrayList;

/* 
 * Project: Moral Alignment Personality Quiz
 * Author: Jay Melton
 * Due Date: 4/8/24
 * 
 * The question class, per Anna's advice, represents a single question in the quiz.
 * The program can hold the question's text and, a list of
 * possible answers for multiple choice.
 * 
 */


 public class Question {

    // variables
    private String questionText;
    private ArrayList<String> possibleAnswers;
    
    // constructor for normal questions
    public Question(String questionText) {
        this.questionText = questionText;
        this.possibleAnswers = new ArrayList<>();
    }
    
    // multiple-choice question constructor, already has answers
    public Question(String questionText, ArrayList<String> possibleAnswers) {
        this.questionText = questionText;
        this.possibleAnswers = possibleAnswers;
    }

    // set the text for the question,
    // made this so the Quiz class can set/alter the questions if need be
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }
    
    // return the question
    public String getQuestionText() {
        return questionText;
    }
    
    // get multiple choice answers
    public ArrayList<String> getPossibleAnswers() {
        return possibleAnswers;
    }
    
    // create and set possible multiple choice
    public void setPossibleAnswers(ArrayList<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }
}
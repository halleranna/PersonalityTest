
package personalityTest;

import java.util.ArrayList;

/* 
 * Project: Spongebob Personality Test
 * Author: Anna Haller
 * Due Date: 5/1/24
 * 
 * User class stores information about the user including
 * name, answers to test questions, and personality type.
 * 
 */

public class User {

	//instance variables
	private String name;
	private ArrayList<String> answers;
	private String personality;
	private ArrayList<String> traits;
	
	//constructor
	User(String name) {
		this.name = name;
		this.answers = new ArrayList<>();
		this.personality = "";
		this.traits = new ArrayList<>();
	}
	
	//empty constructor
	User() {
		this.name = "User";
		this.answers = new ArrayList<>();
		this.personality = "";
		this.traits = new ArrayList<>();
	}

	//greetUser greet the user using the name attribute
	protected String greetUser() {
		return "Hello, " + this.name;
	}

	
	//tabulatePersonality uses the answers ArrayList
	//to determine which personality the user fits
	protected String decidePersonality() {
		//
	
		this.determineTraits(personality);
		return this.personality;
	}
	
	//Assigns personality traits to the user based on
	//the results of their quiz
	protected void determineTraits(String personality) {
		switch(personality) {
		case "Spongebob":
			this.traits.add("optimistic");
			this.traits.add("friendly");
			this.traits.add("energetic");
			break;
		case "Patrick":
			this.traits.add("carefree");
			this.traits.add("humorous");
			this.traits.add("a bit slow");
			break;
		case "Squidward":
			this.traits.add("cynical");
			this.traits.add("artistic");
			this.traits.add("introverted");
			break;
		case "Mr. Krabs":
			this.traits.add("money-focused");
			this.traits.add("shrewd");
			this.traits.add("occasionally selfish");
			break;
		case "Sandy":
			this.traits.add("intelligent");
			this.traits.add("adventurous");
			this.traits.add("scientifically-minded");
			break;
		} 
	}
	
	//Returns a string that summarizes results for the user
	protected String displayResults() {
		String results = "Here are your results, " + this.name + "!\n\n"
				+ "You are most like " + this.personality + ".\n"
				+ "You tend to be ";
		for(int i = 0; i < this.traits.size(); i++) {
			if(i == this.traits.size() - 1) {
				results += "and " + this.traits.get(i) + ".\n\n";
			} else {
				results += this.traits.get(i) + ", ";
			}
		}
		results += "Thanks for visiting Bikini Bottom!";
		return results;
	}
	
	//getters and setters
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<String> getAnswers() {
		return this.answers;
	}
	
	public void setAnswers(ArrayList<String> answers) {
		this.answers = answers;
	}
	
	public String getPersonality() {
		return this.personality;
	}
	
	public void setPersonality(String personality) {
		this.personality = personality;
	}
	
	public static void main(String args[]) {
		User anna = new User("Anna");
		anna.setPersonality("Sandy");
		anna.determineTraits(anna.getPersonality());
		System.out.print(anna.displayResults());
	}
}



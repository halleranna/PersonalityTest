
package personalityTest;

import java.util.ArrayList;

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

	//instance variables
	private String name;
	private ArrayList answers;
	private String alignment;
	
	//constructor
	private User(String name) {
		this.name = name;
		this.answers = new ArrayList();
		this.alignment = "";
	}
	
	//empty constructor
	private User() {
		this.name = "User";
		this.answers = new ArrayList();
		this.alignment = "";
	}

	//greetUser greet the user using the name attribute
	private String greetUser() {
		return "";
	}
	
	//recordAnswer adds a user's answer to the
	//answers ArrayList
	private void recordAnswer(String answer) {
		
	}
	
	//tabulateAlignment uses the answers ArrayList
	//to determine the user's alignment
	private String tabulateAlignment() {
		return "";
	}
	
	//getters and setters
	public String getName() {
		re
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
	private ArrayList answers;
	private String personality;
	
	//constructor
	private User(String name) {
		this.name = name;
		this.answers = new ArrayList();
		this.personality = "";
	}
	
	//empty constructor
	private User() {
		this.name = "User";
		this.answers = new ArrayList();
		this.personality = "";
	}

	//greetUser greet the user using the name attribute
	private String greetUser() {
		return "Hello, " + this.name;
	}

	
	//tabulatePersonality uses the answers ArrayList
	//to determine which personality the user fits
	private String decidePersonality() {
		int spongebob = 0, sandy = 0, squidward = 0;
		for(int i = 0; i < answers.size(); i++) {
			if(spongebob > sandy && spongebob > squidward) {
				this.personality = "Spongebob";
			} else if (sandy > spongebob && sandy > squidward) {
				this.personality = "Sandy";
			} else if (squidward > spongebob && squidward > sandy) {
				this.personality = "Squidward";
			} else if (spongebob == sandy && spongebob > squidward) {
				this.personality = "Patrick";
			} else if (spongebob == squidward && spongebob > sandy) {
				this.personality = "Mr. Krabs";
			} else if(sandy == squidward && sandy > spongebob) {
				this.personality = "Plankton"; 
			}
		}
		return this.personality;
	}
	
	//getters and setters
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList getAnswers() {
		return this.answers;
	}
	
	public void setAnswers(ArrayList answers) {
		this.answers = answers;
	}
	
	public String getPersonality() {
		return this.personality;
	}
	
	public void setPersonality(String alignment) {
		this.personality = personality;
	}
	
}
turn this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList getAnswers() {
		return this.answers;
	}
	
	public void setAnswers(ArrayList answers) {
		this.answers = answers;
	}
	
	public String getAlignment() {
		return this.alignment;
	}
	
	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}
	
}

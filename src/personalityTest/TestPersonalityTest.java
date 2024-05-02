package personalityTest;

/*
 * Test class for Bikini Bottom personality test
 *
 * 
 */

public class TestPersonalityTest {

	public static void main(String[] args) {
		User userOne = new User("User One");
		Quiz quiz = new Quiz("Bikini Bottom", userOne);
		
		quiz.startQuiz();

	}

}

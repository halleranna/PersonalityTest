# PersonalityTest

Contributors: Anna Haller, Jay Melton, Dorris Tazi

Objective: We have attempted to create a personality test meant to determine which Spongebob character the user is most similar to based on their answers to multiple choice quiz questions.

The project contains 3 classes: the Question class, the Quiz class, and the User class, plus a test class and an incomplete GUI.

Question class - Jay Melton

Description: The Question class creates and produces questions for the Quiz. It stores them in a string and an array for the possible answers. 

Quiz class - Dorris

User class, GUI, test class - Anna Haller


Known issues with the project:

The GUI is incomplete. It does not run through the entire quiz; it crashes while loading the first question. This is why the console .jar was included. This still does not work properly as, after completing the quiz, the user's results are not displayed. There appears to be an issue in the tabulateAlignment function in the User class that is preventing the function's output from being assigned to the user's alignment attribute.

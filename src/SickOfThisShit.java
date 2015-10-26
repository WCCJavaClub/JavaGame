
import java.util.Scanner;

// mission index is 1
public class SickOfThisShit implements IPlayable{

	

	public int play(){

		// customMethods object is created in IPlayable
		customMethods.fileOutput("LeavingSchool");

		//checks the user input which will determine the next mission
		String input = keyboard.nextLine();
		if (input.contains("home"))
			return 2;
		else if (input.contains("karate"))
			return 3;
		System.out.println("Invalid Input");
		return 1; // plays this mission again

	}
}

// mission index is 3
public class PunchOrKickMaster implements IPlayable{

	public int play() {
		
		
		customMethods.fileOutput("PunchOrKick");

		//checks the user input which will determine the next mission
		String input = keyboard.nextLine();
		
		if (input.contains("punch"))
			return 4;
		else if (input.contains("kick"))
			return 5;
		else if (input.contains("both"))
			System.out.println("Fuck you. You can't have both!");
		else
			System.out.println("Invalid Input");
		return 3; // plays this mission again
	}
}

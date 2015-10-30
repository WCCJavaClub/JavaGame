
public class BigBang implements IPlayable {

	
	public int play() {
		
		customMethods.fileOutput("InTheBeginning");
		
		String input = keyboard.nextLine().toLowerCase();
		if (input.contains("get") || input.contains("yes"))
			return 1;
		else
			return 999;
	}
	

}

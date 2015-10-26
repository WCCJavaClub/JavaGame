import java.util.Scanner;


public interface IPlayable {
	public Scanner keyboard = new Scanner(System.in);
	public CustomMethods customMethods = new CustomMethods();
	public int play();

}

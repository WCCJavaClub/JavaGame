import java.util.ArrayList;

public class Engine {

	public static void main(String[] args) {


		ArrayList <IPlayable> playMissionsList = new ArrayList();
		
		// creating objects that represents the missions
		BigBang m0 = new BigBang();
		SickOfThisShit m1 = new SickOfThisShit();
		CryHome m2 = new CryHome();
		PunchOrKickMaster m3 = new PunchOrKickMaster();
		PunchMaster m4 = new PunchMaster();
		KickMaster m5 = new KickMaster();
		
		
		// filling the array list with the mission
		
		playMissionsList.add(0, m0);
		playMissionsList.add(1, m1);
		playMissionsList.add(2, m2);
		playMissionsList.add(3, m3);
		playMissionsList.add(4, m4);
		playMissionsList.add(5, m5);
		
		
		int missionNumber = 0;

		// missions return 999 when game is over
		while (missionNumber != 999)
		{
			// play method return an int which is the index of the next mission in the array
			missionNumber = playMissionsList.get(missionNumber).play();
			}

	}

}

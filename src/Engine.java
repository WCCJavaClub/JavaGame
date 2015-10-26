
public class Engine {

	public static void main(String[] args) {

		// playMissions array will be filled with objects that implements Iplayable interface
		IPlayable[] playMissions = new IPlayable[6];

		// creating objects that represents the missions
		SickOfThisShit m1 = new SickOfThisShit();
		CryHome m2 = new CryHome();
		PunchOrKickMaster m3 = new PunchOrKickMaster();
		PunchMaster m4 = new PunchMaster();
		KickMaster m5 = new KickMaster();
		
		// filling the array with the missions
		playMissions[1] = m1;
		playMissions[2] = m2;
		playMissions[3] = m3;
		playMissions[4] = m4;
		playMissions[5] = m5;
		
		int missionNumber = 1;
		int nextMission = 0;

		// missions return 999 when game is over
		while (missionNumber != 999)
		{
			// play method return an int which is the index of the next mission in the array
			nextMission = playMissions[missionNumber].play();
			missionNumber = nextMission;
		}

	}

}

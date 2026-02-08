package javaLab.Lab8;

public class Player {
	String playerName;
	int totalRuns;
	float average;
	
	
	public Player(String playerName, int totalRuns, float average) {
		this.playerName = playerName;
		this.totalRuns = totalRuns;
		this.average = average;
	}


	@Override
	public String toString() {
		return playerName + "," + totalRuns + "," + average;
	}
	
	
	
	
	
	
}

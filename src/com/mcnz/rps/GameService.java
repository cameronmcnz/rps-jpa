package com.mcnz.rps;

public class GameService {

	public  GameSummary playRoshambo(String client, String server) {

		GameSummary gameSummary = new GameSummary(client, server);
		gameSummary.setResult(getResult(client, server));
		
		return gameSummary;
	}
	
	public  String getResult(String client, String server) {
		String result = "tie";
		if (client.equals("paper")) {
		result = "win";
		}
		if (client.equals("scissors")) {
		result = "lose";
		}
		return result;
	}

}

package mineGame;

import mineGame.entities.GameHelper;
import mineGame.entities.SimpleStartup;

public class SimpleStartupGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfGuesses = 0;
		int randomNum = (int) (Math.random() * 5);

		GameHelper helper = new GameHelper();
		SimpleStartup theStartup = new SimpleStartup();

		int[] locations = { randomNum, randomNum + 1, randomNum + 2 };
		theStartup.setLocationCells(locations);

		boolean isAlive = true;
		while (isAlive) {
			int guess = helper.getUserInput("enter a number");

			String result = theStartup.checkYourself(guess);

			numOfGuesses++;
			if (result.equals("kill")) {

				isAlive = false;
				System.out.println("you took " + numOfGuesses + " Guesses");

			}
		}

	}

}

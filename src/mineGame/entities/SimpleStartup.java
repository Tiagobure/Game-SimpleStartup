package mineGame.entities;

public class SimpleStartup {
	private int locationCells[];
	private int numOfHits = 0;

	public SimpleStartup() {

	}

	public SimpleStartup(int[] locationCells, int numOfHits) {
		this.locationCells = locationCells;
		this.numOfHits = numOfHits;
	}

	public String checkYourself(int userGuess) {
		String guess = "miss";
		for (int cell : locationCells) {
             if (guess == cell) {
            	 result = "hit";
             }
		}

	}

	public void setLocationCells(int[] locationCells) {
		this.locationCells = locationCells;
	}

}

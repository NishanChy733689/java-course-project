public class Level {
    /**
     * Returns true if the player reached the goal on this level and returns false otherwise.
     */
    public boolean goalReached() {
        // Implementation not shown
        return false; // Placeholder
    }

    /**
     * Returns the number of points (a positive integer) recorded for this level.
     */
    public int getPoints() {
        // Implementation not shown
        return 0; // Placeholder
    }
}

public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;

    /**
     * Postcondition: All instance variables have been initialized.
     */
    public Game() {
        levelOne = new Level();
        levelTwo = new Level();
        levelThree = new Level();
    }

    /**
     * Returns true if this game is a bonus game and returns false otherwise.
     */
    public boolean isBonus() {
        // Implementation not shown
        return false; // Placeholder
    }

    /**
     * Simulates the play of this Game (consisting of three levels) and updates all relevant game data.
     */
    public void play() {
        // Implementation not shown
        // This method should simulate the game, setting goals as reached or not.
    }

    /**
     * Returns the score earned in the most recently played game, as described in part (a).
     */
    public int getScore() {
        int score = 0;

        // Check if the goals for each level were reached and add points accordingly
        if (levelOne.goalReached()) {
            score += levelOne.getPoints();
            if (levelTwo.goalReached()) {
                score += levelTwo.getPoints();
                if (levelThree.goalReached()) {
                    score += levelThree.getPoints();
                }
            }
        }

        // Triple the score if this is a bonus game
        if (isBonus()) {
            score *= 3;
        }

        return score;
    }

    /**
     * Simulates the play of num games and returns the highest score earned, as described in part (b).
     * Precondition: num > 0
     */
    public int playManyTimes(int num) {
        int highestScore = 0;

        for (int i = 0; i < num; i++) {
            play(); // Simulate a single play of the game
            int score = getScore(); // Get the score for this play
            if (score > highestScore) {
                highestScore = score; // Update highest score if this play's score is higher
            }
        }

        return highestScore;
    }
}

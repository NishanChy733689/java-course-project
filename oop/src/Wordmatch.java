public class WordMatch {
    /** The secret string. */
    private String secret;

    /** Constructs a WordMatch object with the given secret string of lowercase letters. */
    public WordMatch(String word) {
        this.secret = word;
    }

    /**
     * Returns a score for guess, as described in part (a).
     * Preconditions: 0 < guess.length() <= secret.length()
     */
    public int scoreGuess(String guess) {
        int occurrences = 0;
        int guessLength = guess.length();

        // Count the number of times `guess` appears as a substring in `secret`
        for (int i = 0; i <= secret.length() - guessLength; i++) {
            if (secret.substring(i, i + guessLength).equals(guess)) {
                occurrences++;
            }
        }

        // Calculate the score
        return occurrences * guessLength * guessLength;
    }

    /**
     * Returns the better of two guesses, as determined by scoreGuess and the rules for a tie-breaker.
     * Preconditions:
     * - guess1 and guess2 contain all lowercase letters.
     * - guess1 is not the same as guess2.
     */
    public String findBetterGuess(String guess1, String guess2) {
        int score1 = scoreGuess(guess1);
        int score2 = scoreGuess(guess2);

        if (score1 > score2) {
            return guess1;
        } else if (score2 > score1) {
            return guess2;
        } else {
            // Scores are equal, return the alphabetically greater guess
            return (guess1.compareTo(guess2) > 0) ? guess1 : guess2;
        }
    }
}

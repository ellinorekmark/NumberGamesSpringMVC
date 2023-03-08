package se.iths.numbergamesspringmvc;

import java.util.ArrayList;
import java.util.Random;


public class GuessingGame extends Game{

    int secretNumber;
    ArrayList<String> previousGuesses = new ArrayList<>();
    ArrayList<String> lastGameGuesses = new ArrayList<>();

    Integer highScore;
    Random random;

    public GuessingGame() {
        newGame();

    }
    @Override
    public String gameType(){
        return "gg";
    }
    void newGame(){
        random = new Random();
        lastGameGuesses = previousGuesses;
        previousGuesses = new ArrayList<>();
        secretNumber = random.nextInt(1, 101);
    }
    @Override
    public ArrayList<String> getPastGuesses() {
        if(previousGuesses.isEmpty()){
            return lastGameGuesses;
        }
        return previousGuesses;
    }

    public String guess(Guess g) {
        String result;
        Integer guess;
        try {
            guess = Integer.parseInt(g.getA());
        } catch (NumberFormatException e) {
            return "Invalid guess. Try again.";
        }
        previousGuesses.add(guess.toString());
        if (guess == secretNumber) {
            highScoreCheck();
            newGame();
            result = "Correct! I was thinking of the number "+ guess;
        } else if (guess < secretNumber) {
            result = "Wrong! Guess again. (Hint: Higher)";
        } else {
            result = "Wrong! Guess again. (Hint: Lower)";
        }
        return result;
    }


    void highScoreCheck() {
        int guesses = previousGuesses.size();
        if (highScore == null) {
            highScore = guesses;
        } else if (highScore > guesses) {
            highScore = guesses;
        }
    }

    public String getHighScore() {
        if (highScore != null) {
            return highScore.toString();
        } else {
            return "-";
        }
    }

}

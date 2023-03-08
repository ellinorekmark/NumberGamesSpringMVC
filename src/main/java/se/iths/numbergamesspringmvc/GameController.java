package se.iths.numbergamesspringmvc;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class BullsAndCowsController {

    @Autowired
    Game game;

    @GetMapping("/bullsandcows")
    String getGuessGame(Model m) {
        m.addAttribute("outcome", "");
        m.addAttribute("guess", new Guess());
        m.addAttribute("gametype", game.gameType());
        m.addAttribute("pastGuesses", game.getPastGuesses());
        m.addAttribute("highscore", game.getHighScore());
        return "bullsandcowsgame";
    }


    @PostMapping("/bullsandcows")
    String postGuessGame(@ModelAttribute("guess") Guess guess, Model m) {

        if (game.gameType().equals("none")) {
            if (guess.getGame().equals("bc")) {
                game = new BullsAndCows();
            }
            else if (guess.getGame().equals("gg")) {
                game = new GuessingGame();
            }
        }
        else {
            m.addAttribute("outcome", game.guess(guess));
            m.addAttribute("pastGuesses", game.getPastGuesses());
            m.addAttribute("highscore", game.getHighScore());
        }

        m.addAttribute("gametype", game.gameType());
        return "bullsandcowsgame";
    }
}

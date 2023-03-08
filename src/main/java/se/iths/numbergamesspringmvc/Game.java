package se.iths.numbergamesspringmvc;


import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
@Service
@SessionScope
public class Game {


      String guess(Guess g) {
            return null;
      }

      String getHighScore() {
            return null;
      }

      ArrayList<String> getPastGuesses() {
            return new ArrayList<>();
      }

      public Object gameType() {
            return "none";
      }
}

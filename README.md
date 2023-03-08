# NumberGamesSpringMVC
Two number guessing games created with SpringMVC and Thymeleaf. School excersize.


## Bulls and Cows

The program generates four unique digits between 0-9 and the player has to guess. 
It's the predecessor to the game Mastermind. The player's guess has to also consist of non repeating digits. 
For every digit that's correct and in the right place you get a Bull point, 
and for every digit that's correct but in the wrong place you get a Cow.  

## Guess the Number

The program generates a number between 1-100 and the player has to guess, getting clues of higher or lower.

### Keeping Track

Both games keep track of the high score for the current play session and shows the previous guesses to help you keep track of your game.


### SpringMVC and ThymeLeaf

The program is a school excersize and an introduction to SpringBoot and Thymeleaf. I have created a dynamic webpage that lets you choose which game you want to play and 
that switches out sections of html using Thymeleaf to update the game. The main goal of the excersize was to create the number guessing game (1-100) using SpringMVC and Thymeleaf, 
and a bonus was to add a game to the same page. It was important to separate game mechanics (Model) from the controller. 

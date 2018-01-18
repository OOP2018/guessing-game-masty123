    
# Guessing Game (MastGame.java)
A game that will random a number between 1 and 100. you will need guess which number is correct. Each time you guess it will tell you whether your guess number is too high or too low it will stop telling you until you found the correct number.


## GameConsole.java
This class use to this display the game title, question and your answer in the console

## NumberGame
A class that **MastGame.java** and **GameSolver** extend from it. It provide several method for  **MastGame.java** and 
**GameSolver**
## Main
This class is used for Initialize the **MastGame** and **GameSolver** class.
## GameSolver.java
A program that can find the correct number from the guessing game. This class solve the game by using the Bissection Algorithm. At each step you divide the search interval in half, so that the solution is always somewhere in the search interval.
    
## How to run
Press Ctrl+F11  then it will run the gamesolver. You can play it yourself by doing this step in the class called **Main**.

    
    		GameConsole ui = new GameConsole();
    		ui.play(game);
    		
        //	GameSolver gs = new GameSolver();
        //	gs.play(game);

    
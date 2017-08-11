package controlFlowAndParameters;
import acm.program.*;

public class GuessMySecretNumber extends ConsoleProgram{
	private static final int SECRET_NUMBER = 22;
	
	public void run(){
		int number = 0;
		boolean retry = true;
		while(retry){
			number = readInt("Enter a number:");
			if (number == SECRET_NUMBER){ //Guessed number
				retry = false;
			} else if(number < SECRET_NUMBER){ //Low number
				println("Your guess is too low");
			} else { //High number
				println("Your guess is too high");
			}
		}
		println("That's the number!");
	}
	
	public static void main(String[] args) {
		new GuessMySecretNumber().start(args);
	}
}

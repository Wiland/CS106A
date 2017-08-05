package introduction2Java;
import acm.program.*;
public class Add2Numbers extends ConsoleProgram {
	public void run(){
		println("This program adds two numbers");
		int n1 = readInt("Enter N1:");
		int n2 = readInt("Enter N2:");
		int total = n1 + n2;
		println("The total is " + total + ".");
	}
}

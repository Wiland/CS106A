package introduction2Java;
import acm.program.*;

import java.awt.Color;

import acm.graphics.*;
public class HelloProgram extends GraphicsProgram {
	public void run(){
		GLabel label = new GLabel("Hello World", 100, 75);
		label.setFont("SansSerif-36");
		label.setColor(Color.BLUE);
		add(label);
	}
	
	public static void main(String[] args){
		new HelloProgram().start(args);
	}
}

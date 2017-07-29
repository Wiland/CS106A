
/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	// You fill in this part
	public void run() {
		putBeeper();
		while (canKarelMove()) {
			smartMove();

			if (canKarelMove()) {
				smartMove();
				putBeeper();
			}
		}
	}
	
	private boolean canKarelMove(){
		return (facingEast() && (frontIsClear() || leftIsClear()))
				|| (facingWest() && (frontIsClear() || rightIsClear()));
	}

	private void smartMove() {
		if (frontIsClear()) {
			move();
		} else if (facingEast() && leftIsClear()) {
			turnLeft();
			move();
			turnLeft();
		} else if (facingWest() && rightIsClear()) {
			turnRight();
			move();
			turnRight();
		}
	}
}

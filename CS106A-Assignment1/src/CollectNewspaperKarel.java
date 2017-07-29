
/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {

	// You fill in this part
	public void run() {
		moveToDoor();
		turnLeft();
		move();
		pickBeeper();
		comeBack();
	}

	private void moveToDoor() {
		while (leftIsBlocked() && frontIsClear()) {
			move();
		}
		if (leftIsBlocked()) {
			turnRight();
			moveToDoor();
		}
	}
	
	private void comeBack(){
		turnAround();
		move();
		turnRight();
		moveToInitialPosition();
	}
	
	private void moveToInitialPosition(){
		while (frontIsClear()) {
			move();
		}
		if (leftIsClear() && facingNorth()) {
			turnLeft();
			moveToInitialPosition();
		} else {
			turnAround();
		}
	}
}

package controlFlowAndParameters;
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class CheckBoard extends GraphicsProgram{
	private static final int NROWS = 8;
	private static final int NCOLUMNS = 12;
	
	public void run(){
		int squareSize = getHeight() / NROWS;
		for(int i = 0; i < NROWS; i++){
			for(int j = 0; j < NCOLUMNS; j++){
				addOneSquare(squareSize, i, j);
			}
		}
	}
	
	public void addOneSquare(int size, int row, int column){
		int x = column * size;
		int y = row * size;
		GRect sq = new GRect(x, y, size, size);
		sq.setFilled(((row + column) % 2) != 0);
		add(sq);
	}
	
	public static void main(String[] args){
		new CheckBoard().start(args);
	}
}

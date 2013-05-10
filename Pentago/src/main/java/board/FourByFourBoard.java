package board;

import heuristic.FourByFourBoardHeuristicCalculator;
import heuristic.HeuristicCalculator;

public class FourByFourBoard extends AbstractBoard {
	final static private String blankFourByFourBoard = "[                ]";
	final static private String fourByFourBorder =    "  +------+------+\n";
	
	final static protected int WIDTH = 4;
	final static protected int HEIGHT = 4;
	final static protected int N_IN_A_ROW = 3;
	final static public int NUMBER_OF_SPOTS_ON_BOARD = WIDTH * HEIGHT;
	
	protected FourByFourBoard() {
		super(blankFourByFourBoard);
	}
	
	protected FourByFourBoard(String boardConfiguration) {
		super(boardConfiguration);
	}
	
	protected FourByFourBoard(BoardArray boardArray, int piecesOnBoard) {
		super(boardArray, piecesOnBoard);
	}

	@Override
	public int getDimension() {
		return WIDTH;
	}
	
	@Override
	public int getNInARow(){
		return N_IN_A_ROW;
	}
	
	@Override
	public int getNumberOfSpotsOnBoard() {
		return NUMBER_OF_SPOTS_ON_BOARD;
	}
	
	@Override
	public Board copy() {
		return new FourByFourBoard(toString());
	}
	
	@Override
	String getPrintBorder() {
		return fourByFourBorder;
	}
	
	@Override
	public BoardBuilder getBoardBuilder() {
		return new BoardBuilder() {
			@Override
			public Board build() {
				return new FourByFourBoard(getBoardArray(), getPiecesOnBoard());
			}
		};
	}

	@Override
	public HeuristicCalculator getHeuristicCalculator() {
		return new FourByFourBoardHeuristicCalculator();
	}

	@Override
	public int getWidth() {
		return WIDTH;
	}

	@Override
	public int getHeight() {
		return HEIGHT;
	}
}

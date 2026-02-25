package Mastery;

public class TicTacToe2 {
	private int[][][] row, row2, row3, col, col2, col3;
	private int round;
	private String player1, player2, winner;
	
	//Constructor method
	public TicTacToe2 () {
		player1 = "X";
		player2 = "0";
		row = new int[0][0][0];
		row2 = new int[0][0][0];
		row3 = new int[0][0][0];
		col = new int[0][0][0];
		col2 = new int[0][0][0];
		col3 = new int[0][0][0];
		winner = "";
	}
	
	//Overloading constructor method
	public TicTacToe2(int[][][] rowO, int[][][] rowO2, int[][][] rowO3, int[][][] colO, int[][][] colO2, int[][][] colO3, String winO) {
		row = rowO;
		row2 = rowO2;
		row3 = rowO3;
		col = colO;
		col2 = colO2;
		col3 = colO3;
		winner = winO;
	}
	
	//Access method
	public int[][][] getRow() {
		return row;
	}
	public int[][][] getRow2() {
		return row2;
	}
	public int[][][] getRow3() {
		return row3;
	}
	public int[][][] getCol() {
		return col;
	}
	public int[][][] getCol2() {
		return col;
	}
	public int[][][] getCol3() {
		return col3;
	}
	
	//Modifier method
	public void setRow(int[][][] rowO) {
		row = rowO;
	}
	public void setRow2(int[][][] rowO2) {
		row2 = rowO2;
	}
	public void setRow3(int[][][] rowO3) {
		row3 = rowO3;
	}
	public void setCol(int[][][] colO) {
		col = colO;
	}
	public void setCol2(int[][][] colO2) {
		col2 = colO2;
	}
	public void setCol3(int[][][] colO3) {
		col3 = colO3;
	}
	
	//Return 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

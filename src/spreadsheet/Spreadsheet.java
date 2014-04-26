package spreadsheet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roger_Torra
 */
public class Spreadsheet {


	private int numRows, numCols;
	private Celda[][] cells;



	public Spreadsheet(int rows, int cols) {
		numRows = rows;
		numCols = cols;
		cells = new Celda[numRows][numCols];
		for(int i = 0; i < numRows; i++) {
			for(int j = 0; j < numCols; j++) {
				cells[i][j] = new Celda();
			}
		}
	}

	public Spreadsheet(int size) {
		this(size, size);
	}

	public Spreadsheet() {
		this(5);
	}

	public Celda getCelda(int row, int col) {
		if (0 <= row && row < numRows && 0 <= col && col < numCols) {
			return cells[row][col];
		}
		return null;
	}

	public String toString() {
		String result = "";
		for(int i = 0; i < numRows; i++) {
			for(int j = 0; j < numCols; j++) {
				result = result + cells[i][j].getValue() + '\t';
			}
			result += '\n';
		}
		return result;
	}

}
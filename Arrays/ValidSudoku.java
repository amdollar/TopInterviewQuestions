package io.test.Arrays;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

	public static void main(String[] args) {
		char[][] sudoku = new char[][] { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '8', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		System.out.println(isValidSudoku(sudoku));
	}

	private static boolean isValidSudoku(char[][] sudoku) {
		Set<String> data = new HashSet<String>();

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				char number = sudoku[i][j];
				if (number != '.') {
					if (!data.add(number + "Found in row" + i) || !data.add(number + "Found in col" + j)
							|| !data.add(number + "Found in subbox" + i / 3 + "-" + j / 3)) {
						return false;
					}
				}
			}
		}

		return true;
	}

}

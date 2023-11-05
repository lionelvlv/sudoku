import java.util.Random;

/*
* Author: Lionel
* Date: 11/4/2023
*
 */
public class Board {
    /*
     * Cells are objects that store the integers used for the board.
     */
    private static class Cell {
        private final int value;
        private boolean isFixed;

        /**
         * Constructor for Cell class. Initializes a cell with a
         * starting value and isUsed is set to false.
         *
         * @param n                             The Integer value of the cell.
         * @throws IllegalArgumentException()   Throws error if n < 1 or n > 9
         */
        public Cell(int n) {
            if (n < 1 || n > 9) {
                throw new IllegalArgumentException();
            }
            value = n;
            isFixed = false;
        }

        /**
         * @return value
         * Gets the Integer value of the Cell
         */
        public int getValue() { return value; }

        /**
         * Sets the Cell's fixed state.
         * If already used, does nothing.
         * If a Cell is fixed, it's in its rightful place.
         */
        public void setFixed() { isFixed = true;}

        public boolean isFixed() { return isFixed; }

    }

    private Cell[][] cells;
    private Random random;
    public Board() {
        cells = new Cell[9][9];
        random = new Random();
        generateBoard();
        beginPuzzle();
    }

    /**
     * Rules for Sudoku Generation
     * 1. No repeating numbers in each grid
     * 2. No repeating numbers in each row or column
     * 3. Each grid should have integers 1-9
     * 4. Each row or column should have integers 1-9
     * 5. Should be random each time
     */

    public boolean isValid() {
        return false;
    }

    private boolean isValidColumn(int col) {
        return false;
    }

    private boolean isValidRow(int row) {
        return false;
    }

    /**
     * Generates the 9x9 board full of Integers
     */
    private void generateBoard() {
        // for every grid in the board
        for (Cell[] grid: cells) {
            // for every cell in the grid
            for (Cell cell: grid) {
                // do something
            }
        }

    }

    /**
     * Uses the existing board and deletes numbers, while maintaining
     * a solvable Sudoku grid.
     */
    private void beginPuzzle() {

    }
}

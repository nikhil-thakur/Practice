package algorithms.DiagonalTraverse;

public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        int row = 0;
        int col = 0;
        boolean upwards = true;
        int rowsLength = matrix.length;
        int columnsLength = matrix[0].length;
        int[] returnArray = new int[rowsLength * columnsLength];
        //going up -> row decreases, column increases
        //going down -> rown increases, column decreases

        returnArray[0] = matrix[0][0];

        for (int index = 1; index < matrix.length; index++) {
            if (upwards) {
                row--;
                col++;
                if (row < 0) {
                    row++;
                    upwards = false;
                }

                if (col > columnsLength) {
                    row = row + 2;
                    col--;
                    upwards = false;
                }

                returnArray[index] = matrix[row][col];
            } else {
                row++;
                col--;
                System.out.println("row 1:" + row + "col" + col);
                if (col < 0) {
                    System.out.println("row 2:" + row + "col" + col);
                    col++;
                    upwards = true;
                    System.out.println("row:" + row + "col" + col);
                }

                if (row > rowsLength) {
                    col = col + 2;
                    row++;
                }

                returnArray[index] = matrix[row][col];
            }
        }
        return returnArray;
    }
}

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean flag = false;
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    flag = true;
                    int index = i - 1;
                    while (index >= 0) {
                        if (matrix[index][j] != 0) {
                            matrix[index][j] = -1;
                        }
                        index -= 1;
                    }
                    index = i + 1;
                    while (index < row) {
                        if (matrix[index][j] != 0) {
                            matrix[index][j] = -1;
                        }
                        index += 1;
                    }
                    index = j - 1;
                    while (index >= 0) {
                        if (matrix[i][index] != 0) {
                            matrix[i][index] = -1;
                        }
                        index -= 1;
                    }
                    index = j + 1;
                    while (index < col) {
                        if (matrix[i][index] != 0) {
                            matrix[i][index] = -1;
                        }
                        index += 1;
                    }
                }
            }
        }
        if (flag == true) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (matrix[i][j] == -1) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }
}
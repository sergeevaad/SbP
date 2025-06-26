package org.example;

public class Matrix {
    private double[][] matrix;
    private int row;
    private int col;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        this.matrix = new double[row][col];
    }

    public void setValue(int i, int j, int value) {
        this.matrix[i][j] = value;
    }

    public static void print(Matrix m) {
        if (m==null){
            return;
        }else {
            for (int i = 0; i < m.row; i++) {
                for (int j = 0; j < m.col; j++) {
                    System.out.print(m.matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public Matrix sum(Matrix sumM) {

        if (this.row != sumM.row || this.col != sumM.col) {
            System.out.println("Матрицы должны быть одинакового размера!");
            return null;
        } else {
            Matrix res = new Matrix(row, col);
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    res.matrix[i][j] = this.matrix[i][j] + sumM.matrix[i][j];
                }
            }
            return res;
        }
    }

    public Matrix multNum(double n) {

        Matrix res = new Matrix(row, col);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res.matrix[i][j] = this.matrix[i][j] * n;
            }
        }
        return res;
    }

    public Matrix multMat(Matrix multM) {
        if (this.col != multM.row) {
            System.out.println("Эти матрицы нельзя перемножить");
            return null;
        } else {
            Matrix res = new Matrix(this.row, multM.col);
            for (int i = 0; i < this.row; i++) {
                for (int j = 0; j < multM.col; j++) {
                    for (int l = 0; l < col; l++) {
                        res.matrix[i][j] += this.matrix[i][l] * multM.matrix[l][j];
                    }
                }
            }
            return res;
        }
    }

}

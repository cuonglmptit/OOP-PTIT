/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j04016_tich_hai_doi_tuong_ma_tran;

import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Matrix {

    private int row, col;
    private int[][] mt = null;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        this.mt = new int[row][col];
    }

    public void nextMatrix(Scanner sc) {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                mt[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix mul(Matrix b) {
        Matrix tmp = new Matrix(this.row, b.col);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < b.col; j++) {
                tmp.mt[i][j] = 0;
                for (int k = 0; k < this.col; k++) {
                    tmp.mt[i][j] += this.mt[i][k] * b.mt[k][j];
                }
            }
        }
        return tmp;
    }

    @Override
    public String toString() {
        String rs = "";
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                rs += mt[i][j];
                if (j < col - 1) rs += " ";
            }
            if (i < row - 1) rs += "\n";
        }
        return rs;
    }

}

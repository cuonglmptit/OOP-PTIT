/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxepmatran;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class SapXepMaTran {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = Integer.parseInt(sc.next());
        while(t-- > 0){
            int n = Integer.parseInt(sc.next()), m = Integer.parseInt(sc.next()), index = Integer.parseInt(sc.next());
            int[][] a = new int[n][m];
            ArrayList<Integer> col = new ArrayList<>();
            for(int i = 0; i < n; i++){
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(sc.next());
                    if(j == index-1) col.add(a[i][j]);
                }
            }
            Collections.sort(col);
            for (int i = 0; i < n; i++) {
                a[i][index-1] = col.get(i);
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }        
}

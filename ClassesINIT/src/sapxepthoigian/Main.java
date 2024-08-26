/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxepthoigian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Time> arl = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            Time tmp = new Time(sc.nextLine());
            arl.add(tmp);
        }
        Collections.sort(arl);
        for(Time i : arl){
            System.out.println(i);
        }
    }
}

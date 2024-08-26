/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trenhatgianhat;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Person> arl = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Person tmp = new Person(sc.next(), sc.next());
            arl.add(tmp);
        }
        Collections.sort(arl);
        System.out.println(arl.get(0));
        System.out.println(arl.get(arl.size()-1));
    }
}

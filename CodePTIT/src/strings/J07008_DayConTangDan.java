/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author cle13
 */
public class J07008_DayConTangDan {
    private static int[] x = new int[25];
    private static int[] a = new int[25];
    private static int n;
    private static Vector<Integer> v = new Vector<>();
    private static SortedSet<String> st = new TreeSet<>(); 
    private static boolean check(){
	if(v.size() < 2) return false;
	for(int i = 0; i < v.size()-1; i++)
            if(v.get(i) > v.get(i+1)) return false;
	return true;
    }
    private static void ok(){
	v.clear();
	for(int i = 0; i < n; i++){
		if(x[i] == 1) v.add(a[i]);
	}
	if(check()){
		String s = "";
		for(int i = 0; i < v.size(); i++)
			s += v.get(i) + " ";
		st.add(s);
	}			
    }
    private static void Try(int i){
	for(int j=0;j<=1;++j){
		x[i]=j;
		if(i == n-1) ok();
		else Try(i+1);
	}
	return;
    }
    private static void out(){
	for(String i : st){
            System.out.println(i);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = sc.nextInt();
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        Try(0);
        out();
    }
}

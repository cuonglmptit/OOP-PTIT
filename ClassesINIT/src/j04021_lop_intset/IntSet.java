/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j04021_lop_intset;

import java.util.*;

/**
 *
 * @author cle13
 */
public class IntSet {
    private Set<Integer> iSet = new TreeSet<>();
    public IntSet(Set<Integer> set){
        this.iSet = set;
    }
    public IntSet(int[] a) {
        for (int i = 0; i < a.length; i++) {
            this.iSet.add(a[i]);
        }
    }
    public IntSet union(IntSet s2){
        Set<Integer> set = new TreeSet<>();
        for (Integer i : this.iSet) {
            set.add(i);
        }
        for (Integer i : s2.iSet) {
            set.add(i);
        }
        IntSet tmp = new IntSet(set);
        return tmp;
    }
    @Override
    public String toString(){
        String s = "";
        for (Integer i : iSet) {
            s += i + " ";
        }
        return s.substring(0, s.length()-1);
    }
}

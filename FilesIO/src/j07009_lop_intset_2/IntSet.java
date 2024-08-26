/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07009_lop_intset_2;

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
    public IntSet(){
        
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
    public IntSet intersection(IntSet s2) {
        ArrayList<Integer> a1 = new ArrayList<>(this.iSet);
        ArrayList<Integer> a2 = new ArrayList<>(s2.iSet);
        a1.retainAll(a2);
        Set<Integer> tmp = new TreeSet<>(a1);
        IntSet tmp1 = new IntSet(tmp);
        return tmp1;
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

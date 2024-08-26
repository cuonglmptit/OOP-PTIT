/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trenhatgianhat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author cle13
 */
public class Person implements Comparable<Person>{
    private String name;
    private Date birth;

    public Person(String name, String birth) throws ParseException {
        this.name = name;
        this.birth = new SimpleDateFormat("dd/MM/yyyy").parse(birth);
    }

    @Override
    public int compareTo(Person o) {
        return -this.birth.compareTo(o.birth);
    }
    @Override
    public String toString(){
        return this.name;
    }
}

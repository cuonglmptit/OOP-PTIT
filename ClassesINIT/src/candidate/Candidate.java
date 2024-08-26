/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package candidate;
/**
 *
 * @author cle13
 * Candidate = thí sinh
 */
public class Candidate {
    private String name = "";
    private String birth = "";
    float mark1, mark2, mark3;
    Candidate(){
        
    }
    Candidate(String name, String birth, float mark1, float mark2, float mark3){
        this.name = name;
        this.birth = birth;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    float SumMark(){
        return mark1+mark2+mark3;
    }
    void Print(){
        System.out.printf("%s %s %.1f", name, birth, SumMark());
    }
}

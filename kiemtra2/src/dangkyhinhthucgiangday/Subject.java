/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dangkyhinhthucgiangday;

public class Subject implements Comparable<Subject>{
    private String sID, name, theoryForm, practiceForm;
    private int credits;
    public Subject(String sID, String name, int credits, String theoryForm, String praticeForm){
        this.sID = sID;
        this.name = name;
        this.credits = credits;
        this.theoryForm = theoryForm;
        this.practiceForm = praticeForm;
    }

    public boolean isOnlinePractice(){
        return this.practiceForm.equals("Truc tiep") == false;
    }
    
    @Override
    public int compareTo(Subject o) {
        return this.sID.compareTo(o.sID);
    }

    @Override
    public String toString(){
        return this.sID+" "+this.name+" "+this.credits+" "+this.theoryForm+" "+this.practiceForm;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lietkesinhvientheonganh;

/**
 *
 * @author cle13
 */
public class Student {
    private String sID, name, sClass, email, nganh;

    public Student(String sID, String name, String sClass, String email) {
        this.sID = sID;
        this.name = name;
        this.sClass = sClass;
        this.email = email;
        this.nganh = this.sID.substring(3, 7);
    }
    public boolean checkNganh(String s){
        if(this.sClass.startsWith("E") && this.nganh.equals("DCCN")) return false;
        if(this.sClass.startsWith("E") && this.nganh.equals("DCAT")) return false;
        return majorAcronym(s).equals(this.nganh);
    }
    private String majorAcronym(String major){
        switch (major) {
            case "KE TOAN":
                return "DCKT";
            case "CONG NGHE THONG TIN":
                return "DCCN";        
            case "AN TOAN THONG TIN":
                return "DCAT";
            case "VIEN THONG":
                return "DCVT";
            default:
                return "DCDT";
        }
    }
    @Override
    public String toString(){
        return this.sID+" "+this.name+" "+this.sClass+" "+this.email;
    }
}

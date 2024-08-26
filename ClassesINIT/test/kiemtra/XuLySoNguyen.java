/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra;

/**
 *
 * @author cle13
 */
public class XuLySoNguyen {
    private long n;
    public XuLySoNguyen() {
    }
    
    public XuLySoNguyen(long n) {
        this.n = n;
    }
    
    public String chiaHetCho6(){
        String s = "";
        for(int i = 0; i <= this.n; i++) if(i%6 == 0) s+=i+" ";
        return s;
    }
    
    private void printPermutn(String str, String ans)
    {
        if (str.length() == 0) {
            System.out.println(ans + " ");
            return;
        }
 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) +
                        str.substring(i + 1);
            printPermutn(ros, ans + ch);
        }
    }
    
    public void hoanVi(){
        String s = Long.toString(this.n);
        printPermutn(s, "");
    }
}

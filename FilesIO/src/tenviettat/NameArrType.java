/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tenviettat;

/**
 *
 * @author cle13
 */
public class NameArrType implements Comparable<NameArrType>{
    private String[] arrName;
    private String name;
    public NameArrType(String s){
        this.arrName = s.split(" ");
        this.name = s;
    }
    //IDEA: tách dấu hiệu viết tắt bằng split(".") vào mảng String[] rồi kiểm tra length của mảng có bằng với mảng tên ko?
    // nếu bằng thì kiểm tra từng chữ bắt đầu của cái từ viết tắt không phải*, nếu thỏa mãn hết thì return về true else false
    //VD: Le Manh Cuong => se thỏa mãn L = L, M = M, * thì không cần xét
    public boolean isPossibleThisAcronym(String acr){//String acr VD: *.M.C || L.M.*
        String[] tmp = acr.split("\\.");
        if(tmp.length != (this.arrName).length) return false;// điều kiện có số lượng từ bằng nhau ko, nếu bằng nhau thì sẽ tiếp cho vòng for
        // lúc này thì lenght bằng nhau nên cho chạy đến length nào cũng đc
        for(int i = 0; i < tmp.length; i++){
            if(this.arrName[i].charAt(0) != tmp[i].charAt(0) && tmp[i].charAt(0) != '*') return false;
            //nếu không phải * mà lại còn khác => tên không thể viết tắt như vậy => return false
        }
        return true;//qua hết thì là ok rồi, return true
    }
    @Override
    public String toString(){
        return this.name;
    }

    @Override
    public int compareTo(NameArrType o) {
        String[] tmp1 = this.name.split(" ");
        String[] tmp2 = o.name.split(" ");
        String n1 = tmp1[tmp1.length-1] + tmp1[0], n2 = tmp2[tmp2.length-1] + tmp1[0];
        return n1.compareTo(n2);
    }
}

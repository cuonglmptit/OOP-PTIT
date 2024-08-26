/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lichgiangdaytheogiangvien;

/**
 *
 * @author cle13
 */
public class MonHoc {
    private String mID, tenMH, soTinChi;
 
    public MonHoc(String mID, String tenMH, String soTinChi) {
        this.mID = mID;
        this.tenMH = tenMH;
        this.soTinChi = soTinChi;
    }

    public String getTenMH() {
        return tenMH;
    }

    public String getmID() {
        return mID;
    }
    
}

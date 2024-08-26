package thutapcoso;


import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DarkShadowDemon200x
 */
public class DeTai {
    private static Map<String, String> mapTen = new HashMap<>();
    private static Map<String, String> mapDT = new HashMap<>();
    private String maDeTai;

    public DeTai(int i, String tenGV, String tenDT) {
        this.maDeTai = "DT"+String.format("%03d", i);
        DeTai.mapTen.put(this.maDeTai, tenGV);
        DeTai.mapDT.put(this.maDeTai, tenDT);
    }

    public static Map<String, String> getMapTen() {
        return mapTen;
    }

    public static Map<String, String> getMapDT() {
        return mapDT;
    }

    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class ChuanHoaHoTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int type = Integer.parseInt(sc.nextLine());
            String pre_name = sc.nextLine();
            pre_name = pre_name.trim().toLowerCase();
            pre_name = pre_name.replaceAll("\\s+", " ");
            String[] fixing_name = pre_name.split(" ");
            String name = "";
            if(type == 1){
                name += String.valueOf(fixing_name[fixing_name.length-1].charAt(0)).toUpperCase() + fixing_name[fixing_name.length-1].substring(1)+" ";
                for(int i = 0; i < fixing_name.length-1; i++){
                    name += String.valueOf(fixing_name[i].charAt(0)).toUpperCase() + fixing_name[i].substring(1);
                    if(i<fixing_name.length-2) 
                       name+=" ";
                }
            }
            if(type == 2){
                for(int i = 1; i < fixing_name.length; i++){
                    name += String.valueOf(fixing_name[i].charAt(0)).toUpperCase() + fixing_name[i].substring(1) + " ";
                }
                name += String.valueOf(fixing_name[0].charAt(0)).toUpperCase() + fixing_name[0].substring(1);
            }
            System.out.println(name);
        }
    }
}

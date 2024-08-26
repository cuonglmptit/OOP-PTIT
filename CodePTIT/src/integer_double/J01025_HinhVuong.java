/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integer_double;

import java.util.Scanner;

/**
 *
 * @author cle13
 * Cho 2 hình chữ nhật trên mặt phẳng Oxy. 
 * Cần tìm hình vuông có kích thước nhỏ nhất sao cho phủ kín được 2 hình chữ nhật đã cho.
Input:

2 dòng, mỗi dòng gồm 4 số nguyên lần lượt mô tả điểm trái dưới và phải trên của hình chữ nhật. 
Các tọa độ có giá trị tuyệt đối không vượt quá 1000.
Output: 
In ra diện tích của hình vuông tìm được.
Ví dụ:
Input
6 6 8 8
1 8 4 9
Output
49
* idea: vì là hình vuông nên là sẽ tìm max của 2 giá trị sau:
* + hoành độ của 2 hình chữ nhật trừ cho nhau'
* + tung độ của 2 hình chữ nhật trừ cho nhau
* cái nào lớn hơn thì sẽ là cạnh của hình vuông thì nó sẽ bao kín được
 */
public class J01025_HinhVuong {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int rec1[] = new int[4];
        int rec2[] = new int[4];
        for(int i = 0; i <4; i++) rec1[i] = sc.nextInt();
        for(int i = 0; i <4; i++) rec2[i] = sc.nextInt();
        int minxrec = rec1[0];
        int maxxrec = rec1[0];
        int minyrec = rec1[1];
        int maxyrec = rec1[1];
        for(int i=0;i<4;i++){
            if(i%2==0){
                if(minxrec < rec1[i])minxrec = rec1[i];
                if(minxrec < rec2[i])minxrec = rec2[i];
                if(maxxrec > rec1[i])maxxrec = rec1[i];
                if(maxxrec > rec2[i])maxxrec = rec2[i];
            }else{
                if(minyrec < rec1[i])minyrec = rec1[i];
                if(minyrec < rec2[i])minyrec = rec2[i];
                if(maxyrec > rec1[i])maxyrec = rec1[i];
                if(maxyrec > rec2[i])maxyrec = rec2[i];
            }
        }
        int a = Math.abs(maxxrec - minxrec);
        int b = Math.abs(maxyrec - minyrec);
        if(a > b) System.out.print(a*a);
        else System.out.print(b*b);
    }
    
}

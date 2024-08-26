/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DarkShadowDemon200x
 */
public class J08028_Hinh_Chu_Nhat_Don_Sac {

    /*IDEA: với mỗi phần tử x thì tính diện tích của hình chữ nhật với x là chiều rộng ngắn nhất(coi x là min chiều ngang)
    để làm đc vậy thì cần biết phần tử bên trái đầu tiên nhỏ hơn và phần tử bên phải đầu tiên nhỏ hơn hay mà dùng chỉ số
    thay so số;
    muốn vậy thì dùng stack như bài phần tử bên phải đầu tiên nhỏ hơn thôi =))
    làm vậy với các chỉ số bên trên(mảng bên trên) và tiếp tục với mảng dưới sẽ có các phần tử là (m-x)
    => time complexity là O(2n) thì coi là O(n)
     */
    public static long maxArea(long[] ds, int n) {
        long max_area = 0;
        long[] firstMinRight = new long[n];
        long[] firstMinLeft = new long[n];
        Stack<Integer> st = new Stack<>();
        //tìm phần tử đầu tiên bên phải nhỏ hơn
        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && ds[i] <= ds[st.peek()]) {
                st.pop();
            }
            if (st.empty()) {
                firstMinRight[i] = n;//nếu ko có thì sẽ cho là n, chính là độ dài của array
            } else {
                firstMinRight[i] = st.peek();
            }
            st.push(i);
        }
        //tìm phần tử đầu tiên bên trái nhỏ hơn
        st.clear();
        for (int i = 0; i < n; i++) {
            while (!st.empty() && ds[i] <= ds[st.peek()]) {
                st.pop();
            }
            if (st.empty()) {
                firstMinLeft[i] = -1;//nếu ko có thì sẽ cho là -1
            } else {
                firstMinLeft[i] = st.peek();
            }
            st.push(i);
        }
        //có 2 mảng rồi thì tính thôi
        for (int i = 0; i < n; i++) {
            long area_x = (firstMinRight[i] - firstMinLeft[i] - 1) * ds[i];
            max_area = Math.max(area_x, max_area);
        }
        return max_area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        long[] ds = new long[n];
        for (int i = 0; i < n; i++) {
            ds[i] = sc.nextLong();
        }
        long maxAreaUp = maxArea(ds, n);
        for (int i = 0; i < n; i++) {
            ds[i] = m - ds[i];
        }
        long maxAreaDown = maxArea(ds, n);
        System.out.println(Math.max(maxAreaUp, maxAreaDown));
    }
}

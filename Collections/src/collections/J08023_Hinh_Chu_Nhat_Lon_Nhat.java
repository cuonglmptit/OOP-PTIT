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
public class J08023_Hinh_Chu_Nhat_Lon_Nhat {

    /*IDEA: với mỗi phần tử x thì tính diện tích của hình chữ nhật với x là chiều rộng ngắn nhất(coi x là min chiều ngang)
    để làm đc vậy thì cần biết phần tử bên trái đầu tiên nhỏ hơn và phần tử bên phải đầu tiên nhỏ hơn hay mà dùng chỉ số
    thay so số;
    muốn vậy thì dùng stack như bài phần tử bên phải đầu tiên nhỏ hơn thôi =))
    làm vậy với các chỉ số bên trên(mảng bên trên)
     */
    public static long maxArea(ArrayList<Integer> ds) {
        long max_area = 0;
        int n = ds.size();
        long[] firstMinRight = new long[n];
        long[] firstMinLeft = new long[n];
        Stack<Integer> st = new Stack<>();
        //tìm phần tử đầu tiên bên phải nhỏ hơn
        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && ds.get(i) <= ds.get(st.peek())) {
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
            while (!st.empty() && ds.get(i) <= ds.get(st.peek())) {
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
            long area_x = (firstMinRight[i] - firstMinLeft[i] - 1) * ds.get(i);
            max_area = Math.max(area_x, max_area);
        }
        return max_area;
    }
    /*cách trên geeksforgeeks
    static long getMaxArea(long hist[], int n) {
        // Create an empty stack. The stack holds indexes of
        // hist[] array The bars stored in stack are always
        // in increasing order of their heights.
        Stack<Integer> s = new Stack<>();

        long max_area = 0; // Initialize max area
        int tp; // To store top of stack
        long area_with_top; // To store area with top bar as
        // the smallest bar

        // Run through all bars of given histogram
        int i = 0;
        while (i < n) {
            // If this bar is higher than the bar on top
            // stack, push it to stack
            if (s.empty() || hist[s.peek()] <= hist[i]) {
                s.push(i++);
            } // If this bar is lower than top of stack, then
            // calculate area of rectangle with stack top as
            // the smallest (or minimum height) bar. 'i' is
            // 'right index' for the top and element before
            // top in stack is 'left index'
            else {
                tp = s.peek(); // store the top index
                s.pop(); // pop the top

                // Calculate the area with hist[tp] stack as
                // smallest bar
                area_with_top
                        = hist[tp]
                        * (s.empty() ? i : i - s.peek() - 1);

                // update max area, if needed
                if (max_area < area_with_top) {
                    max_area = area_with_top;
                }
            }
        }

        // Now pop the remaining bars from stack and
        // calculate area with every popped bar as the
        // smallest bar
        while (s.empty() == false) {
            tp = s.peek();
            s.pop();
            area_with_top = hist[tp] * (s.empty() ? i : i - s.peek() - 1);
            if (max_area < area_with_top) {
                max_area = area_with_top;
            }
        }

        return max_area;
    }
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
//            long[] ds = new long[n];
            ArrayList<Integer> ds = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                ds.add(sc.nextInt());
            }
            System.out.println(maxArea(ds));
        }
    }
}

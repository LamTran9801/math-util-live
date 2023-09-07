/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hust.mathutil;

/**
 *
 * @author Admin
 */
//ta viết cái class để cung cấp tiện ích cho nơi khác xài
//khi ta cung cấp tiện ích cho nới khác xài, đó là lúc ta ko cần nhớ cái gì cho riêng ta
//hàm static giúp ta làm điều này
public class MathUtil {
    //20! là vừa khớp kiểu long, kiểu long tối đa 18 số 0
    //nếu đưa vào âm, 21 gia thừa ta không tính ta đập vào mặt ai xài hàm
    //một cái ngoại lệ, chửi éo tính được
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid argument, n must be between 0 and 20");
        
        if (n == 0 || n == 1)
            return 1;
        
        //chơi for hoặc đệ quy - recursion
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}

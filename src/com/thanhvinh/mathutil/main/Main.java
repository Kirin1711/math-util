/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanhvinh.mathutil.main;

import com.thanhvinh.mathutil.core.MathUtil;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        //thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế hay không
        //ta phải đưa ra các tình huống sử dụng hàm trong thực tế
        //VD: -5 coi tính đc không 
        //     0 coi tính ra mấy
        //    20 coi tính ra mấy 
        //    21 coi tính ra mấy 
        
        long expected = 120; //kì vọng hàm đưa ra 120 nếu tính 5!
        int n = 5;           //input
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = "+expected +" (expected)");
        System.out.println("5! = "+actual + " (actual)");
    }
}

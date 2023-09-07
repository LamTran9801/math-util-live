/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.hust.mathutil;

/**
 *
 * @author Admin
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long result = MathUtil.getFactorial(6);
        System.out.println("5! = " + result);
        
        //thêm code sau lần đầu tiên up code lên server 7/9/2023
        System.out.println("expected: 1! = 1; actual: " + MathUtil.getFactorial(1));
    }
    
}

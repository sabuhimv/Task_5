/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task_5;

/**
 *
 * @author SebuhiMv
 */
public class Task_5 {

    public static void main(String[] args) {
        int a = 1024;
        int net = 0;
        while(a>0){
            a/=2;
            net++;
        }
        System.out.println(net-1);
    }
}

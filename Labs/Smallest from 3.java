/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication40;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class JavaApplication40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input= new Scanner(System.in);
        int smallest=0;
        int num1= input.nextInt();
        int num2= input.nextInt();
        int num3= input.nextInt();
        
        check(num1,num2,num3);
        System.out.println(smallest);
        
       
    }
    public static int check(int num1, int num2, int num3) {
    int a=0;
    int smallest=0;
    a= Math.min(num1,num2);
    smallest= Math.min(a,num3);
       return smallest;
}
    }
    


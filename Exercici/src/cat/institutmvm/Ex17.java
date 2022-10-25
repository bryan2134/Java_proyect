/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

public class Ex17 {
//Pre: 
    private static final String MSG_1 = "Introduce un numero natural : ";
    private static final String MSG_2 = "El primer valor es multiple del segundo valor";
    private static final String MSG_3 = "El primer valor no es multiple del segundo valor";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, num1;
        do { //valida que el primer numero introducido es natural
            System.out.println(MSG_1);
            num = sc.nextInt();
        } while (num < 1);
        do { //valida que el segundo numero introducido es natural
            System.out.println(MSG_1);
            num1 = sc.nextInt();
        } while ((num1 < 1)&&(num1==0));
        if (num % num1 == 0) {
            System.out.println(MSG_2);
        } else {
            System.out.println(MSG_3);
        }

    }
}
//Post: Regresa si el primer valor es multiple del segundo valor 
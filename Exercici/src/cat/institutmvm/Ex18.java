/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class Ex18 {

    private static final String MSG_1 = "El valor absoluto es : ";
    private static final String MSG_2 = "Introduce un numero : ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println(MSG_2);
        num = sc.nextInt();
        if (num > 0) {
            System.out.println(MSG_1 + num);
        } else {
            System.out.println(MSG_1 + num * (-1));
        }

    }

}

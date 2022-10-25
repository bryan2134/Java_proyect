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
public class Ex12b {
    private static final String MSG_1 = "El doble del numero introducido es ";
    private static final String MSG_2 = "El triple del numero es ";
    public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in);
       System.out.println("Introduce un numero :");
       int num = sc.nextInt();
       System.out.println(MSG_1 + num * 2);
       System.out.println(MSG_2 + num * 3);
    }
}

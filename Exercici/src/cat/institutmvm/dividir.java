/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;

public class dividir {
    private static final String MSG_1= "Introduce un numero : ";
    private static final String MSG_2= "Introduce otro numero : ";
    private static final String MSG_3= "La division de los dos numeros es : ";
    //Pre: Introduce dos numeros 
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num1, num2;
    System.out.println(MSG_1);
    num1 = sc.nextInt();
    System.out.println(MSG_2);
    num2 = sc.nextInt();
    System.out.println(MSG_3 + num1/num2);
    //Post: Da la division de los dos numeros  
    }
}
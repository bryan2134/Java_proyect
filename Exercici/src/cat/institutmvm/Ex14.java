/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;

public class Ex14 {
    private static final String MSG_1 = "El numero introducido es : ";
    
    public static void main(String[] args){
    int num;
    Scanner sc = new Scanner(System.in);
    do{
       System.out.println("Introduce un numero entre el 0 y el 10 : ");
       num = sc.nextInt();
    }while((num<0)||(num>10)); // Condicion si el numero es menor que 0 o mayor que 10
    System.out.println(MSG_1 + num);
    }
}

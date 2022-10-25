/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;

public class Ex20 {
    private static final String MSG_1 ="Introduce un número : ";
    private static final String MSG_2 ="Si desea terminar introdce un 0 : ";
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        double  num;
         do{
             System.out.println(MSG_1);
             num = sc.nextDouble();
             System.out.println("El producto es: " + num*1/2.2);
             System.out.println(MSG_2);
             i = sc.nextInt();
         }while(i != 0);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;

//
public class Ex12c {
    private static final String MSG_1 = "Introduce un numero : ";
    private static final String MSG_2 = "Introduce el segundo nùmero : ";
    private static final String MSG_3 = "Introduce el tercer nùmero : ";
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        int num = sc.nextInt();
        System.out.println(MSG_2);
        int num2 = sc.nextInt();
        System.out.println(MSG_3);
        int num3 = sc.nextInt();
        if(num + num2 > num3) {
            System.out.println("La suma de los dos primeros numeros, es mayor que el tercero");
        }
        else{
            System.out.println("El tercer numero es mayor");
        }
    
    }
    
}

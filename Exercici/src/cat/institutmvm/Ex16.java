/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;
        
public class Ex16 {
    private static final String MSG_1 = "Escribe un numero natural : ";
    private static final String MSG_2 = "El numero natural es : ";
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, count=0;
        
        num = sc.nextInt();
        do{
            System.out.println(MSG_1);
            num = sc.nextInt();
            count++;
        }while((num<1)&&(count<3));
    } 
    
}

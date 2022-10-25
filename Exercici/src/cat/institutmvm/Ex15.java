/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;

public class Ex15 {
    private static final String MSG_1 = "Escribe un numero natural : ";
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num, i=0;
    do{
        System.out.println(MSG_1);
        num = sc.nextInt();
        i++;
    }while( num < 1);
        
    }
}

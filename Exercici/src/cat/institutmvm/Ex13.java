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
public class Ex13 {
    private static final String MSG_1 = "La media de los 5 numeros naturales es : ";
    
    public static void main(String[] args){
    int num, sum=0, i=0;
    Scanner sc = new Scanner(System.in);
    do{
        System.out.println("Introduce un numero natural : ");
        num = sc.nextInt();
        i++;
    }while(num < 1);
    for(i=0; i< 5; i++){
        System.out.println("Introduce la nota del examen : " );
        num = sc.nextInt();
        sum = sum + num;
        }
    System.out.println(MSG_1 + sum/5);
    }
    
}

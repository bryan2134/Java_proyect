/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;

public class Ex19 {
    private static final String MSG_1 = "El total de los números pares es : ";
    private static final String MSG_2 = "El total de los números impares es : ";
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, totalpar=0, totalimpar=0, i;
        for(i=0; i< 20; i++){
            System.out.println("Ingresa un número : ");
            num = sc.nextInt();
            if(num%2==0){
                totalpar = totalpar+1;
            }else{
                totalimpar= totalimpar+1;
            }
        
        }
        System.out.println(MSG_1 + totalpar);
        System.out.println(MSG_2 + totalimpar);
    }
    
    
}

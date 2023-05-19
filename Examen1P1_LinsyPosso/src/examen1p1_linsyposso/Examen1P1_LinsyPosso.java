/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_linsyposso;
import java.util.Scanner;
/**
 *
 * @author LINSY POSSO
 */
public class Examen1P1_LinsyPosso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner (System.in);
        System.out.println("Ingrese una opcion: \n1.Sumador Binario\n2.Estrella de David\n3.Salir ");
        String opcion = Leer.nextLine();
        switch (opcion){
            case "1":
                System.out.println("Ingrese la primera cadena: ");
                String cadena1 = Leer.nextLine();
                System.out.println("Ingrese la segunda cadena: ");
                String cadena2 = Leer.nextLine();
                if (cadena1.length()!=cadena2.length()){
                }
                else{
                    System.out.println("Las cadenas tienen que ser iguales");
                }//Valida el tamaño de la cadena
                boolean igual = true;
                for (int i = 0; i < cadena1.length(); i++) {
                    char dig1 = cadena1.charAt(i);
                    if (dig1 != '0' && dig1 !='1'){
                        igual = false;
                    }
                    if (igual){
                    }else{ 
                        System.out.println("Solo puede ingresar 1 y 0");
                    }
                    char dig2 = cadena2.charAt(i);
                    if(dig2=='0' && dig2=='1'){
                        igual = true;
                    }else{
                       for (i = cadena1.length(); i>=0;i--){
                    //intento de validacion de numeros :(       
                       }
                }    
                }
                break;
                
            case "2":
                System.out.print("Ingrese un número impar mayor que 9: ");
                int n = Leer.nextInt();
        
        // Validar que la entrada sea mayor que 9 y un número impar
            if (n <= 9 || n % 2 == 0) {
                System.out.println("La entrada no cumple con los requisitos.");
                return;
            }
            break;
            
            case "3":
                 default:
                System.out.println("Byee:)");
    }
    
}
   } 
    
   
        
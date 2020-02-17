/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inverte_nomes;
import java.util.Scanner;
/**
 *
 * @author italo
 */
public class Inverte_Nomes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        // TODO code application logic here
        Scanner console = new Scanner(System.in);
        System.out.println("Digite qualquer nome para podermos inverter /n");
        String Nome = console.nextLine();     
        
        
            String nomeinvertido = "";
            for (int i = Nome.length() - 1; i >= 0; i--)
            {
                nomeinvertido = nomeinvertido + Nome.charAt(i); 

            }
            
            System.out.println(nomeinvertido);
            
        
        
        
        
    }
    
}

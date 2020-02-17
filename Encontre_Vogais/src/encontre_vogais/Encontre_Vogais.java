/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encontre_vogais;
import java.util.Scanner;

/**
 *
 * @author italo
 */
public class Encontre_Vogais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console = new Scanner(System.in);        
        System.out.println("Type whathever you want");
        String nome = console.nextLine();
        
        System.out.println("The vogals in this word are the following");
        
          for (int i = 0; i < nome.length(); i++)
            {
                if (nome.toUpperCase().charAt(i) == 'A' || nome.toUpperCase().charAt(i) == 'E' || nome.toUpperCase().charAt(i) == 'I' || nome.toUpperCase().charAt(i) == 'O' || nome.toUpperCase().charAt(i) == 'U')
                    System.out.println(nome.charAt(i));
            }
        
        
        
        
        
        
        
    }
    
}

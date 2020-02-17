/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tem_espaco;
import java.util.Scanner;

/**
 *
 * @author italo
 */
public class Tem_espaco {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console = new Scanner(System.in);
        int cont =0;
        System.out.println("Digite qualquer coisa");
        String texto = console.nextLine();
        
        if(texto.contains(" "))
            cont ++;
        
        if(cont> 0)
            System.out.println("O texto digitado tem espaço");
        else
            System.out.println("O texto digitado não tem espaço");
        
        System.out.println("Tchau !");
        
    }
    
}

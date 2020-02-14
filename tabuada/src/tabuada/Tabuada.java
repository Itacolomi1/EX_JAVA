/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabuada;
import java.util.Scanner;
/**
 *
 * @author 082170012
 */
public class Tabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console = new Scanner(System.in);
        System.out.println("Vou lançar a tabuada do 5 \n");
        
        for(int i =0;i<10; i++){
            System.out.println("5 * "+ i + " = "+ 5* i+ "\n");
        }
            
        
        
        
        console.nextLine();
    }
    
}

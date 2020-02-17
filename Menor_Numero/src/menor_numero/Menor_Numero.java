/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menor_numero;
import java.util.Scanner;


/**
 *
 * @author italo
 */


public class Menor_Numero {
    
    public static int Menor_Valor(int[] Numero){
             int menor = Numero[0];
            for(int i =1; i<Numero.length;i++)
            {
                if (Numero[i] < menor)
                    menor = Numero[i];
            }
            return menor;
     }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limite=0;
        
        Scanner console = new Scanner(System.in);
        System.out.println("Vamos descobrir o menor número que você cadastrar /n");
        System.out.println("Quantos números você quer cadastrar");
        limite =  Integer.parseInt(console.nextLine());
        int[] vetor_numero = new int[limite];
        int i = 0;
           do
            {
               System.out.println("digite um número");
                vetor_numero[i] = Integer.parseInt(console.nextLine());
                i++;

            }
            while (i < vetor_numero.length);
           
           System.out.println("O menor número cadastro foi "+ Menor_Valor(vetor_numero));
           console.nextLine();
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icetask1;



/**
 *
 * @author User
 */
public class IceTask1 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        //
         Bird brd = new Bird();
         Reptile rept = new Reptile();
         
         
         System.out.println("Please enter Information on Bird -->");
         System.out.println("----------------------------------------");
                  brd.Input();
         
         System.out.println("\nPlease enter Information on Reptile -->");
         System.out.println("----------------------------------------");
                  rept.Input();
         
         System.out.println("\nBird Information -->");
         System.out.println("----------------------------------------");
                  brd.Output();
                 
         System.out.println("\nReptile Information -->");
         System.out.println("----------------------------------------");
                  rept.Output();
        
    }
    
}

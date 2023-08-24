/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetask1;

import java.util.Scanner;

/**
 *
 * @author User
 */
class Bird extends Animal {
    
    private int colour;
    private String featherColour;

@Override
public void Input() {
        
         super.Input();
         Scanner kb = new Scanner(System.in);
         System.out.print("Enter birds feather colour 1 for grey, 2 for white, 3 for black): ");
                  colour = kb.nextInt();
         
                  if (colour==1)
         {
                           featherColour = " Grey";
         }
         
                  if(colour==2)
         {
                           featherColour = " White";
         }
         
                  if(colour==3)
         {
                           featherColour = " Black";
         }
    
    }

@Override
public void Output() {
        
         super.Output();
         System.out.println("Feather Colour: " + featherColour);
  
}

}

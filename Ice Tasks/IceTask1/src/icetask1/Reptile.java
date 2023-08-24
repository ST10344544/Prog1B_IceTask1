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
class Reptile extends Animal {
   
         private double bloodTemp;

@Override
public void Input() {
  
         super.Input();
         Scanner kb = new Scanner(System.in);
         System.out.print("Enter blood temperature (celcius): ");
                  bloodTemp = kb.nextDouble();
    
}

@Override
public void Output() {
        
         super.Output();
         System.out.println("Blood Temperature : " + bloodTemp);
    
}

}

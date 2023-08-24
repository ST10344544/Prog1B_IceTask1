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
public class Animal {
    
    private int IDtag;
    private String species;

    public void Input() {
         
         Scanner kb = new Scanner(System.in);
         System.out.print("Enter animal IDtag: ");
                  IDtag = kb.nextInt();
         System.out.print("Enter animal species: ");
                  species = kb.next();
    }

    public void Output() {
       
         System.out.println("IDtag: " + IDtag);
         System.out.println("Species: " + species);
    }
    
}

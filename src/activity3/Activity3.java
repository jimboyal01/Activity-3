/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity3;
import java.util.Scanner;
//Allanic,Jimboy Ralph
public class Activity3 {

  
    public static void main(String[] args) {
     double celcius;
     Scanner scan = new Scanner (System.in);
     
        System.out.println("Enter Celcius: ");
        celcius = scan.nextDouble();
        
        double fahrenheit = (celcius*9/5)+32;
        System.out.println("Celcius: " + celcius + " C" + "\n" 
        +"Fahrenheit: " + fahrenheit + " F");
    }
    
}

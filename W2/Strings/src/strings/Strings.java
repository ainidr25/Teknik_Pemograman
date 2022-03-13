/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;
import java.util.Scanner;
/**
* @author Aini
* @version 1.0
* @since 2022-02-10
*/
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // membuat scanner
        Scanner input = new Scanner(System.in);
        
        // deklarasi variabel
        String a, b, output;
        int jumlahString;
        
        // user menginputkan string
        a = input.next();
        b = input.next();
        
        jumlahString = a.length() + b.length();
        System.out.println(jumlahString);
        
        if(a.compareTo(b) > 0){
            System.out.println("Yes");
        }else if(b.compareTo(a) > 0){
            System.out.println("No");
        }else{
            System.out.println("Are Equals");
        }
        
        output = a.substring(0,1).toUpperCase() + a.substring(1) + " " + 
                b.substring(0,1).toUpperCase() + b.substring(1);
        System.out.println(output);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatypes;

import java.util.Scanner;

/**
 *
 * @author ainiii
 */
public class DataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //mendeklarasikan variabel
        int angka;
        boolean valid = false;
        
        //scanner untuk input
        Scanner input= new Scanner(System.in);
        
        //input user
        angka = input.nextInt();
        
        String[] tampungangka = new String [angka];
        for(int i=0; i<angka;i++){
            tampungangka[i] = input.next();
        }
        for(int i=0; i<angka; i++){
            long longMin = -9223372036854775808L;
            long longMax = 9223372036854775807L;
            try{
                long parseLong = Long.parseLong(tampungangka[i]);
                System.out.println(parseLong + " can be fitted in : ");
                if(parseLong >= longMin && parseLong <= longMax){
                    System.out.println("long");
                if(parseLong >= -32768 && parseLong <=32767){
                    System.out.println("short");
                    if(parseLong >= -214783648 && parseLong <= longMax){
                        System.out.println("int");
                    }
                }
                }
            }catch(Exception e){
                System.out.println(tampungangka[i]+ " can’t be fitted anywhere");
            }
        } 
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constants;
/**
* @author Aini
* @version 1.0
* @since 2022-02-10
 */
public class Constants2 {
    public static final double CM_PER_INCH = 2.54;
    public static void main(String[] args) {
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " + paperWidth *CM_PER_INCH + 
                " by " + paperHeight * CM_PER_INCH);
 }
}

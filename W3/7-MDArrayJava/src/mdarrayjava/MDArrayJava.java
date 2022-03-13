package mdarrayjava;
/* @author Aini Diah Rahmawati */
public class MDArrayJava {
    public static void main(String[] args) {
       //One Dimensional Arrays
 int[] fisrtArray = {2, 5, 3};
 int[] secondArray = {9, 5, 3};
 int[] thirdArray = {2, 4, 9};
 int[] fourthArray = {10, 11, 12};
 int[] fifthArray = {13, 14, 15};
 int[] sixthArray = {16, 17, 18};
 int[] seventhArray = {19, 20, 21};
 int[] eighthArray = {22, 23, 24};
 int[] ninthArray = {25, 26, 27};
    //Two Dimensional Arrays
    int[][] twoDimensionalArray1 = {fisrtArray, secondArray,
        thirdArray};
    int[][] twoDimensionalArray2 = {fourthArray, fifthArray,
        sixthArray};
    int[][] twoDimensionalArray3 = {seventhArray, eighthArray,
        ninthArray};
    //Three Dimensional Array
    int[][][] threeDimensionalArray = {twoDimensionalArray1,
        twoDimensionalArray2, twoDimensionalArray3};

    /* {{2 5 3 } {9 5 3 } {2 4 9 } }
    {{10 11 12 } {13 14 15 } {16 17 18 } }
    {{19 20 21 } {22 23 24 } {25 26 27 } }*/
    
    for(int[][] array2D: threeDimensionalArray){
        System.out.print("{");
        for(int[] array1D: array2D){
            System.out.print("{");
            for(int isi: array1D){
                System.out.print(isi+ " ");
            }
            System.out.println("}");
        }
        System.out.print(" }");
        System.out.println();
    }
 }
}
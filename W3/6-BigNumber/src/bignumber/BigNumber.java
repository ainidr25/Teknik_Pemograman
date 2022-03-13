package bignumber;
import java.math.BigInteger;
import java.util.Scanner;
/* @author Aini Diah Rahmawati */
public class BigNumber {
    public static void main(String[] args) {
        BigInteger a,b,sum,multipy;
        
        //membuat scanner
        Scanner scan = new Scanner(System.in);
        
        // user menginputkan
        a = scan.nextBigInteger();
        b = scan.nextBigInteger();
        
        //ALGORITMA
        sum = a.add(b);
        multipy = a.multiply(b);
        System.out.println(sum);
        System.out.println(multipy);
    }
}

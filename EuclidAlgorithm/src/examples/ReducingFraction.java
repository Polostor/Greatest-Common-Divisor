/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import com.tomanek.gcd.EuclidAlgorithm;
import com.tomanek.gcd.GreatestCommonDivisorIface;

/**
 *
 * @author peta
 */
public class ReducingFraction {

    public static void main(String[] args) throws Exception {
        System.out.println("The reduceFraction(60,72) returns " + reduceFraction(60,72) + " .");
        System.out.println("The reduceFraction(40902, -24140) returns " + reduceFraction(40902, -24140) + " .");
        System.out.println("The reduceFraction(-2555, 355) returns " + reduceFraction(-2555, 355) + " .");
    }

    public static String reduceFraction(int divisor, int divider) throws Exception {
        GreatestCommonDivisorIface algorithm = new EuclidAlgorithm();

        int reduction = algorithm.gcd(divisor, divider);
        return createString(divisor, divider, reduction);
    }

    private static String createString(int divisor, int divider, int reduction) {
        StringBuilder sb = new StringBuilder();
        sb.append(divisor / reduction);
        sb.append("/");
        sb.append(divider / reduction);

        return sb.toString();
    }
}

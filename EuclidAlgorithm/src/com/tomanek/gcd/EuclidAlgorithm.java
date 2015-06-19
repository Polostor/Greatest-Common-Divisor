package com.tomanek.gcd;

import static java.lang.Math.abs;

public class EuclidAlgorithm implements GreatestCommonDivisorIface {

    /**
     * Returns a Greatest Common Divisor value of 2 variables.
     *
     * @param x integer variable number 1
     * @param y integer variable number 2
     * @return value of Greatest Common Divisor
     */
    @Override
    public int gcd(int x, int y) throws Exception{
        validate(x, y);
        int i = sign(x, y);
        x = abs(x);
        y = abs(y);
        int gcd = 0;
        if (x >= y) {
            gcd = euclid(x, y);
        } else {
            gcd = euclid(y, x);
        }
        return i * gcd;
    }

    /**
     * Returns a Greatest Common Divisor value of 2 variables using Euclidean
     * algorithm of two positive variables.
     *
     * @param x integer variable number 1
     * @param y integer variable number 2
     * @return value of Greatest Common Divisor
     */
    private int euclid(int x, int y) {
        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
    
    /**
     * Returns a sign of the gcd
     *
     * @param x integer variable number 1
     * @param y integer variable number 2
     * @return integer -1 if both x and y are negative, otherwise 1
     */
    private int sign(int x, int y){
        if (x < 0 && y < 0) {
            return -1;
        }
        return 1;
    }
    

    /**
     * Throws Exception if one variable is zero and the other is not.
     *
     * @param x integer variable number 1
     * @param y integer variable number 2
     */
    private void validate(int x, int y) throws Exception{
        if (x == 0 && y != 0 || x != 0 && y == 0) {
            throw new Exception("Variables are not divisible.");
        }
    }

}

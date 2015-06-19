package com.tomanek.gcd;

import junit.framework.Assert;
import org.junit.Test;

public class TestEuclid {

    @Test(expected = Exception.class)
    public void gcdOfZeroShouldReturnException() throws Exception{

        GreatestCommonDivisorIface gcd = new EuclidAlgorithm();

        gcd.gcd(0, 1);
    }

    @Test(expected = Exception.class)
    public void gcdOfOpositeZeroShouldReturnException() throws Exception{
        GreatestCommonDivisorIface gcd = new EuclidAlgorithm();

        gcd.gcd(1, 0);
    }

    @Test
    public void gcdOfSameShouldReturnSame() throws Exception{
        GreatestCommonDivisorIface gcd = new EuclidAlgorithm();

        Assert.assertEquals(0, gcd.gcd(0, 0));
        int r = (int)(1000 * Math.random());
        Assert.assertEquals(r, gcd.gcd(r, r));
        Assert.assertEquals(r, gcd.gcd(-r, r));
        Assert.assertEquals(r, gcd.gcd(r, -r));
        Assert.assertEquals(-r, gcd.gcd(-r, -r));
    }

    @Test
    public void gcdOfNotSameShouldNotReturnSame() throws Exception{
        GreatestCommonDivisorIface gcd = new EuclidAlgorithm();

        Assert.assertEquals(34, gcd.gcd(40902, 24140));
        Assert.assertEquals(34, gcd.gcd(24140, 40902));
    }

    @Test
    public void gcdOfOneNegativeShouldReturnPositive() throws Exception{
        GreatestCommonDivisorIface gcd = new EuclidAlgorithm();

        Assert.assertEquals(34, gcd.gcd(-40902, 24140));
        Assert.assertEquals(34, gcd.gcd(-24140, 40902));
        Assert.assertEquals(34, gcd.gcd(40902, -24140));
        Assert.assertEquals(34, gcd.gcd(24140, -40902));
    }

    @Test
    public void gcdOfBothNegativeShouldReturnNegative() throws Exception{
        GreatestCommonDivisorIface gcd = new EuclidAlgorithm();

        Assert.assertEquals(-34, gcd.gcd(-40902, -24140));
        Assert.assertEquals(-34, gcd.gcd(-24140, -40902));
    }

}

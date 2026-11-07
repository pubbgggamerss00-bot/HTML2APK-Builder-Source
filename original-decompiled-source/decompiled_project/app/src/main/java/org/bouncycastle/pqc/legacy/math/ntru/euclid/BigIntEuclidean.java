package org.bouncycastle.pqc.legacy.math.ntru.euclid;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class BigIntEuclidean {
    public BigInteger gcd;

    /* renamed from: x, reason: collision with root package name */
    public BigInteger f20539x;

    /* renamed from: y, reason: collision with root package name */
    public BigInteger f20540y;

    private BigIntEuclidean() {
    }

    public static BigIntEuclidean calculate(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = BigInteger.ZERO;
        BigInteger bigInteger4 = bigInteger;
        BigInteger bigInteger5 = bigInteger2;
        BigInteger bigIntegerSubtract = BigInteger.ONE;
        BigInteger bigInteger6 = bigIntegerSubtract;
        BigInteger bigInteger7 = bigInteger3;
        while (!bigInteger5.equals(BigInteger.ZERO)) {
            BigInteger[] bigIntegerArrDivideAndRemainder = bigInteger4.divideAndRemainder(bigInteger5);
            BigInteger bigInteger8 = bigIntegerArrDivideAndRemainder[0];
            BigInteger bigInteger9 = bigIntegerArrDivideAndRemainder[1];
            BigInteger bigIntegerSubtract2 = bigInteger6.subtract(bigInteger8.multiply(bigInteger7));
            bigInteger4 = bigInteger5;
            bigInteger5 = bigInteger9;
            BigInteger bigInteger10 = bigIntegerSubtract;
            bigIntegerSubtract = bigInteger3.subtract(bigInteger8.multiply(bigIntegerSubtract));
            bigInteger3 = bigInteger10;
            bigInteger6 = bigInteger7;
            bigInteger7 = bigIntegerSubtract2;
        }
        BigIntEuclidean bigIntEuclidean = new BigIntEuclidean();
        bigIntEuclidean.f20539x = bigInteger6;
        bigIntEuclidean.f20540y = bigInteger3;
        bigIntEuclidean.gcd = bigInteger4;
        return bigIntEuclidean;
    }
}

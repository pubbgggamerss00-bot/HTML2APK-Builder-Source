package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.params.ElGamalParameters;

/* loaded from: classes2.dex */
public class ElGamalParametersGenerator {
    private int certainty;
    private SecureRandom random;
    private int size;

    public ElGamalParameters generateParameters() throws IllegalArgumentException {
        BigInteger[] bigIntegerArrGenerateSafePrimes = DHParametersHelper.generateSafePrimes(this.size, this.certainty, this.random);
        BigInteger bigInteger = bigIntegerArrGenerateSafePrimes[0];
        return new ElGamalParameters(bigInteger, DHParametersHelper.selectGenerator(bigInteger, bigIntegerArrGenerateSafePrimes[1], this.random));
    }

    public void init(int i10, int i11, SecureRandom secureRandom) {
        this.size = i10;
        this.certainty = i11;
        this.random = secureRandom;
    }
}

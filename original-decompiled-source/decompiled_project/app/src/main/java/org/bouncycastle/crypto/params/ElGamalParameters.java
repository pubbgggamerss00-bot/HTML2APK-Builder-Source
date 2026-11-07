package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes2.dex */
public class ElGamalParameters implements CipherParameters {

    /* renamed from: g, reason: collision with root package name */
    private BigInteger f20080g;

    /* renamed from: l, reason: collision with root package name */
    private int f20081l;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f20082p;

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ElGamalParameters)) {
            return false;
        }
        ElGamalParameters elGamalParameters = (ElGamalParameters) obj;
        return elGamalParameters.getP().equals(this.f20082p) && elGamalParameters.getG().equals(this.f20080g) && elGamalParameters.getL() == this.f20081l;
    }

    public BigInteger getG() {
        return this.f20080g;
    }

    public int getL() {
        return this.f20081l;
    }

    public BigInteger getP() {
        return this.f20082p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) + this.f20081l;
    }

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2, int i10) {
        this.f20080g = bigInteger2;
        this.f20082p = bigInteger;
        this.f20081l = i10;
    }
}

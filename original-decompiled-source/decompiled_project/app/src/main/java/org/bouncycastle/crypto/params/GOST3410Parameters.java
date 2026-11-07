package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes2.dex */
public class GOST3410Parameters implements CipherParameters {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f20085a;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f20086p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f20087q;
    private GOST3410ValidationParameters validation;

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f20086p = bigInteger;
        this.f20087q = bigInteger2;
        this.f20085a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410Parameters)) {
            return false;
        }
        GOST3410Parameters gOST3410Parameters = (GOST3410Parameters) obj;
        return gOST3410Parameters.getP().equals(this.f20086p) && gOST3410Parameters.getQ().equals(this.f20087q) && gOST3410Parameters.getA().equals(this.f20085a);
    }

    public BigInteger getA() {
        return this.f20085a;
    }

    public BigInteger getP() {
        return this.f20086p;
    }

    public BigInteger getQ() {
        return this.f20087q;
    }

    public GOST3410ValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (this.f20086p.hashCode() ^ this.f20087q.hashCode()) ^ this.f20085a.hashCode();
    }

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, GOST3410ValidationParameters gOST3410ValidationParameters) {
        this.f20085a = bigInteger3;
        this.f20086p = bigInteger;
        this.f20087q = bigInteger2;
        this.validation = gOST3410ValidationParameters;
    }
}

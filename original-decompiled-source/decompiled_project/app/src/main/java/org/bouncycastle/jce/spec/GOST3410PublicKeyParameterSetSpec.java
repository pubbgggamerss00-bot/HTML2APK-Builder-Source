package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes.dex */
public class GOST3410PublicKeyParameterSetSpec {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f20166a;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f20167p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f20168q;

    public GOST3410PublicKeyParameterSetSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f20167p = bigInteger;
        this.f20168q = bigInteger2;
        this.f20166a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GOST3410PublicKeyParameterSetSpec) {
            GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec = (GOST3410PublicKeyParameterSetSpec) obj;
            if (this.f20166a.equals(gOST3410PublicKeyParameterSetSpec.f20166a) && this.f20167p.equals(gOST3410PublicKeyParameterSetSpec.f20167p) && this.f20168q.equals(gOST3410PublicKeyParameterSetSpec.f20168q)) {
                return true;
            }
        }
        return false;
    }

    public BigInteger getA() {
        return this.f20166a;
    }

    public BigInteger getP() {
        return this.f20167p;
    }

    public BigInteger getQ() {
        return this.f20168q;
    }

    public int hashCode() {
        return (this.f20166a.hashCode() ^ this.f20167p.hashCode()) ^ this.f20168q.hashCode();
    }
}

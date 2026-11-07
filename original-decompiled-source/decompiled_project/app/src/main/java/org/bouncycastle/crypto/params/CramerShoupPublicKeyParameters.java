package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public class CramerShoupPublicKeyParameters extends CramerShoupKeyParameters {

    /* renamed from: c, reason: collision with root package name */
    private BigInteger f20058c;

    /* renamed from: d, reason: collision with root package name */
    private BigInteger f20059d;

    /* renamed from: h, reason: collision with root package name */
    private BigInteger f20060h;

    public CramerShoupPublicKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(false, cramerShoupParameters);
        this.f20058c = bigInteger;
        this.f20059d = bigInteger2;
        this.f20060h = bigInteger3;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPublicKeyParameters)) {
            return false;
        }
        CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) obj;
        return cramerShoupPublicKeyParameters.getC().equals(this.f20058c) && cramerShoupPublicKeyParameters.getD().equals(this.f20059d) && cramerShoupPublicKeyParameters.getH().equals(this.f20060h) && super.equals(obj);
    }

    public BigInteger getC() {
        return this.f20058c;
    }

    public BigInteger getD() {
        return this.f20059d;
    }

    public BigInteger getH() {
        return this.f20060h;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((this.f20058c.hashCode() ^ this.f20059d.hashCode()) ^ this.f20060h.hashCode()) ^ super.hashCode();
    }
}

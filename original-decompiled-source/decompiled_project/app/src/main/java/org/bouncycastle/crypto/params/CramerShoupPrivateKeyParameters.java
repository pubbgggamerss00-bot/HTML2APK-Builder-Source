package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public class CramerShoupPrivateKeyParameters extends CramerShoupKeyParameters {
    private CramerShoupPublicKeyParameters pk;

    /* renamed from: x1, reason: collision with root package name */
    private BigInteger f20053x1;

    /* renamed from: x2, reason: collision with root package name */
    private BigInteger f20054x2;

    /* renamed from: y1, reason: collision with root package name */
    private BigInteger f20055y1;

    /* renamed from: y2, reason: collision with root package name */
    private BigInteger f20056y2;

    /* renamed from: z, reason: collision with root package name */
    private BigInteger f20057z;

    public CramerShoupPrivateKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        super(true, cramerShoupParameters);
        this.f20053x1 = bigInteger;
        this.f20054x2 = bigInteger2;
        this.f20055y1 = bigInteger3;
        this.f20056y2 = bigInteger4;
        this.f20057z = bigInteger5;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPrivateKeyParameters)) {
            return false;
        }
        CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters = (CramerShoupPrivateKeyParameters) obj;
        return cramerShoupPrivateKeyParameters.getX1().equals(this.f20053x1) && cramerShoupPrivateKeyParameters.getX2().equals(this.f20054x2) && cramerShoupPrivateKeyParameters.getY1().equals(this.f20055y1) && cramerShoupPrivateKeyParameters.getY2().equals(this.f20056y2) && cramerShoupPrivateKeyParameters.getZ().equals(this.f20057z) && super.equals(obj);
    }

    public CramerShoupPublicKeyParameters getPk() {
        return this.pk;
    }

    public BigInteger getX1() {
        return this.f20053x1;
    }

    public BigInteger getX2() {
        return this.f20054x2;
    }

    public BigInteger getY1() {
        return this.f20055y1;
    }

    public BigInteger getY2() {
        return this.f20056y2;
    }

    public BigInteger getZ() {
        return this.f20057z;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((((this.f20053x1.hashCode() ^ this.f20054x2.hashCode()) ^ this.f20055y1.hashCode()) ^ this.f20056y2.hashCode()) ^ this.f20057z.hashCode()) ^ super.hashCode();
    }

    public void setPk(CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters) {
        this.pk = cramerShoupPublicKeyParameters;
    }
}

package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public class DHPrivateKeyParameters extends DHKeyParameters {

    /* renamed from: x, reason: collision with root package name */
    private BigInteger f20067x;

    public DHPrivateKeyParameters(BigInteger bigInteger, DHParameters dHParameters) {
        super(true, dHParameters);
        this.f20067x = bigInteger;
    }

    @Override // org.bouncycastle.crypto.params.DHKeyParameters
    public boolean equals(Object obj) {
        return (obj instanceof DHPrivateKeyParameters) && ((DHPrivateKeyParameters) obj).getX().equals(this.f20067x) && super.equals(obj);
    }

    public BigInteger getX() {
        return this.f20067x;
    }

    @Override // org.bouncycastle.crypto.params.DHKeyParameters
    public int hashCode() {
        return this.f20067x.hashCode() ^ super.hashCode();
    }
}

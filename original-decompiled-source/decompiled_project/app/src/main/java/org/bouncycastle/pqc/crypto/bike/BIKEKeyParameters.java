package org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes3.dex */
public class BIKEKeyParameters extends AsymmetricKeyParameter {
    private BIKEParameters params;

    public BIKEKeyParameters(boolean z10, BIKEParameters bIKEParameters) {
        super(z10);
        this.params = bIKEParameters;
    }

    public BIKEParameters getParameters() {
        return this.params;
    }
}

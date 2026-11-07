package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes3.dex */
public class FalconKeyParameters extends AsymmetricKeyParameter {
    private final FalconParameters params;

    public FalconKeyParameters(boolean z10, FalconParameters falconParameters) {
        super(z10);
        this.params = falconParameters;
    }

    public FalconParameters getParameters() {
        return this.params;
    }
}

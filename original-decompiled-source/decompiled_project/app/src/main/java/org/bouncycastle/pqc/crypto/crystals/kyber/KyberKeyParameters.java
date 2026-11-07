package org.bouncycastle.pqc.crypto.crystals.kyber;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes3.dex */
public class KyberKeyParameters extends AsymmetricKeyParameter {
    private KyberParameters params;

    public KyberKeyParameters(boolean z10, KyberParameters kyberParameters) {
        super(z10);
        this.params = kyberParameters;
    }

    public KyberParameters getParameters() {
        return this.params;
    }
}

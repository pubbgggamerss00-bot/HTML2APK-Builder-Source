package org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes3.dex */
public class NTRULPRimeKeyParameters extends AsymmetricKeyParameter {
    private final NTRULPRimeParameters params;

    public NTRULPRimeKeyParameters(boolean z10, NTRULPRimeParameters nTRULPRimeParameters) {
        super(z10);
        this.params = nTRULPRimeParameters;
    }

    public NTRULPRimeParameters getParameters() {
        return this.params;
    }
}

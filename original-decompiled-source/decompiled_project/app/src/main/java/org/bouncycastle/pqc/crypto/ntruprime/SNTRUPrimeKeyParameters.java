package org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes3.dex */
public class SNTRUPrimeKeyParameters extends AsymmetricKeyParameter {
    private final SNTRUPrimeParameters params;

    public SNTRUPrimeKeyParameters(boolean z10, SNTRUPrimeParameters sNTRUPrimeParameters) {
        super(z10);
        this.params = sNTRUPrimeParameters;
    }

    public SNTRUPrimeParameters getParameters() {
        return this.params;
    }
}

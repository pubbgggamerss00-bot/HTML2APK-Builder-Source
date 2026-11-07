package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes3.dex */
public class HQCKeyParameters extends AsymmetricKeyParameter {
    private HQCParameters params;

    public HQCKeyParameters(boolean z10, HQCParameters hQCParameters) {
        super(z10);
        this.params = hQCParameters;
    }

    public HQCParameters getParameters() {
        return this.params;
    }
}

package org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes3.dex */
public class DilithiumKeyParameters extends AsymmetricKeyParameter {
    private final DilithiumParameters params;

    public DilithiumKeyParameters(boolean z10, DilithiumParameters dilithiumParameters) {
        super(z10);
        this.params = dilithiumParameters;
    }

    public DilithiumParameters getParameters() {
        return this.params;
    }
}

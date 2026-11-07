package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes.dex */
public class TLSRSAPremasterSecretParameterSpec implements AlgorithmParameterSpec {
    private final int protocolVersion;

    public TLSRSAPremasterSecretParameterSpec(int i10) {
        this.protocolVersion = i10;
    }

    public int getProtocolVersion() {
        return this.protocolVersion;
    }
}

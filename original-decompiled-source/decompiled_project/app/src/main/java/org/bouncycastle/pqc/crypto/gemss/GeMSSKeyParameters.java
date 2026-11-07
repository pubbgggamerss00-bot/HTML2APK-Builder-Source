package org.bouncycastle.pqc.crypto.gemss;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes3.dex */
public class GeMSSKeyParameters extends AsymmetricKeyParameter {
    final GeMSSParameters parameters;

    public GeMSSKeyParameters(boolean z10, GeMSSParameters geMSSParameters) {
        super(z10);
        this.parameters = geMSSParameters;
    }

    public GeMSSParameters getParameters() {
        return this.parameters;
    }
}

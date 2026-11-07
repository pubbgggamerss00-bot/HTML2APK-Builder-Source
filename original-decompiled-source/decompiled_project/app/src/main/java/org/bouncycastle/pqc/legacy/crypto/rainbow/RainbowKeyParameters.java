package org.bouncycastle.pqc.legacy.crypto.rainbow;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes3.dex */
public class RainbowKeyParameters extends AsymmetricKeyParameter {
    private int docLength;

    public RainbowKeyParameters(boolean z10, int i10) {
        super(z10);
        this.docLength = i10;
    }

    public int getDocLength() {
        return this.docLength;
    }
}

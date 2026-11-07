package org.bouncycastle.jcajce.spec;

/* loaded from: classes.dex */
public class KEMParameterSpec extends KTSParameterSpec {
    public KEMParameterSpec(String str) {
        this(str, 256);
    }

    public int getKeySizeInBits() {
        return getKeySize();
    }

    public KEMParameterSpec(String str, int i10) {
        super(str, i10, null, null, null);
    }
}

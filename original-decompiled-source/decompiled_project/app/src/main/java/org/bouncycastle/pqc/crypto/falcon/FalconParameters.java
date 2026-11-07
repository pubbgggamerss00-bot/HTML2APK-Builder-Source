package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes3.dex */
public class FalconParameters implements CipherParameters {
    private final int logn;
    private final String name;
    private final int nonce_length;
    public static final FalconParameters falcon_512 = new FalconParameters("falcon-512", 9, 40);
    public static final FalconParameters falcon_1024 = new FalconParameters("falcon-1024", 10, 40);

    private FalconParameters(String str, int i10, int i11) {
        if (i10 < 1 || i10 > 10) {
            throw new IllegalArgumentException("Log N degree should be between 1 and 10");
        }
        this.name = str;
        this.logn = i10;
        this.nonce_length = i11;
    }

    public int getLogN() {
        return this.logn;
    }

    public String getName() {
        return this.name;
    }

    public int getNonceLength() {
        return this.nonce_length;
    }
}

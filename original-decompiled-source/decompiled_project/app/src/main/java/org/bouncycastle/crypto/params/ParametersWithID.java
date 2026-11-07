package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes2.dex */
public class ParametersWithID implements CipherParameters {

    /* renamed from: id, reason: collision with root package name */
    private byte[] f20097id;
    private CipherParameters parameters;

    public ParametersWithID(CipherParameters cipherParameters, byte[] bArr) {
        this.parameters = cipherParameters;
        this.f20097id = bArr;
    }

    public byte[] getID() {
        return this.f20097id;
    }

    public CipherParameters getParameters() {
        return this.parameters;
    }
}

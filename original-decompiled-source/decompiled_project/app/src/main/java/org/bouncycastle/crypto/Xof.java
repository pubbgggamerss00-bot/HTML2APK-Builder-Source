package org.bouncycastle.crypto;

/* loaded from: classes2.dex */
public interface Xof extends ExtendedDigest {
    int doFinal(byte[] bArr, int i10, int i11);

    int doOutput(byte[] bArr, int i10, int i11);
}

package org.bouncycastle.util.encoders;

/* loaded from: classes3.dex */
public interface Translator {
    int decode(byte[] bArr, int i10, int i11, byte[] bArr2, int i12);

    int encode(byte[] bArr, int i10, int i11, byte[] bArr2, int i12);

    int getDecodedBlockSize();

    int getEncodedBlockSize();
}

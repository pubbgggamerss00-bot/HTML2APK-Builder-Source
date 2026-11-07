package com.google.android.gms.internal.p002firebaseauthapi;

import j2.y;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes2.dex */
abstract class zzht {
    int[] zza;
    private final int zzb;

    public zzht(byte[] bArr, int i10) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzhs.zza(bArr);
        this.zzb = i10;
    }

    public abstract int zza();

    public final ByteBuffer zza(byte[] bArr, int i10) {
        int[] iArrZza = zza(zzhs.zza(bArr), i10);
        int[] iArr = (int[]) iArrZza.clone();
        zzhs.zza(iArr);
        for (int i11 = 0; i11 < iArrZza.length; i11++) {
            iArrZza[i11] = iArrZza[i11] + iArr[i11];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZza, 0, 16);
        return byteBufferOrder;
    }

    public abstract int[] zza(int[] iArr, int i10);

    public void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= bArr2.length) {
            zza(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    private final void zza(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length == zza()) {
            int iRemaining = byteBuffer2.remaining();
            int i10 = iRemaining / 64;
            int i11 = i10 + 1;
            for (int i12 = 0; i12 < i11; i12++) {
                ByteBuffer byteBufferZza = zza(bArr, this.zzb + i12);
                if (i12 == i10) {
                    zzyt.zza(byteBuffer, byteBuffer2, byteBufferZza, iRemaining % 64);
                } else {
                    zzyt.zza(byteBuffer, byteBuffer2, byteBufferZza, 64);
                }
            }
            return;
        }
        throw new GeneralSecurityException(y.a(zza(), "The nonce length (in bytes) must be "));
    }

    public byte[] zza(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        zza(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }
}

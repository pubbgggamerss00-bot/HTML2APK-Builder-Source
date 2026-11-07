package com.google.android.gms.internal.fido;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
abstract class zzfp extends zzfr {
    private final ByteBuffer zza = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    @Override // com.google.android.gms.internal.fido.zzfr, com.google.android.gms.internal.fido.zzfv
    public final zzfv zza(byte[] bArr) {
        bArr.getClass();
        zzb(bArr, 0, bArr.length);
        return this;
    }

    public void zzb(byte[] bArr, int i10, int i11) {
        throw null;
    }
}

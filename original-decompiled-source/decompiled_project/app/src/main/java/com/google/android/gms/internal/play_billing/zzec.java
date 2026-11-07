package com.google.android.gms.internal.play_billing;

import e1.c;
import j2.y;

/* loaded from: classes2.dex */
final class zzec extends zzeg {
    private final int zzc;

    public zzec(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzei.zzh(0, i11, bArr.length);
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg, com.google.android.gms.internal.play_billing.zzei
    public final byte zza(int i10) {
        int i11 = this.zzc;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return ((zzeg) this).zza[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(y.a(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(c.a(i10, i11, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg, com.google.android.gms.internal.play_billing.zzei
    public final byte zzb(int i10) {
        return ((zzeg) this).zza[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg, com.google.android.gms.internal.play_billing.zzei
    public final int zzd() {
        return this.zzc;
    }
}

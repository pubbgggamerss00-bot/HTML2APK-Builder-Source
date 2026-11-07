package com.google.android.gms.internal.p002firebaseauthapi;

import e1.c;
import j2.y;

/* loaded from: classes2.dex */
final class zzajt extends zzajw {
    private final int zzc;
    private final int zzd;

    public zzajt(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzajp.zza(i10, i10 + i11, bArr.length);
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajw, com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final byte zza(int i10) {
        int iZzb = zzb();
        if (((iZzb - (i10 + 1)) | i10) >= 0) {
            return this.zzb[this.zzc + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(y.a(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(c.a(i10, iZzb, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajw, com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final byte zzb(int i10) {
        return this.zzb[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajw
    public final int zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajw, com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajw, com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final void zza(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, zze(), bArr, 0, i12);
    }
}

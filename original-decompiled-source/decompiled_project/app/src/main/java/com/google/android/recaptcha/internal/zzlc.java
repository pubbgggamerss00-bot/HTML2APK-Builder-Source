package com.google.android.recaptcha.internal;

import java.io.IOException;

/* loaded from: classes2.dex */
class zzlc extends zzlb {
    protected final byte[] zza;

    public zzlc(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzle) || zzd() != ((zzle) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzlc)) {
            return obj.equals(this);
        }
        zzlc zzlcVar = (zzlc) obj;
        int iZzj = zzj();
        int iZzj2 = zzlcVar.zzj();
        if (iZzj != 0 && iZzj2 != 0 && iZzj != iZzj2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzlcVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzlcVar.zzd()) {
            throw new IllegalArgumentException(e1.c.a(iZzd, zzlcVar.zzd(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzlcVar.zza;
        zzlcVar.zzc();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iZzd) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public byte zza(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, 0, bArr, 0, i12);
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public final int zzf(int i10, int i11, int i12) {
        return zznl.zzb(i10, this.zza, 0, i12);
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public final zzle zzg(int i10, int i11) {
        int iZzi = zzle.zzi(0, i11, zzd());
        return iZzi == 0 ? zzle.zzb : new zzkz(this.zza, 0, iZzi);
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public final void zzh(zzkw zzkwVar) throws IOException {
        ((zzlk) zzkwVar).zzc(this.zza, 0, zzd());
    }
}

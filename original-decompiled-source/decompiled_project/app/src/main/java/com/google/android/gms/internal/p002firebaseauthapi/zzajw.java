package com.google.android.gms.internal.p002firebaseauthapi;

import e1.c;
import java.io.IOException;

/* loaded from: classes2.dex */
class zzajw extends zzajx {
    protected final byte[] zzb;

    public zzajw(byte[] bArr) {
        super();
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzajp) || zzb() != ((zzajp) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zzajw)) {
            return obj.equals(this);
        }
        zzajw zzajwVar = (zzajw) obj;
        int iZza = zza();
        int iZza2 = zzajwVar.zza();
        if (iZza == 0 || iZza2 == 0 || iZza == iZza2) {
            return zza(zzajwVar, 0, zzb());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public byte zza(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public byte zzb(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final zzakb zzc() {
        return zzakb.zza(this.zzb, zze(), zzb(), true);
    }

    public int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final zzajp zza(int i10, int i11) {
        int iZza = zzajp.zza(0, i11, zzb());
        return iZza == 0 ? zzajp.zza : new zzajt(this.zzb, zze(), iZza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final int zzb(int i10, int i11, int i12) {
        return zzalb.zza(i10, this.zzb, zze(), i12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public void zza(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, 0, bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final void zza(zzajm zzajmVar) throws IOException {
        zzajmVar.zza(this.zzb, zze(), zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajx
    public final boolean zza(zzajp zzajpVar, int i10, int i11) {
        if (i11 <= zzajpVar.zzb()) {
            if (i11 <= zzajpVar.zzb()) {
                if (zzajpVar instanceof zzajw) {
                    zzajw zzajwVar = (zzajw) zzajpVar;
                    byte[] bArr = this.zzb;
                    byte[] bArr2 = zzajwVar.zzb;
                    int iZze = zze() + i11;
                    int iZze2 = zze();
                    int iZze3 = zzajwVar.zze();
                    while (iZze2 < iZze) {
                        if (bArr[iZze2] != bArr2[iZze3]) {
                            return false;
                        }
                        iZze2++;
                        iZze3++;
                    }
                    return true;
                }
                return zzajpVar.zza(0, i11).equals(zza(0, i11));
            }
            throw new IllegalArgumentException(c.a(i11, zzajpVar.zzb(), "Ran off end of other: 0, ", ", "));
        }
        throw new IllegalArgumentException("Length too large: " + i11 + zzb());
    }
}

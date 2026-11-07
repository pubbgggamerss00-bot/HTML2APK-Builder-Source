package com.google.android.gms.internal.play_billing;

import e1.c;
import java.io.IOException;

/* loaded from: classes2.dex */
class zzeg extends zzef {
    protected final byte[] zza;

    public zzeg(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzei) || zzd() != ((zzei) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzeg)) {
            return obj.equals(this);
        }
        zzeg zzegVar = (zzeg) obj;
        int iZzi = zzi();
        int iZzi2 = zzegVar.zzi();
        if (iZzi != 0 && iZzi2 != 0 && iZzi != iZzi2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzegVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzegVar.zzd()) {
            throw new IllegalArgumentException(c.a(iZzd, zzegVar.zzd(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzegVar.zza;
        zzegVar.zzc();
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

    @Override // com.google.android.gms.internal.play_billing.zzei
    public byte zza(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public final int zze(int i10, int i11, int i12) {
        return zzfo.zzb(i10, this.zza, 0, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public final zzei zzf(int i10, int i11) {
        int iZzh = zzei.zzh(0, i11, zzd());
        return iZzh == 0 ? zzei.zzb : new zzec(this.zza, 0, iZzh);
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public final void zzg(zzdz zzdzVar) throws IOException {
        ((zzem) zzdzVar).zzc(this.zza, 0, zzd());
    }
}

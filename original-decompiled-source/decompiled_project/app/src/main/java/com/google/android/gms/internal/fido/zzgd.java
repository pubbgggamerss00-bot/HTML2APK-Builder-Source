package com.google.android.gms.internal.fido;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzgd extends zzge {
    private zzgd(zzgb zzgbVar, Character ch2) {
        super(zzgbVar, ch2);
        zzbm.zzc(zzgbVar.zzf.length == 64);
    }

    @Override // com.google.android.gms.internal.fido.zzge
    public final zzgf zza(zzgb zzgbVar, Character ch2) {
        return new zzgd(zzgbVar, ch2);
    }

    @Override // com.google.android.gms.internal.fido.zzge, com.google.android.gms.internal.fido.zzgf
    public final void zzb(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzbm.zze(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = bArr[i12] & 255;
            int i15 = ((bArr[i12 + 1] & 255) << 8) | (i14 << 16) | (bArr[i12 + 2] & 255);
            appendable.append(this.zzb.zza(i15 >>> 18));
            appendable.append(this.zzb.zza((i15 >>> 12) & 63));
            appendable.append(this.zzb.zza((i15 >>> 6) & 63));
            appendable.append(this.zzb.zza(i15 & 63));
            i12 += 3;
        }
        if (i12 < i11) {
            zze(appendable, bArr, i12, i11 - i12);
        }
    }

    public zzgd(String str, String str2, Character ch2) {
        this(new zzgb(str, str2.toCharArray()), ch2);
    }
}

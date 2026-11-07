package com.google.android.gms.internal.fido;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzgc extends zzge {
    final char[] zza;

    private zzgc(zzgb zzgbVar) {
        super(zzgbVar, null);
        this.zza = new char[512];
        zzbm.zzc(zzgbVar.zzf.length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            this.zza[i10] = zzgbVar.zza(i10 >>> 4);
            this.zza[i10 | 256] = zzgbVar.zza(i10 & 15);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzge
    public final zzgf zza(zzgb zzgbVar, Character ch2) {
        return new zzgc(zzgbVar);
    }

    @Override // com.google.android.gms.internal.fido.zzge, com.google.android.gms.internal.fido.zzgf
    public final void zzb(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        zzbm.zze(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = bArr[i12] & 255;
            appendable.append(this.zza[i13]);
            appendable.append(this.zza[i13 | 256]);
        }
    }

    public zzgc(String str, String str2) {
        this(new zzgb("base16()", "0123456789ABCDEF".toCharArray()));
    }
}

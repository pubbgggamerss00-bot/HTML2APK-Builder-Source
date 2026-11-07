package com.google.android.gms.internal.common;

/* loaded from: classes2.dex */
final class zzw extends zzz {
    final /* synthetic */ zzr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzw(zzx zzxVar, zzaa zzaaVar, CharSequence charSequence, zzr zzrVar) {
        super(zzaaVar, charSequence);
        this.zza = zzrVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    public final int zzc(int i10) {
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.common.zzz
    public final int zzd(int i10) {
        CharSequence charSequence = ((zzz) this).zzb;
        int length = charSequence.length();
        zzv.zzb(i10, length, "index");
        while (i10 < length) {
            if (this.zza.zza(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}

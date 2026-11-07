package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
final class zzoa implements zzox {
    private static final zzog zza = new zzny();
    private final zzog zzb;

    public zzoa() {
        zzmw zzmwVarZza = zzmw.zza();
        int i10 = zzos.zza;
        zznz zznzVar = new zznz(zzmwVarZza, zza);
        byte[] bArr = zznl.zzb;
        this.zzb = zznzVar;
    }

    @Override // com.google.android.recaptcha.internal.zzox
    public final zzow zza(Class cls) {
        int i10 = zzoy.zza;
        if (!zznd.class.isAssignableFrom(cls)) {
            int i11 = zzos.zza;
        }
        zzof zzofVarZzb = this.zzb.zzb(cls);
        if (zzofVarZzb.zzb()) {
            int i12 = zzos.zza;
            return zzom.zzc(zzoy.zzm(), zzmr.zza(), zzofVarZzb.zza());
        }
        int i13 = zzos.zza;
        return zzol.zzm(cls, zzofVarZzb, zzop.zza(), zznw.zza(), zzoy.zzm(), zzofVarZzb.zzc() + (-1) != 1 ? zzmr.zza() : null, zzoe.zza());
    }
}

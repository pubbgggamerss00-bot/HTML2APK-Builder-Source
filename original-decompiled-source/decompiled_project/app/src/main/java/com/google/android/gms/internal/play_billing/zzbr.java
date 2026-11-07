package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
final class zzbr extends zzbn {
    private final zzbt zza;

    public zzbr(zzbt zzbtVar, int i10) {
        super(zzbtVar.size(), i10);
        this.zza = zzbtVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbn
    public final Object zza(int i10) {
        return this.zza.get(i10);
    }
}

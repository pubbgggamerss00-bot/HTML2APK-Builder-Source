package com.google.android.gms.internal.common;

/* loaded from: classes2.dex */
final class zzai extends zzad {
    private final zzak zza;

    public zzai(zzak zzakVar, int i10) {
        super(zzakVar.size(), i10);
        this.zza = zzakVar;
    }

    @Override // com.google.android.gms.internal.common.zzad
    public final Object zza(int i10) {
        return this.zza.get(i10);
    }
}

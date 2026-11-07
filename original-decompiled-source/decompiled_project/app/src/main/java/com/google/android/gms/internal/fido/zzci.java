package com.google.android.gms.internal.fido;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzci extends zzce {
    final /* synthetic */ zzcj zza;

    public zzci(zzcj zzcjVar) {
        this.zza = zzcjVar;
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzi().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby
    /* renamed from: zzd */
    public final zzdc iterator() {
        return zzi().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzce
    public final zzcd zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final zzcc zzj() {
        return new zzch(this);
    }
}

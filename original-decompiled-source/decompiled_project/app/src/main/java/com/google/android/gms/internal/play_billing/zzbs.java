package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* loaded from: classes2.dex */
final class zzbs extends zzbt {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzbt zzc;

    public zzbs(zzbt zzbtVar, int i10, int i11) {
        Objects.requireNonNull(zzbtVar);
        this.zzc = zzbtVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzbg.zza(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt, java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzbt subList(int i10, int i11) {
        zzbg.zzd(i10, i11, this.zzb);
        int i12 = this.zza;
        return this.zzc.subList(i10 + i12, i11 + i12);
    }
}

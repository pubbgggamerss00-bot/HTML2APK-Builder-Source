package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
final class zzao extends zzaj {
    private final transient int zza;
    private final transient int zzb;
    private final /* synthetic */ zzaj zzc;

    public zzao(zzaj zzajVar, int i10, int i11) {
        this.zzc = zzajVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzw.zza(i10, this.zzb);
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai
    public final int zza() {
        return this.zzc.zzb() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai
    public final int zzb() {
        return this.zzc.zzb() + this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai
    public final Object[] zzf() {
        return this.zzc.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaj, java.util.List
    /* renamed from: zza */
    public final zzaj subList(int i10, int i11) {
        zzw.zza(i10, i11, this.zzb);
        zzaj zzajVar = this.zzc;
        int i12 = this.zza;
        return (zzaj) zzajVar.subList(i10 + i12, i11 + i12);
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
final class zzav<K> extends zzas<K> {
    private final transient zzan<K, ?> zza;
    private final transient zzaj<K> zzb;

    public zzav(zzan<K, ?> zzanVar, zzaj<K> zzajVar) {
        this.zza = zzanVar;
        this.zzb = zzajVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai
    public final int zza(Object[] objArr, int i10) {
        return zzc().zza(objArr, i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzas, com.google.android.gms.internal.p002firebaseauthapi.zzai
    public final zzaj<K> zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzas, com.google.android.gms.internal.p002firebaseauthapi.zzai, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public final zzba<K> iterator() {
        return (zzba) zzc().iterator();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai
    public final boolean zze() {
        return true;
    }
}

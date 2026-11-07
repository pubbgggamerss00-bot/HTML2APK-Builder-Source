package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzaw extends zzaj {
    private final /* synthetic */ zzat zza;

    public zzaw(zzat zzatVar) {
        this.zza = zzatVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzw.zza(i10, this.zza.zzc);
        int i11 = i10 * 2;
        Object obj = this.zza.zzb[i11];
        Objects.requireNonNull(obj);
        Object obj2 = this.zza.zzb[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai
    public final boolean zze() {
        return true;
    }
}

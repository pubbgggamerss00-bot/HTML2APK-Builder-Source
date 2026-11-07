package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class zzajo extends zzajq {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zzajp zzc;

    public zzajo(zzajp zzajpVar) {
        this.zzc = zzajpVar;
        this.zzb = zzajpVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    public final byte zza() {
        int i10 = this.zza;
        if (i10 >= this.zzb) {
            throw new NoSuchElementException();
        }
        this.zza = i10 + 1;
        return this.zzc.zzb(i10);
    }
}

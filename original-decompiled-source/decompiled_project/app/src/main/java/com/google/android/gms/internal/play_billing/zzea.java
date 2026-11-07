package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzea extends zzeb {
    final /* synthetic */ zzei zza;
    private int zzb;
    private final int zzc;

    public zzea(zzei zzeiVar) {
        Objects.requireNonNull(zzeiVar);
        this.zza = zzeiVar;
        this.zzb = 0;
        this.zzc = zzeiVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzed
    public final byte zza() {
        int i10 = this.zzb;
        if (i10 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i10 + 1;
        return this.zza.zzb(i10);
    }
}

package com.google.android.gms.internal.fido;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class zzfe implements Iterator {
    final /* synthetic */ zzff zza;
    private int zzb = 0;

    public zzfe(zzff zzffVar) {
        this.zza = zzffVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zzb;
        zzff zzffVar = this.zza;
        return i10 < zzffVar.zza() - zzffVar.zzb();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.zzb;
        zzff zzffVar = this.zza;
        if (i10 >= zzffVar.zza() - zzffVar.zzb()) {
            throw new NoSuchElementException();
        }
        zzff zzffVar2 = this.zza;
        Object obj = zzffVar2.zzb.zzb[zzffVar2.zzb() + i10];
        this.zzb = i10 + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

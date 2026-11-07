package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
abstract class zzd<T> implements Iterator<T> {
    private int zza = 2;
    private T zzb;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zza;
        if (i10 == 4) {
            throw new IllegalStateException();
        }
        int i11 = i10 - 1;
        if (i11 == 0) {
            return true;
        }
        if (i11 != 2) {
            this.zza = 4;
            this.zzb = zza();
            if (this.zza != 3) {
                this.zza = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.zza = 2;
        T t3 = this.zzb;
        this.zzb = null;
        return t3;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public abstract T zza();

    public final T zzb() {
        this.zza = 3;
        return null;
    }
}

package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzpb implements Iterator {
    final /* synthetic */ zzpe zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzpb(zzpe zzpeVar, zzpd zzpdVar) {
        this.zza = zzpeVar;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zzb + 1;
        zzpe zzpeVar = this.zza;
        if (i10 >= zzpeVar.zzb) {
            return !zzpeVar.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        zzpe zzpeVar = this.zza;
        return i10 < zzpeVar.zzb ? (zzpa) zzpeVar.zza[i10] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzo();
        int i10 = this.zzb;
        zzpe zzpeVar = this.zza;
        if (i10 >= zzpeVar.zzb) {
            zza().remove();
        } else {
            this.zzb = i10 - 1;
            zzpeVar.zzm(i10);
        }
    }
}

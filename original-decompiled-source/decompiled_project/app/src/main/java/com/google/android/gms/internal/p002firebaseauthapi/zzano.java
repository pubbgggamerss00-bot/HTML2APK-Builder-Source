package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* loaded from: classes2.dex */
abstract class zzano<T, B> {
    private static volatile int zza = 100;

    public abstract int zza(T t3);

    public abstract B zza();

    public abstract T zza(T t3, T t10);

    public abstract void zza(B b10, int i10, int i11);

    public abstract void zza(B b10, int i10, long j10);

    public abstract void zza(B b10, int i10, zzajp zzajpVar);

    public abstract void zza(B b10, int i10, T t3);

    public abstract void zza(T t3, zzaof zzaofVar) throws IOException;

    public abstract boolean zza(zzams zzamsVar);

    public final boolean zza(B b10, zzams zzamsVar, int i10) throws IOException {
        int iZzd = zzamsVar.zzd();
        int i11 = iZzd >>> 3;
        int i12 = iZzd & 7;
        if (i12 == 0) {
            zzb(b10, i11, zzamsVar.zzl());
            return true;
        }
        if (i12 == 1) {
            zza((zzano<T, B>) b10, i11, zzamsVar.zzk());
            return true;
        }
        if (i12 == 2) {
            zza((zzano<T, B>) b10, i11, zzamsVar.zzp());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                if (i10 != 0) {
                    return false;
                }
                throw zzalf.zzb();
            }
            if (i12 != 5) {
                throw zzalf.zza();
            }
            zza((zzano<T, B>) b10, i11, zzamsVar.zzf());
            return true;
        }
        B bZza = zza();
        int i13 = 4 | (i11 << 3);
        int i14 = i10 + 1;
        if (i14 >= zza) {
            throw zzalf.zzh();
        }
        while (zzamsVar.zzc() != Integer.MAX_VALUE && zza((zzano<T, B>) bZza, zzamsVar, i14)) {
        }
        if (i13 != zzamsVar.zzd()) {
            throw zzalf.zzb();
        }
        zza((zzano<T, B>) b10, i11, (int) zze(bZza));
        return true;
    }

    public abstract int zzb(T t3);

    public abstract void zzb(B b10, int i10, long j10);

    public abstract void zzb(T t3, zzaof zzaofVar) throws IOException;

    public abstract void zzb(Object obj, B b10);

    public abstract B zzc(Object obj);

    public abstract void zzc(Object obj, T t3);

    public abstract T zzd(Object obj);

    public abstract T zze(B b10);

    public abstract void zzf(Object obj);
}

package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* loaded from: classes2.dex */
final class zzalp implements zzalm {
    private static <E> zzalc<E> zzc(Object obj, long j10) {
        return (zzalc) zzanp.zze(obj, j10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalm
    public final <L> List<L> zza(Object obj, long j10) {
        zzalc zzalcVarZzc = zzc(obj, j10);
        if (zzalcVarZzc.zzc()) {
            return zzalcVarZzc;
        }
        int size = zzalcVarZzc.size();
        zzalc zzalcVarZza = zzalcVarZzc.zza(size == 0 ? 10 : size << 1);
        zzanp.zza(obj, j10, zzalcVarZza);
        return zzalcVarZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalm
    public final void zzb(Object obj, long j10) {
        zzc(obj, j10).zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalm
    public final <E> void zza(Object obj, Object obj2, long j10) {
        zzalc zzalcVarZzc = zzc(obj, j10);
        zzalc zzalcVarZzc2 = zzc(obj2, j10);
        int size = zzalcVarZzc.size();
        int size2 = zzalcVarZzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzalcVarZzc.zzc()) {
                zzalcVarZzc = zzalcVarZzc.zza(size2 + size);
            }
            zzalcVarZzc.addAll(zzalcVarZzc2);
        }
        if (size > 0) {
            zzalcVarZzc2 = zzalcVarZzc;
        }
        zzanp.zza(obj, j10, zzalcVarZzc2);
    }
}

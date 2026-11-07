package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes2.dex */
final class zznv {
    public static final List zza(Object obj, long j10) {
        zznk zznkVar = (zznk) zzps.zzf(obj, j10);
        if (zznkVar.zzc()) {
            return zznkVar;
        }
        int size = zznkVar.size();
        zznk zznkVarZzd = zznkVar.zzd(size == 0 ? 10 : size + size);
        zzps.zzs(obj, j10, zznkVarZzd);
        return zznkVarZzd;
    }
}

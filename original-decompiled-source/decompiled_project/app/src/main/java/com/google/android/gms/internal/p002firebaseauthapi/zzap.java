package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.room.y0;

/* loaded from: classes2.dex */
final class zzap {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzap(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        String strValueOf = String.valueOf(this.zza);
        String strValueOf2 = String.valueOf(this.zzb);
        String strValueOf3 = String.valueOf(this.zza);
        String strValueOf4 = String.valueOf(this.zzc);
        StringBuilder sbA = y0.a("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and ");
        sbA.append(strValueOf3);
        sbA.append("=");
        sbA.append(strValueOf4);
        return new IllegalArgumentException(sbA.toString());
    }
}

package com.google.android.gms.internal.play_billing;

import androidx.room.y0;

/* loaded from: classes2.dex */
final class zzbu {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzbu(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        String strValueOf = String.valueOf(obj3);
        String strValueOf2 = String.valueOf(obj2);
        String strValueOf3 = String.valueOf(obj3);
        String strValueOf4 = String.valueOf(obj);
        StringBuilder sbA = y0.a("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and ");
        sbA.append(strValueOf3);
        sbA.append("=");
        sbA.append(strValueOf4);
        return new IllegalArgumentException(sbA.toString());
    }
}

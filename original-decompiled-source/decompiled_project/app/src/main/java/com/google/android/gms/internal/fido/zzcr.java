package com.google.android.gms.internal.fido;

import j2.y;

/* loaded from: classes2.dex */
public final class zzcr {
    public static Object zza(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(y.a(i10, "at index "));
    }

    public static Object[] zzb(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            zza(objArr[i11], i11);
        }
        return objArr;
    }
}

package com.google.android.gms.internal.common;

import j2.y;

/* loaded from: classes2.dex */
public final class zzal {
    public static Object[] zza(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(y.a(i11, "at index "));
            }
        }
        return objArr;
    }
}

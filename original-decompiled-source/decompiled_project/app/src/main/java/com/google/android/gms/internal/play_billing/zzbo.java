package com.google.android.gms.internal.play_billing;

import i8.n;

/* loaded from: classes2.dex */
final class zzbo {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(n.d("null value in entry: ", obj.toString(), "=null"));
        }
    }
}

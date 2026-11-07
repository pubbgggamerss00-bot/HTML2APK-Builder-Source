package com.google.android.gms.internal.location;

import android.os.Looper;
import com.google.android.gms.common.internal.p;

/* loaded from: classes2.dex */
public final class zzbj {
    public static Looper zza(Looper looper) {
        return looper != null ? looper : zzb();
    }

    public static Looper zzb() {
        p.h("Can't create handler inside thread that has not called Looper.prepare()", Looper.myLooper() != null);
        return Looper.myLooper();
    }
}

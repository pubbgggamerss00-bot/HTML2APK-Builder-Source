package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import pa.e;

/* loaded from: classes2.dex */
public final class zzael {
    private static Boolean zza;

    public static boolean zza(Context context) {
        if (zza == null) {
            int iC = e.f21389b.c(context, 12451000);
            zza = Boolean.valueOf(iC == 0 || iC == 2);
        }
        return zza.booleanValue();
    }
}

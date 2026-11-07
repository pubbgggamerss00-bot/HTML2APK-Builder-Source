package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import pg.n;
import qg.k0;

/* loaded from: classes2.dex */
public final class zzjb {
    public static final Map zza() {
        LinkedHashMap linkedHashMapE = k0.e(new n(-4, zzba.zzo), new n(-12, zzba.zzp), new n(-6, zzba.zzk), new n(-11, zzba.zzm), new n(-13, zzba.zzq), new n(-14, zzba.zzr), new n(-2, zzba.zzl), new n(-7, zzba.zzs), new n(-5, zzba.zzt), new n(-9, zzba.zzu), new n(-8, zzba.zzE), new n(-15, zzba.zzn), new n(-1, zzba.zzv), new n(-3, zzba.zzx), new n(-10, zzba.zzy));
        int i10 = Build.VERSION.SDK_INT;
        linkedHashMapE.put(-16, zzba.zzw);
        linkedHashMapE.put(1, zzba.zzA);
        linkedHashMapE.put(2, zzba.zzB);
        linkedHashMapE.put(0, zzba.zzC);
        linkedHashMapE.put(3, zzba.zzD);
        if (i10 >= 29) {
            linkedHashMapE.put(4, zzba.zzz);
        }
        return linkedHashMapE;
    }
}

package com.google.android.recaptcha.internal;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzbs {
    private final pa.e zza;

    public zzbs() {
        this.zza = pa.e.f21389b;
    }

    public final int zza(Context context) {
        int iB = this.zza.b(context);
        return (iB == 1 || iB == 3 || iB == 9) ? 4 : 3;
    }

    public zzbs(pa.e eVar) {
        this.zza = eVar;
    }
}

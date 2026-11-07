package com.google.android.recaptcha.internal;

import android.app.Application;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class zzdq extends s implements eh.a {
    public static final zzdq zza = new zzdq();

    public zzdq() {
        super(0);
    }

    @Override // eh.a
    public final Object invoke() throws zzbd {
        int i10 = zzav.zza;
        Object objZzb = zzau.zza().zzb(735120228);
        if (objZzb != null) {
            return (Application) objZzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}

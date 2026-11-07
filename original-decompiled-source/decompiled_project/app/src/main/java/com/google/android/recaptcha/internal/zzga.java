package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.r;
import qg.m;
import qg.z;

/* loaded from: classes2.dex */
public final class zzga extends zzfx {
    private final zzfz zza;
    private final String zzb;

    public zzga(zzfz zzfzVar, String str, Object obj) {
        super(obj);
        this.zza = zzfzVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        if (!r.a(method.getName(), this.zzb)) {
            return false;
        }
        this.zza.zzb(objArr != null ? m.a(objArr) : z.f22752a);
        return true;
    }
}

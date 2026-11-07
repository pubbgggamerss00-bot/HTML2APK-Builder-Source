package com.google.android.recaptcha.internal;

import ph.r2;

/* loaded from: classes2.dex */
public final class zzf {
    public static final zzbd zza(Exception exc, zzbd zzbdVar) {
        return exc instanceof r2 ? new zzbd(zzbb.zzb, zzba.zzb, exc.getMessage()) : exc instanceof zzbd ? (zzbd) exc : zzbdVar;
    }
}

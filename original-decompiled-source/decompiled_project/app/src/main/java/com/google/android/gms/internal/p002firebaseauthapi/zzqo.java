package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzqo extends RuntimeException {
    public zzqo(String str) {
        super(str);
    }

    public static <T> T zza(zzqn<T> zzqnVar) {
        try {
            return zzqnVar.zza();
        } catch (Exception e10) {
            throw new zzqo(e10);
        }
    }

    private zzqo(Throwable th2) {
        super(th2);
    }

    public zzqo(String str, Throwable th2) {
        super(str, th2);
    }
}

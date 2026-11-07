package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
final class zzamr {
    private static final zzamr zza = new zzamr();
    private final ConcurrentMap<Class<?>, zzamv<?>> zzc = new ConcurrentHashMap();
    private final zzamu zzb = new zzalq();

    private zzamr() {
    }

    public static zzamr zza() {
        return zza;
    }

    public final <T> zzamv<T> zza(Class<T> cls) {
        zzalb.zza(cls, "messageType");
        zzamv<T> zzamvVarZza = (zzamv) this.zzc.get(cls);
        if (zzamvVarZza == null) {
            zzamvVarZza = this.zzb.zza(cls);
            zzalb.zza(cls, "messageType");
            zzalb.zza(zzamvVarZza, "schema");
            zzamv<T> zzamvVar = (zzamv) this.zzc.putIfAbsent(cls, zzamvVarZza);
            if (zzamvVar != null) {
                return zzamvVar;
            }
        }
        return zzamvVarZza;
    }

    public final <T> zzamv<T> zza(T t3) {
        return zza((Class) t3.getClass());
    }
}

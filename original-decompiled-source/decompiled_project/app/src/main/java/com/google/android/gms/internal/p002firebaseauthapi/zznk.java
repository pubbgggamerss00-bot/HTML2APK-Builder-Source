package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Enum;
import java.security.GeneralSecurityException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zznk<E extends Enum<E>, O> {
    private final Map<E, O> zza;
    private final Map<O, E> zzb;

    public static <E extends Enum<E>, O> zznn<E, O> zza() {
        return new zznn<>();
    }

    private zznk(Map<E, O> map, Map<O, E> map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final E zza(O o10) throws GeneralSecurityException {
        E e10 = this.zzb.get(o10);
        if (e10 != null) {
            return e10;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(o10)));
    }

    public final O zza(E e10) throws GeneralSecurityException {
        O o10 = this.zza.get(e10);
        if (o10 != null) {
            return o10;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(e10)));
    }
}

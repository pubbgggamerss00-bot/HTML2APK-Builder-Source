package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzpa {
    private static final zzpa zza = new zzpa();
    private final Map<String, zzce> zzb = new HashMap();

    public static zzpa zza() {
        return zza;
    }

    private final synchronized void zza(String str, zzce zzceVar) throws GeneralSecurityException {
        try {
            if (!this.zzb.containsKey(str)) {
                this.zzb.put(str, zzceVar);
                return;
            }
            if (this.zzb.get(str).equals(zzceVar)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.zzb.get(str)) + "), cannot insert " + String.valueOf(zzceVar));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zza(Map<String, zzce> map) throws GeneralSecurityException {
        for (Map.Entry<String, zzce> entry : map.entrySet()) {
            zza(entry.getKey(), entry.getValue());
        }
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzzg<JcePrimitiveT> implements zzzh<JcePrimitiveT> {
    private final zzzj<JcePrimitiveT> zza;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzh
    public final JcePrimitiveT zza(String str) throws GeneralSecurityException {
        Iterator<Provider> it = zzzd.zza("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, it.next());
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        return this.zza.zza(str, null);
    }

    private zzzg(zzzj<JcePrimitiveT> zzzjVar) {
        this.zza = zzzjVar;
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import m3.a;

/* loaded from: classes2.dex */
public final class zzbz {
    private static final CopyOnWriteArrayList<zzca> zza = new CopyOnWriteArrayList<>();

    public static zzca zza(String str) throws GeneralSecurityException {
        Iterator<zzca> it = zza.iterator();
        while (it.hasNext()) {
            zzca next = it.next();
            if (next.zzb(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException(a.a("No KMS client does support: ", str));
    }
}

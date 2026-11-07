package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.p;
import java.io.UnsupportedEncodingException;
import java.util.List;
import m3.a;
import p9.d;

/* loaded from: classes2.dex */
public final class zzahp {
    public static long zza(String str) {
        zzaho zzahoVarZzb = zzb(str);
        return zzahoVarZzb.zza().longValue() - zzahoVarZzb.zzb().longValue();
    }

    private static zzaho zzb(String str) {
        p.d(str);
        List<String> listZza = zzv.zza('.').zza((CharSequence) str);
        if (listZza.size() < 2) {
            throw new RuntimeException(a.a("Invalid idToken ", str));
        }
        try {
            return zzaho.zza(new String(d.b(listZza.get(1)), "UTF-8"));
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("Unable to decode token", e10);
        }
    }
}

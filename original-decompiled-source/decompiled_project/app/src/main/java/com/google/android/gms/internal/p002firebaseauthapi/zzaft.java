package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import java.util.Map;
import java.util.concurrent.Executor;
import p.a;
import qd.z;

/* loaded from: classes2.dex */
public final class zzaft {
    private static final Map<String, zzafv> zza = new a();

    public static z zza(String str, z zVar, zzaex zzaexVar) {
        zza(str, zzaexVar);
        return new zzafs(zVar, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzaex zzaexVar) {
        zza.put(str, new zzafv(zzaexVar, System.currentTimeMillis()));
    }

    public static boolean zza(String str, z zVar, Activity activity, Executor executor) {
        Map<String, zzafv> map = zza;
        if (map.containsKey(str)) {
            zzafv zzafvVar = map.get(str);
            if (System.currentTimeMillis() - zzafvVar.zzb < 120000) {
                zzaex zzaexVar = zzafvVar.zza;
                if (zzaexVar == null) {
                    return true;
                }
                zzaexVar.zza(zVar, activity, executor, str);
                return true;
            }
            zza(str, null);
            return false;
        }
        zza(str, null);
        return false;
    }
}

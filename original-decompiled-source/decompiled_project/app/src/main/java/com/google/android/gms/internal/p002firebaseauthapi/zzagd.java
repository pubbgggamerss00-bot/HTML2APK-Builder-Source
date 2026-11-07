package com.google.android.gms.internal.p002firebaseauthapi;

import id.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p.a;

/* loaded from: classes2.dex */
public final class zzagd {
    private static final Map<String, zzagc> zza = new a();
    private static final Map<String, List<WeakReference<zzagf>>> zzb = new a();

    private static String zza(String str, int i10, boolean z10) {
        if (z10) {
            return "http://[" + str + "]:" + i10 + "/";
        }
        return "http://" + str + ":" + i10 + "/";
    }

    public static String zzb(String str) {
        zzagc zzagcVar;
        Map<String, zzagc> map = zza;
        synchronized (map) {
            zzagcVar = map.get(str);
        }
        return k3.a.a(zzagcVar != null ? m3.a.a("", zza(zzagcVar.zzb(), zzagcVar.zza(), zzagcVar.zzb().contains(":"))) : "https://", "www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    public static String zzc(String str) {
        zzagc zzagcVar;
        Map<String, zzagc> map = zza;
        synchronized (map) {
            zzagcVar = map.get(str);
        }
        return k3.a.a(zzagcVar != null ? m3.a.a("", zza(zzagcVar.zzb(), zzagcVar.zza(), zzagcVar.zzb().contains(":"))) : "https://", "identitytoolkit.googleapis.com/v2");
    }

    public static String zzd(String str) {
        zzagc zzagcVar;
        Map<String, zzagc> map = zza;
        synchronized (map) {
            zzagcVar = map.get(str);
        }
        return k3.a.a(zzagcVar != null ? m3.a.a("", zza(zzagcVar.zzb(), zzagcVar.zza(), zzagcVar.zzb().contains(":"))) : "https://", "securetoken.googleapis.com/v1");
    }

    public static String zza(String str) {
        zzagc zzagcVar;
        Map<String, zzagc> map = zza;
        synchronized (map) {
            zzagcVar = map.get(str);
        }
        if (zzagcVar != null) {
            return k3.a.a(zza(zzagcVar.zzb(), zzagcVar.zza(), zzagcVar.zzb().contains(":")), "emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static void zza(String str, zzagf zzagfVar) {
        Map<String, List<WeakReference<zzagf>>> map = zzb;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    map.get(str).add(new WeakReference<>(zzagfVar));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference(zzagfVar));
                    map.put(str, arrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean zza(e eVar) {
        Map<String, zzagc> map = zza;
        eVar.a();
        return map.containsKey(eVar.f14482c.f14492a);
    }

    public static void zza(e eVar, String str, int i10) {
        eVar.a();
        String str2 = eVar.f14482c.f14492a;
        Map<String, zzagc> map = zza;
        synchronized (map) {
            map.put(str2, new zzagc(str, i10));
        }
        Map<String, List<WeakReference<zzagf>>> map2 = zzb;
        synchronized (map2) {
            try {
                if (map2.containsKey(str2)) {
                    Iterator<WeakReference<zzagf>> it = map2.get(str2).iterator();
                    boolean z10 = false;
                    while (it.hasNext()) {
                        zzagf zzagfVar = it.next().get();
                        if (zzagfVar != null) {
                            zzagfVar.zza();
                            z10 = true;
                        }
                    }
                    if (!z10) {
                        zza.remove(str2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

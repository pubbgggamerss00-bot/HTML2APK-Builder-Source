package com.google.android.recaptcha.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.s;
import qg.j0;

/* loaded from: classes2.dex */
final class zzat extends s implements eh.a {
    public static final zzat zza = new zzat();

    public zzat() {
        super(0);
    }

    public static final Map zza() {
        Map map = zzav.zzc;
        LinkedHashMap linkedHashMap = new LinkedHashMap(j0.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((zzaw) entry.getValue()).zzb());
        }
        return linkedHashMap;
    }

    @Override // eh.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        return zza();
    }
}

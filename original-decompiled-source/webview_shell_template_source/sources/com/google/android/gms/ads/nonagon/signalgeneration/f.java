package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f extends LinkedHashMap {
    public final /* synthetic */ zzv s;

    public f(zzv zzvVar) {
        this.s = zzvVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        synchronized (this.s) {
            try {
                int size = size();
                zzv zzvVar = this.s;
                if (size <= zzvVar.zza) {
                    return false;
                }
                zzvVar.zzf.add(new Pair((String) entry.getKey(), ((zzu) entry.getValue()).zzb));
                return size() > this.s.zza;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

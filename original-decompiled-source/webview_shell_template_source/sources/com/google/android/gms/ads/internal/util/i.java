package com.google.android.gms.ads.internal.util;

import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final String f2364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzcb f2365b;

    public i(zzcb zzcbVar, String str) {
        this.f2365b = zzcbVar;
        this.f2364a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f2365b) {
            try {
                for (zzbz zzbzVar : this.f2365b.zzb) {
                    String str2 = this.f2364a;
                    Map map = zzbzVar.zza;
                    if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                        com.google.android.gms.ads.internal.zzv.zzp().d().zzE(false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzcb {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final Context zzc;

    public zzcb(Context context) {
        this.zzc = context;
    }

    public final synchronized void zzb(String str) {
        try {
            if (this.zza.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(str, 0);
            i iVar = new i(this, str);
            this.zza.put(str, iVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(iVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.ma)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            Map mapZzw = zzs.zzw((String) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.ra));
            Iterator it = mapZzw.keySet().iterator();
            while (it.hasNext()) {
                zzb((String) it.next());
            }
            zzd(new zzbz(mapZzw));
        }
    }

    public final synchronized void zzd(zzbz zzbzVar) {
        this.zzb.add(zzbzVar);
    }
}

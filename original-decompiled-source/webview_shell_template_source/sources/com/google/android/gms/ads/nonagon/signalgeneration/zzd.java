package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzd {
    private SharedPreferences zza;
    private SharedPreferences.Editor zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    public zzd(Context context) {
        this.zzc = context;
    }

    private final void zzk() {
        synchronized (this.zzd) {
            try {
                if (this.zza != null) {
                    return;
                }
                SharedPreferences sharedPreferences = this.zzc.getSharedPreferences("query_info_shared_prefs", 0);
                this.zza = sharedPreferences;
                this.zzb = sharedPreferences.edit();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int zza() {
        int i6;
        zzk();
        synchronized (this.zzd) {
            i6 = this.zza.getInt("aav", -1);
        }
        return i6;
    }

    public final int zzb() {
        int i6;
        zzk();
        synchronized (this.zzd) {
            i6 = this.zza.getInt("vc", -1);
        }
        return i6;
    }

    public final String zzc(String str) {
        String string;
        zzk();
        synchronized (this.zzd) {
            string = this.zza.getString(str, null);
            this.zzb.remove(str).commit();
        }
        return string;
    }

    public final String zzd() {
        String string;
        zzk();
        synchronized (this.zzd) {
            string = this.zza.getString("dm", null);
        }
        return string;
    }

    public final String zze() {
        String string;
        zzk();
        synchronized (this.zzd) {
            string = this.zza.getString("pn", null);
        }
        return string;
    }

    public final Map zzf() {
        HashMap map;
        zzk();
        synchronized (this.zzd) {
            try {
                Map<String, ?> all = this.zza.getAll();
                map = new HashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    if ((entry.getValue() instanceof String) && !Objects.equals(entry.getKey(), "pn") && !Objects.equals(entry.getKey(), "vc") && !Objects.equals(entry.getKey(), "dm") && !Objects.equals(entry.getKey(), "aav")) {
                        map.put(entry.getKey(), (String) entry.getValue());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }

    public final void zzg() {
        zzk();
        synchronized (this.zzd) {
            this.zzb.clear().commit();
        }
    }

    public final void zzh(String str, String str2) {
        zzk();
        synchronized (this.zzd) {
            this.zzb.putString(str, str2).commit();
        }
    }

    public final void zzi(String str, int i6, String str2, int i7) {
        zzk();
        synchronized (this.zzd) {
            this.zzb.putString("pn", str).putInt("vc", i6).putString("dm", str2).putInt("aav", i7).commit();
        }
    }

    public final boolean zzj(String str) {
        boolean zContains;
        zzk();
        synchronized (this.zzd) {
            zContains = this.zza.contains(str);
        }
        return zContains;
    }
}

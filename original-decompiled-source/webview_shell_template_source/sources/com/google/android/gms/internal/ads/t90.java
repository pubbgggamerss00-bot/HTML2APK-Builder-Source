package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t90 implements yt {
    public static final Integer a(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            zzo.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b2  */
    @Override // com.google.android.gms.internal.ads.yt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Object obj, Map map) {
        s90 s90Var;
        j90 j90Var;
        s90 x90Var;
        p80 p80Var = (p80) obj;
        if (zzo.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            zzo.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        k90 k90VarZzz = zzv.zzz();
        if (map.containsKey("abort")) {
            if (k90VarZzz.c(p80Var)) {
                return;
            }
            zzo.zzj("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer numA = a("periodicReportIntervalMs", map);
        a("exoPlayerRenderingIntervalMs", map);
        a("exoPlayerIdleIntervalMs", map);
        o80 o80Var = new o80((String) map.get("flags"));
        j90 j90Var2 = null;
        int i6 = 0;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                        strArr2[i7] = jSONArray.getString(i7);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    zzo.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (o80Var.f7640k) {
                ArrayList arrayList = k90VarZzz.s;
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj2 = arrayList.get(i8);
                    i8++;
                    j90Var = (j90) obj2;
                    if (j90Var.f5983a == p80Var && str.equals(j90Var.f5985c)) {
                        break;
                    }
                }
                j90Var = null;
                if (j90Var == null) {
                    zzo.zzj("Precache task is already running.");
                    return;
                }
                if (p80Var.zzj() == null) {
                    zzo.zzj("Precache requires a dependency provider.");
                    return;
                }
                Integer numA2 = a("player", map);
                if (numA2 == null) {
                    numA2 = 0;
                }
                if (numA != null) {
                    p80Var.zzA(numA.intValue());
                }
                int iIntValue = numA2.intValue();
                d90 d90Var = p80Var.zzj().zzb;
                if (iIntValue > 0) {
                    int i9 = i80.f5598t.get();
                    if (i9 < o80Var.f7637g) {
                        z90 z90Var = new z90(p80Var);
                        ja0 ja0Var = new ja0(p80Var.getContext(), o80Var, (p80) z90Var.f8853u.get(), null);
                        zzo.zzi("ExoPlayerAdapter initialized.");
                        z90Var.f11225v = ja0Var;
                        ja0Var.D = z90Var;
                        x90Var = z90Var;
                    } else {
                        if (((Boolean) zzbe.zzc().a(zn.f11440n)).booleanValue()) {
                            i9 = x90.G.get();
                        }
                        x90Var = i9 < o80Var.f7632b ? new x90(p80Var, o80Var) : new v90(p80Var);
                    }
                } else {
                    u90 u90Var = new u90(p80Var);
                    File cacheDir = u90Var.s.getCacheDir();
                    if (cacheDir == null) {
                        zzo.zzj("Context.getCacheDir() returned null");
                        x90Var = u90Var;
                    } else {
                        int i10 = pj1.f8098a;
                        File file = new File(new File(cacheDir, "admobVideoStreams").getPath());
                        u90Var.f9505v = file;
                        if (!file.isDirectory() && !file.mkdirs()) {
                            zzo.zzj("Could not create preload cache directory at ".concat(String.valueOf(file.getAbsolutePath())));
                            u90Var.f9505v = null;
                            x90Var = u90Var;
                        } else if (file.setReadable(true, false)) {
                            x90Var = u90Var;
                            if (!file.setExecutable(true, false)) {
                                zzo.zzj("Could not set cache file permissions at ".concat(String.valueOf(file.getAbsolutePath())));
                                u90Var.f9505v = null;
                                x90Var = u90Var;
                            }
                        }
                    }
                }
                new j90(p80Var, x90Var, str, strArr).zzb();
                s90Var = x90Var;
            } else {
                ArrayList arrayList2 = k90VarZzz.s;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    j90Var = (j90) obj3;
                    if (j90Var.f5983a == p80Var) {
                        break;
                    }
                }
                j90Var = null;
                if (j90Var == null) {
                }
            }
        } else {
            ArrayList arrayList3 = k90VarZzz.s;
            int size3 = arrayList3.size();
            while (true) {
                if (i6 >= size3) {
                    break;
                }
                Object obj4 = arrayList3.get(i6);
                i6++;
                j90 j90Var3 = (j90) obj4;
                if (j90Var3.f5983a == p80Var) {
                    j90Var2 = j90Var3;
                    break;
                }
            }
            if (j90Var2 == null) {
                zzo.zzj("Precache must specify a source.");
                return;
            }
            s90Var = j90Var2.f5984b;
        }
        Integer numA3 = a("minBufferMs", map);
        if (numA3 != null) {
            s90Var.n(numA3.intValue());
        }
        Integer numA4 = a("maxBufferMs", map);
        if (numA4 != null) {
            s90Var.m(numA4.intValue());
        }
        Integer numA5 = a("bufferForPlaybackMs", map);
        if (numA5 != null) {
            s90Var.k(numA5.intValue());
        }
        Integer numA6 = a("bufferForPlaybackAfterRebufferMs", map);
        if (numA6 != null) {
            s90Var.l(numA6.intValue());
        }
    }
}

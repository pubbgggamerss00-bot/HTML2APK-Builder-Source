package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zt0 {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f11575a;

    /* renamed from: b, reason: collision with root package name */
    public final e70 f11576b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f11577c;

    public zt0(Context context, fu0 fu0Var, e70 e70Var, ec1 ec1Var, String str, String str2, zzk zzkVar) {
        ActivityManager.MemoryInfo memoryInfoZzc;
        zzm zzmVar = ec1Var.f4209d;
        this.f11577c = new Bundle();
        fu0Var.getClass();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(fu0Var.f5483a);
        this.f11575a = concurrentHashMap;
        this.f11576b = e70Var;
        concurrentHashMap.put("ad_format", str2.toUpperCase(Locale.ROOT));
        if (((Boolean) zzbe.zzc().a(zn.s9)).booleanValue()) {
            int iZzp = zzkVar.zzp();
            int i6 = iZzp - 1;
            if (iZzp == 0) {
                throw null;
            }
            concurrentHashMap.put("asv", i6 != 0 ? i6 != 1 ? "na" : "2" : "1");
        }
        if (((Boolean) zzbe.zzc().a(zn.f11424k2)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            a("rt_f", String.valueOf(runtime.freeMemory()));
            a("rt_m", String.valueOf(runtime.maxMemory()));
            a("rt_t", String.valueOf(runtime.totalMemory()));
            a("wv_c", String.valueOf(zzv.zzp().f2954j.get()));
            if (((Boolean) zzbe.zzc().a(zn.f11455p2)).booleanValue() && (memoryInfoZzc = zzf.zzc(context)) != null) {
                a("mem_avl", String.valueOf(memoryInfoZzc.availMem));
                a("mem_tt", String.valueOf(memoryInfoZzc.totalMem));
                a("low_m", true != memoryInfoZzc.lowMemory ? "0" : "1");
            }
        }
        if (((Boolean) zzbe.zzc().a(zn.M6)).booleanValue()) {
            int iZzf = zzaa.zzf(ec1Var) - 1;
            if (iZzf == 0) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("scar", "false");
                return;
            }
            if (iZzf == 1) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("se", "query_g");
            } else if (iZzf == 2) {
                concurrentHashMap.put("se", "r_adinfo");
            } else if (iZzf != 3) {
                concurrentHashMap.put("se", "r_both");
            } else {
                concurrentHashMap.put("se", "r_adstring");
            }
            concurrentHashMap.put("scar", "true");
            a("ragent", zzmVar.zzp);
            a("rtype", zzaa.zzb(zzaa.zzc(zzmVar)));
        }
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f11575a.put(str, str2);
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            a("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            a("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}

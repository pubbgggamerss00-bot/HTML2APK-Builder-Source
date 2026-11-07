package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bo {

    /* renamed from: a, reason: collision with root package name */
    public final String f3230a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3231b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3232c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3233d;

    /* JADX WARN: Multi-variable type inference failed */
    public bo(Context context, String str) {
        this.f3232c = context;
        this.f3233d = str;
        fq fqVar = (fq) hq.f5455a.get();
        String strA = "https://csi.gstatic.com/csi";
        if (fqVar != null) {
            strA = fqVar.a("gads:sdk_csi_server", "https://csi.gstatic.com/csi");
        } else if (hq.a() != null) {
            hq.a().zza();
        }
        this.f3230a = strA;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f3231b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        zzv.zzq();
        linkedHashMap.put("device", zzs.zzs());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        zzv.zzq();
        linkedHashMap.put("is_lite_sdk", true != zzs.zzF(context) ? "0" : "1");
        x30 x30VarZzn = zzv.zzn();
        x30VarZzn.getClass();
        c5.a aVarU = i70.f5586a.u(new oe(x30VarZzn, context, 1));
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((v30) aVarU.get()).f9697j));
            linkedHashMap.put("network_fine", Integer.toString(((v30) aVarU.get()).f9698k));
        } catch (Exception e6) {
            zzv.zzp().h("CsiConfiguration.CsiConfiguration", e6);
        }
        if (((Boolean) zzbe.zzc().a(zn.ib)).booleanValue()) {
            LinkedHashMap linkedHashMap2 = this.f3231b;
            zzv.zzq();
            linkedHashMap2.put("is_bstar", true != zzs.zzC(context) ? "0" : "1");
        }
        if (((Boolean) zzbe.zzc().a(zn.n9)).booleanValue()) {
            if (!((Boolean) zzbe.zzc().a(zn.f11479t2)).booleanValue() || rj1.j(zzv.zzp().f2952g)) {
                return;
            }
            this.f3231b.put("plugin", zzv.zzp().f2952g);
        }
    }
}

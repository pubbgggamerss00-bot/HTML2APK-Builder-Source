package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbk;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wt0 implements yl0, jl0, rk0, tn0 {
    public final zt0 s;

    /* renamed from: t, reason: collision with root package name */
    public final fu0 f10268t;

    /* renamed from: u, reason: collision with root package name */
    public final int f10269u;

    public wt0(zt0 zt0Var, fu0 fu0Var, int i6) {
        this.s = zt0Var;
        this.f10268t = fu0Var;
        this.f10269u = i6;
    }

    public final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j6 = bundle.getLong(str);
            if (j6 >= 0) {
                this.s.a(str, String.valueOf(j6));
            }
        }
    }

    public final void b(Bundle bundle, bo1 bo1Var) {
        if (!((Boolean) zzbe.zzc().a(zn.f11424k2)).booleanValue() || bundle == null) {
            return;
        }
        bundle.putLong("public-api-callback", zzv.zzC().a());
        boolean zContainsKey = bundle.containsKey("ls");
        zt0 zt0Var = this.s;
        if (zContainsKey) {
            zt0Var.a("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = bo1Var.size();
        for (int i6 = 0; i6 < size; i6++) {
            yt0 yt0Var = (yt0) bo1Var.get(i6);
            long j6 = bundle.getLong(yt0Var.f11072b.s, -1L);
            long j7 = bundle.getLong(yt0Var.f11073c.s, -1L);
            if (j6 > 0 && j7 > 0) {
                zt0Var.a(yt0Var.f11071a, String.valueOf(j7 - j6));
            }
        }
        a(bundle.getBundle("client_sig_latency_key"));
        a(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) zzbe.zzc().a(zn.q7)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                zt0Var.a("sod_h", true != bundle.getBoolean("sod_h") ? "0" : "1");
            }
            if (bundle.containsKey("cmr")) {
                zt0Var.a("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yl0
    public final void b0(ac1 ac1Var) {
        zt0 zt0Var = this.s;
        zt0Var.getClass();
        androidx.fragment.app.f0 f0Var = ac1Var.f2648b;
        List list = (List) f0Var.s;
        if (!list.isEmpty()) {
            tb1 tb1Var = (tb1) list.get(0);
            zt0Var.a("ad_format", tb1.a(tb1Var.f9173b));
            if (tb1Var.f9173b == 6) {
                zt0Var.f11575a.put("as", true != zt0Var.f11576b.f4146g ? "0" : "1");
            }
        }
        zt0Var.a("gqi", ((vb1) f0Var.f1103u).f9774b);
    }

    @Override // com.google.android.gms.internal.ads.yl0
    public final void k(r30 r30Var) {
        this.s.b(r30Var.s);
    }

    @Override // com.google.android.gms.internal.ads.rk0
    public final void k0(zze zzeVar) {
        zt0 zt0Var = this.s;
        zt0Var.f11575a.put("action", "ftl");
        zt0Var.a("ftl", String.valueOf(zzeVar.zza));
        zt0Var.a("ed", zzeVar.zzc);
        if (((Boolean) zzbe.zzc().a(zn.Y6)).booleanValue()) {
            zt0Var.a("emsg", zzeVar.zzb);
        }
        this.f10268t.b(zt0Var.f11575a, false);
    }

    @Override // com.google.android.gms.internal.ads.jl0
    public final void t() {
        zt0 zt0Var = this.s;
        ConcurrentHashMap concurrentHashMap = zt0Var.f11575a;
        ConcurrentHashMap concurrentHashMap2 = zt0Var.f11575a;
        concurrentHashMap.put("action", "loaded");
        b(zt0Var.f11577c, yt0.f11070e);
        if (((Boolean) zzbe.zzc().a(zn.wc)).booleanValue()) {
            concurrentHashMap2.put("mafe", true != androidx.activity.c0.f("MUTE_AUDIO") ? "0" : "1");
        }
        this.f10268t.b(concurrentHashMap2, false);
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final void zze(zzbk zzbkVar) {
        String str;
        if (((Boolean) zzbe.zzc().a(zn.M6)).booleanValue()) {
            boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.q7)).booleanValue();
            zt0 zt0Var = this.s;
            if (zBooleanValue) {
                zt0Var.f11575a.put("sgw", String.valueOf(this.f10269u));
            }
            fu0 fu0Var = this.f10268t;
            if (zzbkVar == null) {
                ConcurrentHashMap concurrentHashMap = zt0Var.f11575a;
                ConcurrentHashMap concurrentHashMap2 = zt0Var.f11575a;
                concurrentHashMap.put("action", "sgs");
                concurrentHashMap2.put("request_id", "-1");
                fu0Var.b(concurrentHashMap2, false);
                return;
            }
            r30 r30Var = zzbkVar.zzd;
            Bundle bundle = zzbkVar.zze;
            if (r30Var != null) {
                b(r30Var.E, yt0.f11069d);
            } else if (bundle != null && !bundle.isEmpty()) {
                b(bundle, yt0.f11069d);
            }
            try {
                JSONObject jSONObject = new JSONObject(TextUtils.isEmpty(zzbkVar.zzc) ? zzbkVar.zzb : zzbkVar.zzc);
                ConcurrentHashMap concurrentHashMap3 = zt0Var.f11575a;
                ConcurrentHashMap concurrentHashMap4 = zt0Var.f11575a;
                concurrentHashMap3.put("action", "sgs");
                if (((Boolean) zzbe.zzc().a(zn.z9)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e6) {
                        zzo.zzh("Error retrieving JSONObject from the requestJson, ", e6);
                    }
                } else {
                    str = "na";
                }
                concurrentHashMap4.put("tpc", str);
                r30 r30Var2 = zzbkVar.zzd;
                if (r30Var2 != null) {
                    zt0Var.b(r30Var2.s);
                }
                fu0Var.b(concurrentHashMap4, false);
            } catch (JSONException unused) {
                ConcurrentHashMap concurrentHashMap5 = zt0Var.f11575a;
                ConcurrentHashMap concurrentHashMap6 = zt0Var.f11575a;
                concurrentHashMap5.put("action", "sgf");
                concurrentHashMap6.put("sgf_reason", "request_invalid");
                fu0Var.b(concurrentHashMap6, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final void zzf(String str) {
        if (((Boolean) zzbe.zzc().a(zn.M6)).booleanValue()) {
            boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.q7)).booleanValue();
            zt0 zt0Var = this.s;
            if (zBooleanValue) {
                zt0Var.f11575a.put("sgw", String.valueOf(this.f10269u));
            }
            zt0Var.f11575a.put("action", "sgf");
            zt0Var.a("sgf_reason", str);
            this.f10268t.b(zt0Var.f11575a, false);
        }
    }
}

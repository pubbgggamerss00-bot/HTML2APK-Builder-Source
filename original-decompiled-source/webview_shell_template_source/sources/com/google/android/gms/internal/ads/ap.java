package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.google.android.gms.ads.nonagon.signalgeneration.zzo;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ap {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f2806a;

    /* renamed from: b, reason: collision with root package name */
    public final zzo f2807b;

    /* renamed from: c, reason: collision with root package name */
    public final zzf f2808c;

    /* renamed from: d, reason: collision with root package name */
    public final fu0 f2809d;

    /* renamed from: e, reason: collision with root package name */
    public b f2810e;

    /* renamed from: f, reason: collision with root package name */
    public yo f2811f;

    /* renamed from: g, reason: collision with root package name */
    public p.h f2812g;
    public String h;

    /* renamed from: i, reason: collision with root package name */
    public long f2813i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f2814j;

    /* renamed from: k, reason: collision with root package name */
    public JSONArray f2815k;

    /* renamed from: l, reason: collision with root package name */
    public Context f2816l;

    public ap(ScheduledExecutorService scheduledExecutorService, zzo zzoVar, zzf zzfVar, fu0 fu0Var) {
        this.f2806a = scheduledExecutorService;
        this.f2807b = zzoVar;
        this.f2808c = zzfVar;
        this.f2809d = fu0Var;
    }

    public final JSONObject a(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) wp.f10245c.c()).booleanValue() ? ((Long) wp.f10248f.c()).longValue() : 0L);
        e(jSONObject);
        if (((Boolean) wp.f10243a.c()).booleanValue()) {
            jSONObject.put("as", this.f2808c.zza());
        }
        return jSONObject;
    }

    public final JSONObject b(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) wp.f10245c.c()).booleanValue() ? ((Long) wp.f10248f.c()).longValue() : 0L);
        e(jSONObject);
        if (((Boolean) wp.f10243a.c()).booleanValue()) {
            jSONObject.put("as", this.f2808c.zza());
        }
        return jSONObject;
    }

    public final void c(String str) {
        try {
            p.h hVar = this.f2812g;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.f2814j).toString());
            e(jSONObject);
            if (((Boolean) wp.f10243a.c()).booleanValue()) {
                jSONObject.put("as", this.f2808c.zza());
            }
            hVar.a(jSONObject.toString());
            zo zoVar = new zo(this, str);
            if (((Boolean) wp.f10245c.c()).booleanValue()) {
                this.f2807b.zzg(this.f2812g, zoVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            QueryInfo.generate(this.f2816l, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zoVar);
        } catch (JSONException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error creating JSON: ", e6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(com.google.android.gms.internal.ads.zn.J9)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        ScheduledExecutorService scheduledExecutorService;
        yo yoVar = this.f2811f;
        if (yoVar == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("PACT callback is not present, please initialize the PawCustomTabsImpl.");
            return;
        }
        if (yoVar.f11030a.get()) {
            return;
        }
        if (this.h != null && this.f2812g != null && (scheduledExecutorService = this.f2806a) != null) {
            if (this.f2813i == 0 || zzv.zzC().b() > this.f2813i) {
            }
            p.h hVar = this.f2812g;
            Uri uri = Uri.parse(this.h);
            hVar.getClass();
            Bundle bundle = new Bundle();
            p.c cVar = hVar.f14054c;
            a.b bVar = hVar.f14053b;
            try {
                Bundle bundle2 = new Bundle();
                if (bundle2.isEmpty()) {
                    bundle2 = null;
                }
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                    bVar.L1(cVar, uri, bundle);
                } else {
                    bVar.G(cVar, uri);
                }
            } catch (RemoteException unused) {
            }
            scheduledExecutorService.schedule(this.f2810e, ((Long) zzbe.zzc().a(zn.K9)).longValue(), TimeUnit.MILLISECONDS);
            return;
        }
        zze.zza("PACT max retry connection duration timed out");
    }

    public final void e(JSONObject jSONObject) throws JSONException {
        try {
            if (this.f2815k == null) {
                this.f2815k = new JSONArray((String) zzbe.zzc().a(zn.M9));
            }
            jSONObject.put("eids", this.f2815k);
        } catch (JSONException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error fetching the PACT active eids JSON: ", e6);
        }
    }
}

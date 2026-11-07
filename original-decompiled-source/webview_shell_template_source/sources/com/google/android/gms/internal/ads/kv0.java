package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class kv0 implements rk0, yl0, ll0 {
    public JSONObject C;
    public JSONObject D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final sv0 s;

    /* renamed from: t, reason: collision with root package name */
    public final String f6496t;

    /* renamed from: u, reason: collision with root package name */
    public final String f6497u;

    /* renamed from: x, reason: collision with root package name */
    public mk0 f6500x;

    /* renamed from: y, reason: collision with root package name */
    public zze f6501y;

    /* renamed from: z, reason: collision with root package name */
    public String f6502z = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    public String A = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    public String B = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* renamed from: v, reason: collision with root package name */
    public int f6498v = 0;

    /* renamed from: w, reason: collision with root package name */
    public jv0 f6499w = jv0.s;

    public kv0(sv0 sv0Var, ec1 ec1Var, String str) {
        this.s = sv0Var;
        this.f6497u = str;
        this.f6496t = ec1Var.f4211f;
    }

    public static JSONObject b(zze zzeVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put("errorCode", zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : b(zzeVar2));
        return jSONObject;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectC;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.f6499w);
        jSONObject.put("format", tb1.a(this.f6498v));
        if (((Boolean) zzbe.zzc().a(zn.l9)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.E);
            if (this.E) {
                jSONObject.put("shown", this.F);
            }
        }
        mk0 mk0Var = this.f6500x;
        if (mk0Var != null) {
            jSONObjectC = c(mk0Var);
        } else {
            zze zzeVar = this.f6501y;
            JSONObject jSONObjectC2 = null;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                mk0 mk0Var2 = (mk0) iBinder;
                jSONObjectC2 = c(mk0Var2);
                if (mk0Var2.f7176w.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(b(this.f6501y));
                    jSONObjectC2.put("errors", jSONArray);
                }
            }
            jSONObjectC = jSONObjectC2;
        }
        jSONObject.put("responseInfo", jSONObjectC);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.yl0
    public final void b0(ac1 ac1Var) {
        if (this.s.f()) {
            if (!((List) ac1Var.f2648b.s).isEmpty()) {
                this.f6498v = ((tb1) ((List) ac1Var.f2648b.s).get(0)).f9173b;
            }
            if (!TextUtils.isEmpty(((vb1) ac1Var.f2648b.f1103u).f9783l)) {
                this.f6502z = ((vb1) ac1Var.f2648b.f1103u).f9783l;
            }
            if (!TextUtils.isEmpty(((vb1) ac1Var.f2648b.f1103u).f9784m)) {
                this.A = ((vb1) ac1Var.f2648b.f1103u).f9784m;
            }
            if (((vb1) ac1Var.f2648b.f1103u).f9787p.length() > 0) {
                this.D = ((vb1) ac1Var.f2648b.f1103u).f9787p;
            }
            if (((Boolean) zzbe.zzc().a(zn.h9)).booleanValue()) {
                if (this.s.f9029w >= ((Long) zzbe.zzc().a(zn.i9)).longValue()) {
                    this.G = true;
                    return;
                }
                if (!TextUtils.isEmpty(((vb1) ac1Var.f2648b.f1103u).f9785n)) {
                    this.B = ((vb1) ac1Var.f2648b.f1103u).f9785n;
                }
                if (((vb1) ac1Var.f2648b.f1103u).f9786o.length() > 0) {
                    this.C = ((vb1) ac1Var.f2648b.f1103u).f9786o;
                }
                sv0 sv0Var = this.s;
                JSONObject jSONObject = this.C;
                int length = jSONObject != null ? jSONObject.toString().length() : 0;
                if (!TextUtils.isEmpty(this.B)) {
                    length += this.B.length();
                }
                long j6 = length;
                synchronized (sv0Var) {
                    sv0Var.f9029w += j6;
                }
            }
        }
    }

    public final JSONObject c(mk0 mk0Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", mk0Var.s);
        jSONObject.put("responseSecsSinceEpoch", mk0Var.f7177x);
        jSONObject.put("responseId", mk0Var.f7173t);
        if (((Boolean) zzbe.zzc().a(zn.e9)).booleanValue()) {
            String str = mk0Var.f7178y;
            if (!TextUtils.isEmpty(str)) {
                zzo.zze("Bidding data: ".concat(String.valueOf(str)));
                jSONObject.put("biddingData", new JSONObject(str));
            }
        }
        if (!TextUtils.isEmpty(this.f6502z)) {
            jSONObject.put("adRequestUrl", this.f6502z);
        }
        if (!TextUtils.isEmpty(this.A)) {
            jSONObject.put("postBody", this.A);
        }
        if (!TextUtils.isEmpty(this.B)) {
            jSONObject.put("adResponseBody", this.B);
        }
        Object obj = this.C;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.D;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) zzbe.zzc().a(zn.h9)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.G);
        }
        JSONArray jSONArray = new JSONArray();
        for (zzw zzwVar : mk0Var.f7176w) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzwVar.zza);
            jSONObject2.put("latencyMillis", zzwVar.zzb);
            if (((Boolean) zzbe.zzc().a(zn.f9)).booleanValue()) {
                jSONObject2.put("credentials", zzbc.zzb().zzi(zzwVar.zzd));
            }
            zze zzeVar = zzwVar.zzc;
            jSONObject2.put("error", zzeVar == null ? null : b(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.ll0
    public final void c0(ti0 ti0Var) {
        sv0 sv0Var = this.s;
        if (sv0Var.f()) {
            this.f6500x = ti0Var.f9293f;
            this.f6499w = jv0.f6167t;
            if (((Boolean) zzbe.zzc().a(zn.l9)).booleanValue()) {
                sv0Var.b(this.f6496t, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yl0
    public final void k(r30 r30Var) {
        if (((Boolean) zzbe.zzc().a(zn.l9)).booleanValue()) {
            return;
        }
        sv0 sv0Var = this.s;
        if (sv0Var.f()) {
            sv0Var.b(this.f6496t, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.rk0
    public final void k0(zze zzeVar) {
        sv0 sv0Var = this.s;
        if (sv0Var.f()) {
            this.f6499w = jv0.f6168u;
            this.f6501y = zzeVar;
            if (((Boolean) zzbe.zzc().a(zn.l9)).booleanValue()) {
                sv0Var.b(this.f6496t, this);
            }
        }
    }
}

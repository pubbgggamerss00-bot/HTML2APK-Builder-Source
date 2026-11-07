package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzv;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c41 extends g00 {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f3395x = 0;
    public final e00 s;

    /* renamed from: t, reason: collision with root package name */
    public final o70 f3396t;

    /* renamed from: u, reason: collision with root package name */
    public final JSONObject f3397u;

    /* renamed from: v, reason: collision with root package name */
    public final long f3398v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3399w;

    public c41(String str, e00 e00Var, o70 o70Var, long j6) throws JSONException {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
        JSONObject jSONObject = new JSONObject();
        this.f3397u = jSONObject;
        this.f3399w = false;
        this.f3396t = o70Var;
        this.s = e00Var;
        this.f3398v = j6;
        try {
            jSONObject.put("adapter_version", e00Var.zzf().toString());
            jSONObject.put("sdk_version", e00Var.zzg().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized void D(zze zzeVar) {
        i1(2, zzeVar.zzb);
    }

    public final synchronized void i1(int i6, String str) {
        try {
            if (this.f3399w) {
                return;
            }
            try {
                this.f3397u.put("signal_error", str);
                if (((Boolean) zzbe.zzc().a(zn.J1)).booleanValue()) {
                    this.f3397u.put("latency", zzv.zzC().b() - this.f3398v);
                }
                if (((Boolean) zzbe.zzc().a(zn.I1)).booleanValue()) {
                    this.f3397u.put("signal_error_code", i6);
                }
            } catch (JSONException unused) {
            }
            this.f3396t.a(this.f3397u);
            this.f3399w = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized void zze(String str) {
        if (this.f3399w) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            this.f3397u.put("signals", str);
            if (((Boolean) zzbe.zzc().a(zn.J1)).booleanValue()) {
                this.f3397u.put("latency", zzv.zzC().b() - this.f3398v);
            }
            if (((Boolean) zzbe.zzc().a(zn.I1)).booleanValue()) {
                this.f3397u.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f3396t.a(this.f3397u);
        this.f3399w = true;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized void zzf(String str) {
        i1(2, str);
    }
}

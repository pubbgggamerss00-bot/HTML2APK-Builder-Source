package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.de1;
import com.google.android.gms.internal.ads.he1;
import com.google.android.gms.internal.ads.i60;
import com.google.android.gms.internal.ads.mp;
import com.google.android.gms.internal.ads.p60;
import com.google.android.gms.internal.ads.zn;
import com.google.android.gms.internal.ads.zr1;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a implements zr1 {
    public final /* synthetic */ c5.a s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p60 f2376t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i60 f2377u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ de1 f2378v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zzau f2379w;

    public a(zzau zzauVar, c5.a aVar, p60 p60Var, i60 i60Var, de1 de1Var) {
        this.s = aVar;
        this.f2376t = p60Var;
        this.f2377u = i60Var;
        this.f2378v = de1Var;
        this.f2379w = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2a(Object obj) {
        zzbk zzbkVar = (zzbk) obj;
        he1 he1VarZzr = zzau.zzr(this.s, this.f2376t);
        zzau zzauVar = this.f2379w;
        zzauVar.zzG.set(true);
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.x7)).booleanValue();
        i60 i60Var = this.f2377u;
        de1 de1Var = this.f2378v;
        if (!zBooleanValue) {
            if (i60Var != null) {
                try {
                    i60Var.zzb("QueryInfo generation has been disabled.");
                } catch (RemoteException e6) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("QueryInfo generation has been disabled.".concat(e6.toString()));
                }
            }
            if (!((Boolean) mp.f7201e.c()).booleanValue() || he1VarZzr == null) {
                return;
            }
            de1Var.e("QueryInfo generation has been disabled.");
            de1Var.s(false);
            he1VarZzr.a(de1Var);
            he1VarZzr.h();
            return;
        }
        try {
            try {
                if (zzbkVar == null) {
                    if (i60Var != null) {
                        i60Var.d2(null, null, null);
                    }
                    de1Var.s(true);
                    if (!((Boolean) mp.f7201e.c()).booleanValue() || he1VarZzr == null) {
                        return;
                    }
                    he1VarZzr.a(de1Var);
                    he1VarZzr.h();
                    return;
                }
                try {
                    if (TextUtils.isEmpty((!TextUtils.isEmpty(zzbkVar.zzc) ? new JSONObject(zzbkVar.zzc) : new JSONObject(zzbkVar.zzb)).optString("request_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED))) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("The request ID is empty in request JSON.");
                        if (i60Var != null) {
                            i60Var.zzb("Internal error: request ID is empty in request JSON.");
                        }
                        de1Var.e("Request ID empty");
                        de1Var.s(false);
                        if (!((Boolean) mp.f7201e.c()).booleanValue() || he1VarZzr == null) {
                            return;
                        }
                        he1VarZzr.a(de1Var);
                        he1VarZzr.h();
                        return;
                    }
                    Bundle bundle = zzbkVar.zzf;
                    if (zzauVar.zzu && bundle != null && bundle.getInt(zzauVar.zzw, -1) == -1) {
                        bundle.putInt(zzauVar.zzw, zzauVar.zzx.get());
                    }
                    if (zzauVar.zzt && bundle != null && TextUtils.isEmpty(bundle.getString(zzauVar.zzv))) {
                        if (TextUtils.isEmpty(zzauVar.zzz)) {
                            zzauVar.zzz = com.google.android.gms.ads.internal.zzv.zzq().zzc(zzauVar.zzg, zzauVar.zzy.afmaVersion);
                        }
                        bundle.putString(zzauVar.zzv, zzauVar.zzz);
                    }
                    if (i60Var != null) {
                        if (TextUtils.isEmpty(zzbkVar.zzc)) {
                            i60Var.d2(zzbkVar.zza, bundle, zzbkVar.zzb);
                        } else {
                            i60Var.d2(zzbkVar.zza, bundle, zzbkVar.zzc);
                        }
                    }
                    de1Var.s(true);
                    if (!((Boolean) mp.f7201e.c()).booleanValue() || he1VarZzr == null) {
                        return;
                    }
                    he1VarZzr.a(de1Var);
                    he1VarZzr.h();
                } catch (JSONException e7) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to create JSON object from the request string.");
                    if (i60Var != null) {
                        i60Var.zzb("Internal error for request JSON: " + e7.toString());
                    }
                    de1Var.g(e7);
                    de1Var.s(false);
                    com.google.android.gms.ads.internal.zzv.zzp().h("SignalGeneratorImpl.generateSignals.onSuccess", e7);
                    if (!((Boolean) mp.f7201e.c()).booleanValue() || he1VarZzr == null) {
                        return;
                    }
                    he1VarZzr.a(de1Var);
                    he1VarZzr.h();
                }
            } catch (RemoteException e8) {
                de1Var.g(e8);
                de1Var.s(false);
                com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e8);
                com.google.android.gms.ads.internal.zzv.zzp().h("SignalGeneratorImpl.generateSignals.onSuccess", e8);
                if (!((Boolean) mp.f7201e.c()).booleanValue() || he1VarZzr == null) {
                    return;
                }
                he1VarZzr.a(de1Var);
                he1VarZzr.h();
            }
        } catch (Throwable th) {
            if (((Boolean) mp.f7201e.c()).booleanValue() && he1VarZzr != null) {
                he1VarZzr.a(de1Var);
                he1VarZzr.h();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public final void j(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.C7)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().g("SignalGeneratorImpl.generateSignals", th);
        } else {
            com.google.android.gms.ads.internal.zzv.zzp().h("SignalGeneratorImpl.generateSignals", th);
        }
        he1 he1VarZzr = zzau.zzr(this.s, this.f2376t);
        if (((Boolean) mp.f7201e.c()).booleanValue() && he1VarZzr != null) {
            de1 de1Var = this.f2378v;
            de1Var.g(th);
            de1Var.s(false);
            he1VarZzr.a(de1Var);
            he1VarZzr.h();
        }
        i60 i60Var = this.f2377u;
        if (i60Var == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            i60Var.zzb(message);
        } catch (RemoteException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }
}

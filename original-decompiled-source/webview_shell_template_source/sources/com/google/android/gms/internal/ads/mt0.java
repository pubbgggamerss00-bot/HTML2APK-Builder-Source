package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mt0 {

    /* renamed from: a, reason: collision with root package name */
    public final pc1 f7220a;

    /* renamed from: b, reason: collision with root package name */
    public final lt0 f7221b;

    public mt0(pc1 pc1Var, lt0 lt0Var) {
        this.f7220a = pc1Var;
        this.f7221b = lt0Var;
    }

    public final e00 a(String str) throws RemoteException {
        gy gyVar = (gy) ((AtomicReference) this.f7220a.f8029c).get();
        if (gyVar == null) {
            zzo.zzj("Unexpected call to adapter creator.");
            throw new RemoteException();
        }
        e00 e00VarE = gyVar.e(str);
        lt0 lt0Var = this.f7221b;
        synchronized (lt0Var) {
            if (lt0Var.f6851a.containsKey(str)) {
                return e00VarE;
            }
            try {
                lt0Var.f6851a.put(str, new kt0(str, e00VarE.zzf(), e00VarE.zzg(), true));
                return e00VarE;
            } catch (Throwable unused) {
                return e00VarE;
            }
        }
    }

    public final rc1 b(String str, JSONObject jSONObject) throws gc1 {
        jy jyVarZzb;
        lt0 lt0Var = this.f7221b;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                jyVarZzb = new fz(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                jyVarZzb = new fz(new zzbrw());
            } else {
                gy gyVar = (gy) ((AtomicReference) this.f7220a.f8029c).get();
                if (gyVar == null) {
                    zzo.zzj("Unexpected call to adapter creator.");
                    throw new RemoteException();
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        jyVarZzb = gyVar.zze(string) ? gyVar.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : gyVar.f(string) ? gyVar.zzb(string) : gyVar.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e6) {
                        zzo.zzh("Invalid custom event.", e6);
                    }
                } else {
                    jyVarZzb = gyVar.zzb(str);
                }
            }
            rc1 rc1Var = new rc1(jyVarZzb);
            lt0Var.b(str, rc1Var);
            return rc1Var;
        } catch (Throwable th) {
            if (((Boolean) zzbe.zzc().a(zn.k9)).booleanValue()) {
                lt0Var.b(str, null);
            }
            throw new gc1(th);
        }
    }
}

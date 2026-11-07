package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wr0 extends us {
    public final String s;

    /* renamed from: t, reason: collision with root package name */
    public final fp0 f10255t;

    /* renamed from: u, reason: collision with root package name */
    public final jp0 f10256u;

    /* renamed from: v, reason: collision with root package name */
    public final cu0 f10257v;

    public wr0(String str, fp0 fp0Var, jp0 jp0Var, cu0 cu0Var) {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
        this.s = str;
        this.f10255t = fp0Var;
        this.f10256u = jp0Var;
        this.f10257v = cu0Var;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final void B(zzdh zzdhVar) {
        fp0 fp0Var = this.f10255t;
        synchronized (fp0Var) {
            fp0Var.f4750l.q(zzdhVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final void N1(zzdr zzdrVar) {
        try {
            if (!zzdrVar.zzf()) {
                this.f10257v.b();
            }
        } catch (RemoteException e6) {
            zzo.zzf("Error in making CSI ping for reporting paid event callback", e6);
        }
        fp0 fp0Var = this.f10255t;
        synchronized (fp0Var) {
            fp0Var.D.s.set(zzdrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final boolean W0(Bundle bundle) {
        return this.f10255t.i(bundle);
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final void Y0(zzdd zzddVar) {
        fp0 fp0Var = this.f10255t;
        synchronized (fp0Var) {
            fp0Var.f4750l.n(zzddVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final boolean b() {
        List list;
        zzez zzezVar;
        jp0 jp0Var = this.f10256u;
        synchronized (jp0Var) {
            list = jp0Var.f6128f;
        }
        if (list.isEmpty()) {
            return false;
        }
        synchronized (jp0Var) {
            zzezVar = jp0Var.f6129g;
        }
        return zzezVar != null;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final void c() {
        fp0 fp0Var = this.f10255t;
        synchronized (fp0Var) {
            fp0Var.f4750l.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final void c2(Bundle bundle) {
        fp0 fp0Var = this.f10255t;
        synchronized (fp0Var) {
            fp0Var.f4750l.g(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final void d() {
        fp0 fp0Var = this.f10255t;
        synchronized (fp0Var) {
            fp0Var.f4750l.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final void g0(Bundle bundle) {
        fp0 fp0Var = this.f10255t;
        synchronized (fp0Var) {
            fp0Var.f4750l.i(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final void s0(Bundle bundle) {
        if (((Boolean) zzbe.zzc().a(zn.Oc)).booleanValue()) {
            fp0 fp0Var = this.f10255t;
            xa0 xa0VarM = fp0Var.f4749k.m();
            if (xa0VarM == null) {
                zzo.zzg("Video webview is null");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                for (String str : bundle.keySet()) {
                    jSONObject.put(str, bundle.get(str));
                }
                fp0Var.f4748j.execute(new jg0(xa0VarM, jSONObject, 1));
            } catch (JSONException e6) {
                zzo.zzh("Error reading event signals", e6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final void t0(ss ssVar) {
        fp0 fp0Var = this.f10255t;
        synchronized (fp0Var) {
            fp0Var.f4750l.l(ssVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final void zzA() {
        final fp0 fp0Var = this.f10255t;
        synchronized (fp0Var) {
            sh shVar = fp0Var.f4758u;
            if (shVar == null) {
                zzo.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            } else {
                final boolean z6 = shVar instanceof rp0;
                fp0Var.f4748j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.cp0
                    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.hq0, com.google.android.gms.internal.ads.sh] */
                    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.ads.hq0, com.google.android.gms.internal.ads.sh] */
                    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.hq0, com.google.android.gms.internal.ads.sh] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        fp0 fp0Var2 = fp0Var;
                        ?? r12 = fp0Var2.f4758u;
                        if (r12 == 0) {
                            zzo.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
                            return;
                        }
                        fp0Var2.f4750l.j(null, r12.zzf(), fp0Var2.f4758u.zzl(), fp0Var2.f4758u.zzm(), z6, fp0Var2.j(), 0);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final boolean zzH() {
        boolean zP;
        fp0 fp0Var = this.f10255t;
        synchronized (fp0Var) {
            zP = fp0Var.f4750l.p();
        }
        return zP;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final double zze() {
        double d7;
        jp0 jp0Var = this.f10256u;
        synchronized (jp0Var) {
            d7 = jp0Var.f6139r;
        }
        return d7;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final Bundle zzf() {
        return this.f10256u.h();
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final zzdy zzg() {
        if (((Boolean) zzbe.zzc().a(zn.C6)).booleanValue()) {
            return this.f10255t.f9293f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final zzeb zzh() {
        return this.f10256u.i();
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final sq zzi() {
        return this.f10256u.j();
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final wq zzj() {
        wq wqVar;
        hp0 hp0Var = this.f10255t.C;
        synchronized (hp0Var) {
            wqVar = hp0Var.f5451a;
        }
        return wqVar;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final yq zzk() {
        yq yqVar;
        jp0 jp0Var = this.f10256u;
        synchronized (jp0Var) {
            yqVar = jp0Var.s;
        }
        return yqVar;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final k3.a zzl() {
        k3.a aVar;
        jp0 jp0Var = this.f10256u;
        synchronized (jp0Var) {
            aVar = jp0Var.f6138q;
        }
        return aVar;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final k3.a zzm() {
        return new k3.b(this.f10255t);
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final String zzn() {
        return this.f10256u.p();
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final String zzo() {
        return this.f10256u.q();
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final String zzp() {
        return this.f10256u.r();
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final String zzq() {
        return this.f10256u.b();
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final String zzs() {
        String strC;
        jp0 jp0Var = this.f10256u;
        synchronized (jp0Var) {
            strC = jp0Var.c("price");
        }
        return strC;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final String zzt() {
        String strC;
        jp0 jp0Var = this.f10256u;
        synchronized (jp0Var) {
            strC = jp0Var.c("store");
        }
        return strC;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final List zzu() {
        List list;
        jp0 jp0Var = this.f10256u;
        synchronized (jp0Var) {
            list = jp0Var.f6127e;
        }
        return list;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final List zzv() {
        List list;
        if (!b()) {
            return Collections.EMPTY_LIST;
        }
        jp0 jp0Var = this.f10256u;
        synchronized (jp0Var) {
            list = jp0Var.f6128f;
        }
        return list;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final void zzx() {
        this.f10255t.p();
    }
}

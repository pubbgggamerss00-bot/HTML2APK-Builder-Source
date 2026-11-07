package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import androidx.work.ListenableWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class ow implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f7874t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f7875u;

    public /* synthetic */ ow(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f7874t = obj;
        this.f7875u = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x02da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws JSONException {
        iu0 iu0Var;
        final rc1 rc1VarB;
        Executor executor;
        final fv0 fv0Var;
        int i6 = 0;
        switch (this.s) {
            case 0:
                ((qw) this.f7874t).s.zza((String) this.f7875u);
                return;
            case 1:
                o50 o50Var = (o50) this.f7874t;
                Bitmap bitmap = (Bitmap) this.f7875u;
                e42 e42Var = g42.f4896t;
                f42 f42Var = new f42();
                bitmap.compress(Bitmap.CompressFormat.PNG, 0, f42Var);
                synchronized (o50Var.h) {
                    g82 g82Var = o50Var.f7604a;
                    z82 z82VarB = a92.B();
                    g42 g42VarA = f42Var.a();
                    z82VarB.i();
                    a92.C((a92) z82VarB.f4126t, g42VarA);
                    z82VarB.i();
                    a92.D((a92) z82VarB.f4126t);
                    z82VarB.i();
                    a92.E((a92) z82VarB.f4126t);
                    a92 a92Var = (a92) z82VarB.g();
                    g82Var.i();
                    h92.N((h92) g82Var.f4126t, a92Var);
                }
                return;
            case 2:
                rb0 rb0Var = (rb0) this.f7874t;
                Uri uri = Uri.parse((String) this.f7875u);
                eb0 eb0Var = ((mb0) rb0Var.f8602b.f3613t).F;
                if (eb0Var == null) {
                    zzo.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                    return;
                } else {
                    eb0Var.b0(uri);
                    return;
                }
            case 3:
                nk2.c(((mk2) this.f7875u).f7186a, ((hw0) this.f7874t).a());
                return;
            case 4:
                final fv0 fv0Var2 = ((cv0) this.f7874t).s;
                String str = (String) this.f7875u;
                int i7 = 5;
                de1 de1VarE = d0.e(fv0Var2.f4792f, 5);
                de1VarE.zzi();
                try {
                    ArrayList arrayList = new ArrayList();
                    JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        final String next = itKeys.next();
                        final de1 de1VarE2 = d0.e(fv0Var2.f4792f, i7);
                        de1VarE2.zzi();
                        de1VarE2.f(next);
                        final Object obj = new Object();
                        final o70 o70Var = new o70();
                        c5.a aVarQ = bs1.q(o70Var, ((Long) zzbe.zzc().a(zn.W1)).longValue(), TimeUnit.SECONDS, fv0Var2.f4796k);
                        fv0Var2.f4797l.b(next);
                        fv0Var2.f4800o.e(next);
                        final long jB = zzv.zzC().b();
                        aVarQ.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zu0
                            @Override // java.lang.Runnable
                            public final void run() {
                                fv0 fv0Var3 = fv0Var2;
                                Object obj2 = obj;
                                o70 o70Var2 = o70Var;
                                String str2 = next;
                                long j6 = jB;
                                de1 de1Var = de1VarE2;
                                fv0Var3.getClass();
                                synchronized (obj2) {
                                    try {
                                        if (!o70Var2.s.isDone()) {
                                            fv0Var3.d(str2, (int) (zzv.zzC().b() - j6), "Timeout.", false);
                                            fv0Var3.f4797l.a(str2, "timeout");
                                            fv0Var3.f4800o.a(str2, "timeout");
                                            ie1 ie1Var = fv0Var3.f4801p;
                                            de1Var.e("Timeout");
                                            de1Var.s(false);
                                            ie1Var.b(de1Var.zzm());
                                            o70Var2.a(Boolean.FALSE);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        }, fv0Var2.f4794i);
                        arrayList.add(aVarQ);
                        final dv0 dv0Var = new dv0(jB, o70Var, fv0Var2, de1VarE2, obj, next);
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                        final ArrayList arrayList2 = new ArrayList();
                        if (jSONObjectOptJSONObject != null) {
                            try {
                                JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                                int i8 = i6;
                                while (i8 < jSONArray.length()) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i8);
                                    String strOptString = jSONObject2.optString("format", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                    JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                                    Bundle bundle = new Bundle();
                                    if (jSONObjectOptJSONObject2 != null) {
                                        Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                        while (itKeys2.hasNext()) {
                                            String next2 = itKeys2.next();
                                            bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
                                            jSONArray = jSONArray;
                                        }
                                    }
                                    JSONArray jSONArray2 = jSONArray;
                                    arrayList2.add(new zv(strOptString, bundle));
                                    i8++;
                                    jSONArray = jSONArray2;
                                }
                            } catch (JSONException unused) {
                            }
                        }
                        fv0Var2.d(next, 0, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, false);
                        try {
                            rc1VarB = fv0Var2.h.b(next, new JSONObject());
                            executor = fv0Var2.f4795j;
                            try {
                                fv0Var = fv0Var2;
                            } catch (gc1 e6) {
                                e = e6;
                            }
                        } catch (gc1 e7) {
                            e = e7;
                        }
                        try {
                            fv0Var2 = fv0Var;
                            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.bv0
                                @Override // java.lang.Runnable
                                public final void run() throws gc1 {
                                    String str2 = next;
                                    dv0 dv0Var2 = dv0Var;
                                    rc1 rc1Var = rc1VarB;
                                    ArrayList arrayList3 = arrayList2;
                                    fv0 fv0Var3 = fv0Var;
                                    fv0Var3.getClass();
                                    try {
                                        if (Objects.equals(str2, "com.google.ads.mediation.admob.AdMobAdapter")) {
                                            dv0Var2.zzf();
                                            return;
                                        }
                                        Context context = (Context) fv0Var3.f4793g.get();
                                        if (context == null) {
                                            context = fv0Var3.f4792f;
                                        }
                                        try {
                                            try {
                                                rc1Var.f8609a.C0(new k3.b(context), dv0Var2, arrayList3);
                                            } catch (Throwable th) {
                                                throw new gc1(th);
                                            }
                                        } catch (RemoteException e8) {
                                            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e8);
                                        }
                                    } catch (RemoteException e9) {
                                        throw new hm1(e9);
                                    } catch (gc1 unused2) {
                                        dv0Var2.zze("Failed to initialize adapter. " + str2 + " does not implement the initialize() method.");
                                    }
                                }
                            });
                        } catch (gc1 e8) {
                            e = e8;
                            fv0Var2 = fv0Var;
                            dv0Var = dv0Var;
                            try {
                                dv0Var.zze(((Boolean) zzbe.zzc().a(zn.Pc)).booleanValue() ? "Failed to create Adapter. " + e.getMessage() : "Failed to create Adapter.");
                            } catch (RemoteException e9) {
                                zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e9);
                            }
                            i6 = 0;
                            i7 = 5;
                        } catch (JSONException e10) {
                            e = e10;
                            fv0Var2 = fv0Var;
                            zze.zzb("Malformed CLD response", e);
                            fv0Var2.f4800o.zza("MalformedJson");
                            iu0Var = fv0Var2.f4797l;
                            synchronized (iu0Var) {
                            }
                        }
                        i6 = 0;
                        i7 = 5;
                    }
                    bo1 bo1VarL = bo1.l(arrayList);
                    av0 av0Var = new av0(0, fv0Var2, de1VarE);
                    Executor executor2 = fv0Var2.f4794i;
                    tr1 tr1Var = new tr1(bo1VarL, false, false);
                    tr1Var.H = new sr1(tr1Var, av0Var, executor2);
                    tr1Var.u();
                    return;
                } catch (JSONException e11) {
                    e = e11;
                    zze.zzb("Malformed CLD response", e);
                    fv0Var2.f4800o.zza("MalformedJson");
                    iu0Var = fv0Var2.f4797l;
                    synchronized (iu0Var) {
                        if (((Boolean) zzbe.zzc().a(zn.f11403h2)).booleanValue()) {
                            HashMap mapE = iu0Var.e();
                            mapE.put("action", "aaia");
                            mapE.put("aair", "MalformedJson");
                            iu0Var.f5850b.add(mapE);
                        }
                    }
                    fv0Var2.f4791e.b(e);
                    zzv.zzp().h("AdapterInitializer.updateAdapterStatus", e);
                    ie1 ie1Var = fv0Var2.f4801p;
                    de1VarE.g(e);
                    de1VarE.s(false);
                    ie1Var.b(de1VarE.zzm());
                    return;
                }
            case 5:
                if (((Boolean) zzbe.zzc().a(zn.f11371c5)).booleanValue() && bq.D.f3169a) {
                    ((fg1) this.f7874t).c((View) this.f7875u);
                    return;
                }
                return;
            case 6:
                gb2 gb2Var = (gb2) this.f7874t;
                p9 p9Var = (p9) this.f7875u;
                int i9 = gb2Var.Q - p9Var.f7993b;
                gb2Var.Q = i9;
                boolean z6 = true;
                if (p9Var.f7994c) {
                    gb2Var.R = p9Var.f7995d;
                    gb2Var.S = true;
                }
                if (i9 == 0) {
                    zy zyVar = ((ic2) p9Var.f7996e).f5661a;
                    if (!gb2Var.f4982i0.f5661a.o() && zyVar.o()) {
                        gb2Var.f4983j0 = -1;
                        gb2Var.f4984k0 = 0L;
                    }
                    if (!zyVar.o()) {
                        List listAsList = Arrays.asList(((oc2) zyVar).h);
                        y5.r(listAsList.size() == gb2Var.G.size());
                        for (int i10 = 0; i10 < listAsList.size(); i10++) {
                            ((fb2) gb2Var.G.get(i10)).f4598b = (zy) listAsList.get(i10);
                        }
                    }
                    long j6 = -9223372036854775807L;
                    if (gb2Var.S) {
                        if (((ic2) p9Var.f7996e).f5662b.equals(gb2Var.f4982i0.f5662b) && ((ic2) p9Var.f7996e).f5664d == gb2Var.f4982i0.f5677r) {
                            z6 = false;
                        }
                        if (z6) {
                            if (zyVar.o() || ((ic2) p9Var.f7996e).f5662b.b()) {
                                j6 = ((ic2) p9Var.f7996e).f5664d;
                            } else {
                                ic2 ic2Var = (ic2) p9Var.f7996e;
                                oh2 oh2Var = ic2Var.f5662b;
                                long j7 = ic2Var.f5664d;
                                zyVar.n(oh2Var.f7769a, gb2Var.F);
                                j6 = j7;
                            }
                        }
                    } else {
                        z6 = false;
                    }
                    long j8 = j6;
                    gb2Var.S = false;
                    gb2Var.M((ic2) p9Var.f7996e, 1, z6, gb2Var.R, j8, -1);
                    return;
                }
                return;
            case 7:
                synchronized (((ConstraintTrackingWorker) this.f7875u).f1826t) {
                    if (((ConstraintTrackingWorker) this.f7875u).f1827u) {
                        ((ConstraintTrackingWorker) this.f7875u).f1828v.h(new ListenableWorker.a.b());
                    } else {
                        ((ConstraintTrackingWorker) this.f7875u).f1828v.j((c5.a) this.f7874t);
                    }
                }
                return;
            default:
                synchronized (((v3.k) this.f7875u).f14809t) {
                    ((v3.k) this.f7875u).f14810u.h((v3.p) this.f7874t);
                }
                return;
        }
    }

    public /* synthetic */ ow(Object obj, Object obj2, int i6, boolean z6) {
        this.s = i6;
        this.f7875u = obj;
        this.f7874t = obj2;
    }
}

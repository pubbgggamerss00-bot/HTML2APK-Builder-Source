package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f81 implements q81 {

    /* renamed from: k, reason: collision with root package name */
    public static final g81 f4544k = new g81(new JSONArray().toString(), new Bundle());

    /* renamed from: a, reason: collision with root package name */
    public final hs1 f4545a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f4546b;

    /* renamed from: c, reason: collision with root package name */
    public final a41 f4547c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f4548d;

    /* renamed from: e, reason: collision with root package name */
    public final ec1 f4549e;

    /* renamed from: f, reason: collision with root package name */
    public final z31 f4550f;

    /* renamed from: g, reason: collision with root package name */
    public final mt0 f4551g;
    public final gv0 h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4552i;

    /* renamed from: j, reason: collision with root package name */
    public final String f4553j;

    public f81(hs1 hs1Var, ScheduledExecutorService scheduledExecutorService, String str, a41 a41Var, Context context, ec1 ec1Var, z31 z31Var, mt0 mt0Var, gv0 gv0Var, int i6) {
        this.f4545a = hs1Var;
        this.f4546b = scheduledExecutorService;
        this.f4553j = str;
        this.f4547c = a41Var;
        this.f4548d = context;
        this.f4549e = ec1Var;
        this.f4550f = z31Var;
        this.f4551g = mt0Var;
        this.h = gv0Var;
        this.f4552i = i6;
    }

    public final xr1 a(final String str, final List list, final Bundle bundle, final boolean z6, final boolean z7) {
        or1 or1Var = new or1() { // from class: com.google.android.gms.internal.ads.d81
            /* JADX WARN: Removed duplicated region for block: B:73:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // com.google.android.gms.internal.ads.or1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final c5.a zza() {
                e00 e00Var;
                e00 e00VarA;
                final f81 f81Var = this.s;
                String str2 = str;
                final List list2 = list;
                final Bundle bundle2 = bundle;
                boolean z8 = z6;
                boolean z9 = z7;
                final o70 o70Var = new o70();
                if (z9) {
                    if (((Boolean) zzbe.zzc().a(zn.M1)).booleanValue()) {
                        try {
                            e00VarA = f81Var.f4551g.a(str2);
                        } catch (RemoteException e6) {
                            zze.zzb("Couldn't create RTB adapter : ", e6);
                            e00Var = null;
                        }
                    } else {
                        z31 z31Var = f81Var.f4550f;
                        z31Var.getClass();
                        try {
                            z31Var.f11133a.put(str2, z31Var.f11134b.a(str2));
                        } catch (RemoteException e7) {
                            zze.zzb("Couldn't create RTB adapter : ", e7);
                        }
                        ConcurrentHashMap concurrentHashMap = f81Var.f4550f.f11133a;
                        e00VarA = concurrentHashMap.containsKey(str2) ? (e00) concurrentHashMap.get(str2) : null;
                    }
                    e00Var = e00VarA;
                }
                if (e00Var == null) {
                    if (!((Boolean) zzbe.zzc().a(zn.C1)).booleanValue()) {
                        throw null;
                    }
                    int i6 = c41.f3395x;
                    synchronized (c41.class) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("name", str2);
                                jSONObject.put("signal_error", "Adapter failed to instantiate");
                                if (((Boolean) zzbe.zzc().a(zn.I1)).booleanValue()) {
                                    jSONObject.put("signal_error_code", 1);
                                }
                                o70Var.a(jSONObject);
                            } catch (JSONException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return o70Var;
                }
                final c41 c41Var = new c41(str2, e00Var, o70Var, zzv.zzC().b());
                if (((Boolean) zzbe.zzc().a(zn.H1)).booleanValue()) {
                    f81Var.f4546b.schedule(new p(13, c41Var), ((Long) zzbe.zzc().a(zn.A1)).longValue(), TimeUnit.MILLISECONDS);
                }
                if (z8) {
                    if (!((Boolean) zzbe.zzc().a(zn.O1)).booleanValue()) {
                        e00Var.h1(new k3.b(f81Var.f4548d), f81Var.f4553j, bundle2, (Bundle) list2.get(0), f81Var.f4549e.f4210e, c41Var);
                        return o70Var;
                    }
                    final e00 e00Var2 = e00Var;
                    f81Var.f4545a.w(new Runnable() { // from class: com.google.android.gms.internal.ads.c81
                        @Override // java.lang.Runnable
                        public final void run() {
                            f81 f81Var2 = f81Var;
                            e00 e00Var3 = e00Var2;
                            Bundle bundle3 = bundle2;
                            List list3 = list2;
                            c41 c41Var2 = c41Var;
                            try {
                                e00Var3.h1(new k3.b(f81Var2.f4548d), f81Var2.f4553j, bundle3, (Bundle) list3.get(0), f81Var2.f4549e.f4210e, c41Var2);
                            } catch (RemoteException e8) {
                                o70Var.b(e8);
                            }
                        }
                    });
                    return o70Var;
                }
                synchronized (c41Var) {
                    if (c41Var.f3399w) {
                        return o70Var;
                    }
                    try {
                        if (((Boolean) zzbe.zzc().a(zn.I1)).booleanValue()) {
                            c41Var.f3397u.put("signal_error_code", 0);
                        }
                    } catch (JSONException unused2) {
                    }
                    c41Var.f3396t.a(c41Var.f3397u);
                    c41Var.f3399w = true;
                    return o70Var;
                }
            }
        };
        hs1 hs1Var = this.f4545a;
        xr1 xr1VarP = xr1.p(bs1.n(or1Var, hs1Var));
        if (!((Boolean) zzbe.zzc().a(zn.H1)).booleanValue()) {
            xr1VarP = (xr1) bs1.q(xr1VarP, ((Long) zzbe.zzc().a(zn.A1)).longValue(), TimeUnit.MILLISECONDS, this.f4546b);
        }
        return bs1.j(xr1VarP, Throwable.class, new pl1() { // from class: com.google.android.gms.internal.ads.e81
            @Override // com.google.android.gms.internal.ads.pl1
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                String str2 = str;
                zzo.zzg("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) zzbe.zzc().a(zn.Rc)).booleanValue()) {
                    zzv.zzp().g("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)), th);
                    return null;
                }
                zzv.zzp().h("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)), th);
                return null;
            }
        }, hs1Var);
    }

    public final void b(ArrayList arrayList, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            d41 d41Var = (d41) ((Map.Entry) it.next()).getValue();
            String str = d41Var.f3759a;
            Bundle bundle = this.f4549e.f4209d.zzm;
            arrayList.add(a(str, Collections.singletonList(d41Var.f3763e), bundle != null ? bundle.getBundle(str) : null, d41Var.f3760b, d41Var.f3761c));
        }
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        int i6 = this.f4552i;
        g81 g81Var = f4544k;
        if (i6 == 2) {
            return bs1.m(g81Var);
        }
        ec1 ec1Var = this.f4549e;
        if (ec1Var.f4222r) {
            if (!Arrays.asList(((String) zzbe.zzc().a(zn.N1)).split(",")).contains(zzaa.zzb(zzaa.zzc(ec1Var.f4209d)))) {
                return bs1.m(g81Var);
            }
        }
        return bs1.n(new dh0(19, this), this.f4545a);
    }
}

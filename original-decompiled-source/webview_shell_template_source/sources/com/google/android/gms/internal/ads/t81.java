package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t81 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9131a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f9132b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f9133c;

    /* renamed from: d, reason: collision with root package name */
    public final he1 f9134d;

    /* renamed from: e, reason: collision with root package name */
    public final cu0 f9135e;

    /* renamed from: f, reason: collision with root package name */
    public long f9136f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f9137g = 0;

    public t81(Context context, h70 h70Var, Set set, he1 he1Var, cu0 cu0Var) {
        this.f9131a = context;
        this.f9133c = h70Var;
        this.f9132b = set;
        this.f9134d = he1Var;
        this.f9135e = cu0Var;
    }

    public final tr1 a(final Object obj, final Bundle bundle, final boolean z6) {
        de1 de1VarE = d0.e(this.f9131a, 8);
        de1VarE.zzi();
        Set<q81> set = this.f9132b;
        final ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        sn snVar = zn.Cb;
        if (!((String) zzbe.zzc().a(snVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) zzbe.zzc().a(snVar)).split(","));
        }
        this.f9136f = zzv.zzC().b();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) zzbe.zzc().a(zn.f11424k2)).booleanValue() && bundle != null) {
            long jA = zzv.zzC().a();
            if (obj instanceof ck0) {
                bundle.putLong("client-signals-start", jA);
            } else {
                bundle.putLong("gms-signals-start", jA);
            }
        }
        for (final q81 q81Var : set) {
            if (!arrayList2.contains(String.valueOf(q81Var.zza()))) {
                final long jB = zzv.zzC().b();
                c5.a aVarZzb = q81Var.zzb();
                final Bundle bundle3 = bundle2;
                aVarZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.r81
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        t81 t81Var = this.s;
                        long j6 = jB;
                        q81 q81Var2 = q81Var;
                        Bundle bundle4 = bundle3;
                        long jB2 = zzv.zzC().b() - j6;
                        if (((Boolean) tp.f9357a.c()).booleanValue()) {
                            String canonicalName = q81Var2.getClass().getCanonicalName();
                            if (canonicalName == null) {
                                canonicalName = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                            }
                            zze.zza("Signal runtime (ms) : " + canonicalName + " = " + jB2);
                        }
                        if (((Boolean) zzbe.zzc().a(zn.f11424k2)).booleanValue()) {
                            if (((Boolean) zzbe.zzc().a(zn.f11449o2)).booleanValue()) {
                                synchronized (t81Var) {
                                    bundle4.putLong("sig" + q81Var2.zza(), jB2);
                                }
                            }
                        }
                        if (((Boolean) zzbe.zzc().a(zn.f11410i2)).booleanValue()) {
                            bu0 bu0VarA = t81Var.f9135e.a();
                            bu0VarA.a("action", "lat_ms");
                            bu0VarA.a("lat_grp", "sig_lat_grp");
                            bu0VarA.a("lat_id", String.valueOf(q81Var2.zza()));
                            bu0VarA.a("clat_ms", String.valueOf(jB2));
                            if (((Boolean) zzbe.zzc().a(zn.f11417j2)).booleanValue()) {
                                synchronized (t81Var) {
                                    t81Var.f9137g++;
                                }
                                com.google.android.gms.ads.mediation.customevent.a aVar = zzv.zzp().f2948c.f4142c;
                                synchronized (aVar) {
                                    str = (String) aVar.f2373u;
                                }
                                bu0VarA.a("seq_num", str);
                                synchronized (t81Var) {
                                    try {
                                        if (t81Var.f9137g == t81Var.f9132b.size() && t81Var.f9136f != 0) {
                                            t81Var.f9137g = 0;
                                            String strValueOf = String.valueOf(zzv.zzC().b() - t81Var.f9136f);
                                            if (q81Var2.zza() <= 39 || q81Var2.zza() >= 52) {
                                                bu0VarA.a("lat_clsg", strValueOf);
                                            } else {
                                                bu0VarA.a("lat_gmssg", strValueOf);
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                            bu0VarA.f3292b.f3662b.execute(new p(10, bu0VarA));
                        }
                    }
                }, i70.f5592g);
                arrayList.add(aVarZzb);
                bundle2 = bundle3;
            }
        }
        bo1 bo1VarL = bo1.l(arrayList);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.s81
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2;
                Bundle bundle4;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    obj2 = obj;
                    if (!zHasNext) {
                        break;
                    }
                    p81 p81Var = (p81) ((c5.a) it.next()).get();
                    if (p81Var != null) {
                        p81Var.a(obj2);
                        if (z6) {
                            p81Var.zza(obj2);
                        }
                    }
                }
                if (((Boolean) zzbe.zzc().a(zn.f11424k2)).booleanValue() && (bundle4 = bundle) != null) {
                    long jA2 = zzv.zzC().a();
                    boolean z7 = obj2 instanceof ck0;
                    Bundle bundle5 = bundle2;
                    if (z7) {
                        bundle4.putLong("client-signals-end", jA2);
                        bundle4.putBundle("client_sig_latency_key", bundle5);
                        return obj2;
                    }
                    bundle4.putLong("gms-signals-end", jA2);
                    bundle4.putBundle("gms_sig_latency_key", bundle5);
                }
                return obj2;
            }
        };
        tr1 tr1Var = new tr1(bo1VarL, true, false);
        tr1Var.H = new sr1(tr1Var, callable, this.f9133c);
        tr1Var.u();
        if (ie1.a()) {
            ge1.c(tr1Var, this.f9134d, de1VarE, false);
        }
        return tr1Var;
    }
}

package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yf {

    /* renamed from: a, reason: collision with root package name */
    public final ai1 f10947a;

    /* renamed from: b, reason: collision with root package name */
    public final hi1 f10948b;

    /* renamed from: c, reason: collision with root package name */
    public final jg f10949c;

    /* renamed from: d, reason: collision with root package name */
    public final zzavw f10950d;

    /* renamed from: e, reason: collision with root package name */
    public final sf f10951e;

    /* renamed from: f, reason: collision with root package name */
    public final mg f10952f;

    /* renamed from: g, reason: collision with root package name */
    public final eg f10953g;
    public final xj0 h;

    public yf(ai1 ai1Var, hi1 hi1Var, jg jgVar, zzavw zzavwVar, sf sfVar, mg mgVar, eg egVar, xj0 xj0Var) {
        this.f10947a = ai1Var;
        this.f10948b = hi1Var;
        this.f10949c = jgVar;
        this.f10950d = zzavwVar;
        this.f10951e = sfVar;
        this.f10952f = mgVar;
        this.f10953g = egVar;
        this.h = xj0Var;
    }

    public final HashMap a() {
        HashMap mapB = b();
        v3.p pVar = this.f10948b.f5419d;
        yd ydVar = fi1.f4692a;
        if (pVar.h()) {
            ydVar = (yd) pVar.e();
        }
        mapB.put("gai", Boolean.valueOf(this.f10947a.f2780b));
        mapB.put("did", ydVar.y0());
        mapB.put("dst", Integer.valueOf(ydVar.n0() - 1));
        mapB.put("doo", Boolean.valueOf(ydVar.k0()));
        return mapB;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0118 A[Catch: all -> 0x00fc, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {all -> 0x00fc, blocks: (B:12:0x00ed, B:14:0x00f1, B:16:0x00f8, B:20:0x00fe, B:22:0x0107, B:24:0x010b, B:26:0x0114, B:28:0x0118), top: B:41:0x00ed }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HashMap b() {
        long j6;
        HashMap map = new HashMap();
        ai1 ai1Var = this.f10947a;
        v3.p pVar = this.f10948b.f5420e;
        yd ydVar = gi1.f5059a;
        if (pVar.h()) {
            ydVar = (yd) pVar.e();
        }
        map.put("v", ai1Var.f2779a);
        map.put("gms", Boolean.valueOf(this.f10947a.f2781c));
        map.put("int", ydVar.z0());
        map.put("attts", Long.valueOf(ydVar.x0().B()));
        map.put("att", ydVar.x0().D());
        map.put("attkid", ydVar.x0().E());
        map.put("up", Boolean.valueOf(this.f10950d.f11612a));
        map.put("t", new Throwable());
        eg egVar = this.f10953g;
        if (egVar != null) {
            map.put("tcq", Long.valueOf(egVar.f4272a));
            map.put("tpq", Long.valueOf(this.f10953g.f4273b));
            map.put("tcv", Long.valueOf(this.f10953g.f4274c));
            map.put("tpv", Long.valueOf(this.f10953g.f4275d));
            map.put("tchv", Long.valueOf(this.f10953g.f4276e));
            map.put("tphv", Long.valueOf(this.f10953g.f4277f));
            map.put("tcc", Long.valueOf(this.f10953g.f4278g));
            map.put("tpc", Long.valueOf(this.f10953g.h));
            sf sfVar = this.f10951e;
            if (sfVar != null) {
                synchronized (sf.class) {
                    try {
                        NetworkCapabilities networkCapabilities = sfVar.f8914a;
                        if (networkCapabilities == null) {
                            j6 = -1;
                        } else if (networkCapabilities.hasTransport(4)) {
                            j6 = 2;
                        } else if (sfVar.f8914a.hasTransport(1)) {
                            j6 = 1;
                        } else if (sfVar.f8914a.hasTransport(0)) {
                            j6 = 0;
                        }
                    } finally {
                    }
                }
                map.put("nt", Long.valueOf(j6));
            }
            mg mgVar = this.f10952f;
            if (mgVar != null) {
                map.put("vs", Long.valueOf(mgVar.f7143d ? mgVar.f7141b - mgVar.f7140a : -1L));
                mg mgVar2 = this.f10952f;
                long j7 = mgVar2.f7142c;
                mgVar2.f7142c = -1L;
                map.put("vf", Long.valueOf(j7));
            }
        }
        return map;
    }
}

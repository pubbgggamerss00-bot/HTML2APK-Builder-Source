package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yx0 extends f30 {
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final hs1 f11113t;

    /* renamed from: u, reason: collision with root package name */
    public final xj1 f11114u;

    /* renamed from: v, reason: collision with root package name */
    public final hc0 f11115v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayDeque f11116w;

    /* renamed from: x, reason: collision with root package name */
    public final ie1 f11117x;

    public yx0(Context context, hs1 hs1Var, ed0 ed0Var, hc0 hc0Var, xj1 xj1Var, ArrayDeque arrayDeque, ie1 ie1Var) {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
        zn.a(context);
        this.s = context;
        this.f11113t = hs1Var;
        this.f11114u = xj1Var;
        this.f11115v = hc0Var;
        this.f11116w = arrayDeque;
        this.f11117x = ie1Var;
    }

    public static vd1 i2(vd1 vd1Var, ae1 ae1Var, lx lxVar, he1 he1Var, de1 de1Var) {
        ox oxVarA = lxVar.a("AFMA_getAdDictionary", kx.f6519b, new fo(19));
        ge1.a(vd1Var, de1Var);
        vd1 vd1VarA = ae1Var.a(vd1Var, yd1.f10931y).c(oxVarA).a();
        if (!((Boolean) mp.f7199c.c()).booleanValue()) {
            return vd1VarA;
        }
        xr1 xr1VarP = xr1.p(vd1VarA);
        ni0 ni0Var = new ni0(17, he1Var, de1Var);
        xr1VarP.addListener(new as1(0, xr1VarP, ni0Var), i70.f5592g);
        return vd1VarA;
    }

    public static vd1 j2(r30 r30Var, ae1 ae1Var, jd0 jd0Var) {
        qf0 qf0Var = new qf0(3, jd0Var, r30Var);
        return ae1Var.a(bs1.m(r30Var.s), yd1.f10930x).c(qf0Var).b(new me0(26)).a();
    }

    public static void k2(c5.a aVar, k30 k30Var, r30 r30Var) {
        gr1 gr1VarP = bs1.p(aVar, new ye0(1), i70.f5586a);
        r0 r0Var = new r0(r30Var, k30Var);
        gr1VarP.addListener(new as1(0, gr1VarP, r0Var), i70.f5592g);
    }

    @Override // com.google.android.gms.internal.ads.g30
    public final void E0(r30 r30Var, k30 k30Var) {
        Bundle bundle;
        if (((Boolean) zzbe.zzc().a(zn.f11424k2)).booleanValue() && (bundle = r30Var.E) != null) {
            androidx.camera.camera2.internal.compat.workaround.c.f("service-connected", bundle);
        }
        k2(f2(r30Var, Binder.getCallingUid()), k30Var, r30Var);
    }

    @Override // com.google.android.gms.internal.ads.g30
    public final void J(r30 r30Var, k30 k30Var) {
        k2(i1(r30Var, Binder.getCallingUid()), k30Var, r30Var);
    }

    @Override // com.google.android.gms.internal.ads.g30
    public final void Q0(String str, k30 k30Var) {
        k2(g2(str), k30Var, null);
    }

    public final vd1 e2(final r30 r30Var, int i6) {
        wx0 wx0VarH2;
        boolean z6;
        vd1 vd1VarA;
        gx gxVarZzg = zzv.zzg();
        VersionInfoParcel versionInfoParcelForPackage = VersionInfoParcel.forPackage();
        ie1 ie1Var = this.f11117x;
        Context context = this.s;
        lx lxVarB = gxVarZzg.b(context, versionInfoParcelForPackage, ie1Var);
        jd0 jd0VarN = this.f11115v.n(r30Var, i6);
        ox oxVarA = lxVarB.a("google.afma.response.normalize", xx0.f10738d, kx.f6520c);
        if (((Boolean) yp.f11059a.c()).booleanValue()) {
            wx0VarH2 = h2(r30Var.f8530z);
            if (wx0VarH2 == null) {
                zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = r30Var.B;
            wx0VarH2 = null;
            if (str != null && !str.isEmpty()) {
                zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        de1 de1VarE = wx0VarH2 == null ? d0.e(context, 9) : wx0VarH2.f10303d;
        he1 he1Var = (he1) jd0VarN.f6031c.zzb();
        he1Var.d(r30Var.s.getStringArrayList("ad_types"));
        ey0 ey0Var = new ey0(r30Var.f8529y, he1Var, de1VarE);
        cy0 cy0Var = new cy0(context, r30Var.f8524t.afmaVersion);
        ae1 ae1Var = (ae1) jd0VarN.f6038k.zzb();
        de1 de1VarE2 = d0.e(context, 11);
        yd1 yd1Var = yd1.A;
        yd1 yd1Var2 = yd1.f10932z;
        if (wx0VarH2 == null) {
            final vd1 vd1VarJ2 = j2(r30Var, ae1Var, jd0VarN);
            hs1 hs1Var = ae1Var.f2731a;
            final vd1 vd1VarI2 = i2(vd1VarJ2, ae1Var, lxVarB, he1Var, de1VarE);
            de1 de1VarE3 = d0.e(context, 10);
            List listAsList = Arrays.asList(vd1VarI2, vd1VarJ2);
            Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.qx0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    r30 r30Var2;
                    Bundle bundle;
                    t30 t30Var = (t30) vd1VarI2.f9834u.get();
                    if (((Boolean) zzbe.zzc().a(zn.f11424k2)).booleanValue() && (bundle = (r30Var2 = r30Var).E) != null) {
                        bundle.putLong("get-ad-dictionary-sdkcore-start", t30Var.f9093j);
                        r30Var2.E.putLong("get-ad-dictionary-sdkcore-end", t30Var.f9094k);
                    }
                    return new dy0((JSONObject) vd1VarJ2.f9834u.get(), t30Var);
                }
            };
            zn1 zn1Var = bo1.f3236t;
            listAsList.getClass();
            bo1 bo1VarL = bo1.l(listAsList);
            o61 o61Var = new o61(1);
            h70 h70Var = i70.f5592g;
            z6 = false;
            tr1 tr1Var = new tr1(bo1VarL, true, false);
            tr1Var.H = new sr1(tr1Var, o61Var, h70Var);
            tr1Var.u();
            tr1 tr1Var2 = new tr1(bo1VarL, true, false);
            tr1Var2.H = new sr1(tr1Var2, callable, hs1Var);
            tr1Var2.u();
            final vd1 vd1VarA2 = new wd1(ae1Var, yd1Var2, null, tr1Var, listAsList, tr1Var2).b(ey0Var).b(new xj0(14, de1VarE3)).b(cy0Var).a();
            ge1.c(vd1VarA2, he1Var, de1VarE3, false);
            ge1.a(vd1VarA2, de1VarE2);
            List listAsList2 = Arrays.asList(vd1VarJ2, vd1VarI2, vd1VarA2);
            Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.ads.rx0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    if (((Boolean) zzbe.zzc().a(zn.f11424k2)).booleanValue() && (bundle = r30Var.E) != null) {
                        androidx.camera.camera2.internal.compat.workaround.c.f("http-response-ready", bundle);
                    }
                    return new xx0((by0) vd1VarA2.f9834u.get(), (JSONObject) vd1VarJ2.f9834u.get(), (t30) vd1VarI2.f9834u.get());
                }
            };
            zn1 zn1Var2 = bo1.f3236t;
            listAsList2.getClass();
            bo1 bo1VarL2 = bo1.l(listAsList2);
            o61 o61Var2 = new o61(1);
            h70 h70Var2 = i70.f5592g;
            tr1 tr1Var3 = new tr1(bo1VarL2, true, false);
            tr1Var3.H = new sr1(tr1Var3, o61Var2, h70Var2);
            tr1Var3.u();
            tr1 tr1Var4 = new tr1(bo1VarL2, true, false);
            tr1Var4.H = new sr1(tr1Var4, callable2, hs1Var);
            tr1Var4.u();
            vd1VarA = new wd1(ae1Var, yd1Var, null, tr1Var3, listAsList2, tr1Var4).c(oxVarA).a();
        } else {
            z6 = false;
            dy0 dy0Var = new dy0(wx0VarH2.f10301b, wx0VarH2.f10300a);
            de1 de1VarE4 = d0.e(context, 10);
            final vd1 vd1VarA3 = ae1Var.a(bs1.m(dy0Var), yd1Var2).b(ey0Var).b(new xj0(14, de1VarE4)).b(cy0Var).a();
            ge1.c(vd1VarA3, he1Var, de1VarE4, false);
            final ds1 ds1VarM = bs1.m(wx0VarH2);
            ge1.a(vd1VarA3, de1VarE2);
            List listAsList3 = Arrays.asList(vd1VarA3, ds1VarM);
            Callable callable3 = new Callable() { // from class: com.google.android.gms.internal.ads.px0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    by0 by0Var = (by0) vd1VarA3.f9834u.get();
                    Object obj = ds1VarM.s;
                    return new xx0(by0Var, ((wx0) obj).f10301b, ((wx0) obj).f10300a);
                }
            };
            zn1 zn1Var3 = bo1.f3236t;
            listAsList3.getClass();
            bo1 bo1VarL3 = bo1.l(listAsList3);
            o61 o61Var3 = new o61(1);
            h70 h70Var3 = i70.f5592g;
            tr1 tr1Var5 = new tr1(bo1VarL3, true, false);
            tr1Var5.H = new sr1(tr1Var5, o61Var3, h70Var3);
            tr1Var5.u();
            hs1 hs1Var2 = ae1Var.f2731a;
            tr1 tr1Var6 = new tr1(bo1VarL3, true, false);
            tr1Var6.H = new sr1(tr1Var6, callable3, hs1Var2);
            tr1Var6.u();
            vd1VarA = new wd1(ae1Var, yd1Var, null, tr1Var5, listAsList3, tr1Var6).c(oxVarA).a();
        }
        ge1.c(vd1VarA, he1Var, de1VarE2, z6);
        return vd1VarA;
    }

    public final c5.a f2(r30 r30Var, int i6) {
        gx gxVarZzg = zzv.zzg();
        VersionInfoParcel versionInfoParcelForPackage = VersionInfoParcel.forPackage();
        ie1 ie1Var = this.f11117x;
        Context context = this.s;
        lx lxVarB = gxVarZzg.b(context, versionInfoParcelForPackage, ie1Var);
        if (!((Boolean) cq.f3639a.c()).booleanValue()) {
            return bs1.l(new Exception("Signal collection disabled."));
        }
        jd0 jd0VarN = this.f11115v.n(r30Var, i6);
        w92 w92Var = jd0VarN.f6031c;
        kd0 kd0Var = jd0VarN.f6030b;
        Context context2 = kd0Var.f6331b.f6321b;
        ih1.j(context2);
        new d0(15);
        new fo(12);
        Object objZzb = kd0Var.N0.zzb();
        v50 v50Var = jd0VarN.f6037j;
        t91 t91Var = jd0VarN.f6036i;
        ee0 ee0Var = jd0VarN.h;
        c51 c51Var = jd0VarN.f6035g;
        rc0 rc0Var = jd0VarN.f6034f;
        ke0 ke0Var = jd0VarN.f6033e;
        ji0 ji0Var = jd0VarN.f6032d;
        h91 h91VarA = jd0VarN.a();
        q91 q91Var = jd0VarN.f6029a;
        new ln();
        h70 h70Var = i70.f5586a;
        ih1.j(h70Var);
        List list = q91Var.f8279a.f8527w;
        ih1.j(list);
        o91 o91Var = new o91(h70Var, list);
        u92 u92VarA = w92.a(ji0Var);
        u92 u92VarA2 = w92.a(ke0Var);
        w92.a(rc0Var);
        u92 u92VarA3 = w92.a(c51Var);
        u92 u92VarA4 = w92.a(ee0Var);
        w92.a(t91Var);
        u92 u92VarA5 = w92.a(v50Var);
        ih1.j(h70Var);
        he1 he1Var = (he1) w92Var.zzb();
        cu0 cu0Var = (cu0) kd0Var.f6376z.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add((l91) objZzb);
        hashSet.add(h91VarA);
        hashSet.add(o91Var);
        if (((Boolean) zzbe.zzc().a(zn.H5)).booleanValue()) {
            hashSet.add((q81) u92VarA.zzb());
        }
        if (((Boolean) zzbe.zzc().a(zn.I5)).booleanValue()) {
            hashSet.add((q81) u92VarA2.zzb());
        }
        if (((Boolean) zzbe.zzc().a(zn.K5)).booleanValue()) {
            hashSet.add((q81) u92VarA3.zzb());
        }
        if (((Boolean) zzbe.zzc().a(zn.L5)).booleanValue()) {
            hashSet.add((q81) u92VarA4.zzb());
        }
        if (((Boolean) zzbe.zzc().a(zn.f11377d3)).booleanValue()) {
            hashSet.add((q81) u92VarA5.zzb());
        }
        t81 t81Var = new t81(context2, h70Var, hashSet, he1Var, cu0Var);
        ox oxVarA = lxVarB.a("google.afma.request.getSignals", kx.f6519b, kx.f6520c);
        de1 de1VarE = d0.e(context, 22);
        ae1 ae1Var = (ae1) jd0VarN.f6038k.zzb();
        Bundle bundle = r30Var.s;
        wd1 wd1VarC = ae1Var.a(bs1.m(bundle), yd1.B).b(new xj0(14, de1VarE)).c(new ux0(0, t81Var, r30Var));
        vd1 vd1VarA = wd1VarC.f10171f.a(wd1VarC.a(), yd1.C).c(oxVarA).a();
        he1 he1Var2 = (he1) w92Var.zzb();
        he1Var2.d(bundle.getStringArrayList("ad_types"));
        he1Var2.f(bundle.getBundle("extras"));
        ge1.c(vd1VarA, he1Var2, de1VarE, true);
        if (((Boolean) rp.f8679f.c()).booleanValue()) {
            xj1 xj1Var = this.f11114u;
            Objects.requireNonNull(xj1Var);
            vd1VarA.addListener(new u(9, xj1Var), this.f11113t);
        }
        return vd1VarA;
    }

    public final c5.a g2(String str) {
        if (((Boolean) yp.f11059a.c()).booleanValue()) {
            return h2(str) == null ? bs1.l(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : bs1.m(new vx0());
        }
        return bs1.l(new Exception("Split request is disabled."));
    }

    public final synchronized wx0 h2(String str) {
        Iterator it = this.f11116w.iterator();
        while (it.hasNext()) {
            wx0 wx0Var = (wx0) it.next();
            if (wx0Var.f10302c.equals(str)) {
                it.remove();
                return wx0Var;
            }
        }
        return null;
    }

    public final c5.a i1(final r30 r30Var, int i6) {
        if (!((Boolean) yp.f11059a.c()).booleanValue()) {
            return bs1.l(new Exception("Split request is disabled."));
        }
        cd1 cd1Var = r30Var.A;
        if (cd1Var == null) {
            return bs1.l(new Exception("Pool configuration missing from request."));
        }
        if (cd1Var.f3524v == 0 || cd1Var.f3525w == 0) {
            return bs1.l(new Exception("Caching is disabled."));
        }
        gx gxVarZzg = zzv.zzg();
        VersionInfoParcel versionInfoParcelForPackage = VersionInfoParcel.forPackage();
        Context context = this.s;
        lx lxVarB = gxVarZzg.b(context, versionInfoParcelForPackage, this.f11117x);
        jd0 jd0VarN = this.f11115v.n(r30Var, i6);
        ae1 ae1Var = (ae1) jd0VarN.f6038k.zzb();
        final vd1 vd1VarJ2 = j2(r30Var, ae1Var, jd0VarN);
        he1 he1Var = (he1) jd0VarN.f6031c.zzb();
        final de1 de1VarE = d0.e(context, 9);
        final vd1 vd1VarI2 = i2(vd1VarJ2, ae1Var, lxVarB, he1Var, de1VarE);
        List listAsList = Arrays.asList(vd1VarJ2, vd1VarI2);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.tx0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                yx0 yx0Var = this.f9407a;
                vd1 vd1Var = vd1VarI2;
                vd1 vd1Var2 = vd1VarJ2;
                r30 r30Var2 = r30Var;
                de1 de1Var = de1VarE;
                String str = ((t30) vd1Var.f9834u.get()).f9092i;
                wx0 wx0Var = new wx0((t30) vd1Var.f9834u.get(), (JSONObject) vd1Var2.f9834u.get(), r30Var2.f8530z, de1Var);
                synchronized (yx0Var) {
                    synchronized (yx0Var) {
                        int iIntValue = ((Long) yp.f11060b.c()).intValue();
                        while (yx0Var.f11116w.size() >= iIntValue) {
                            yx0Var.f11116w.removeFirst();
                        }
                    }
                    return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
                }
                yx0Var.f11116w.addLast(wx0Var);
                return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            }
        };
        zn1 zn1Var = bo1.f3236t;
        listAsList.getClass();
        bo1 bo1VarL = bo1.l(listAsList);
        o61 o61Var = new o61(1);
        h70 h70Var = i70.f5592g;
        tr1 tr1Var = new tr1(bo1VarL, true, false);
        tr1Var.H = new sr1(tr1Var, o61Var, h70Var);
        tr1Var.u();
        hs1 hs1Var = ae1Var.f2731a;
        tr1 tr1Var2 = new tr1(bo1VarL, true, false);
        tr1Var2.H = new sr1(tr1Var2, callable, hs1Var);
        tr1Var2.u();
        return new wd1(ae1Var, yd1.O, null, tr1Var, listAsList, tr1Var2).a();
    }

    @Override // com.google.android.gms.internal.ads.g30
    public final void r0(r30 r30Var, k30 k30Var) {
        Bundle bundle;
        if (((Boolean) zzbe.zzc().a(zn.f11424k2)).booleanValue() && (bundle = r30Var.E) != null) {
            androidx.camera.camera2.internal.compat.workaround.c.f("service-connected", bundle);
        }
        vd1 vd1VarE2 = e2(r30Var, Binder.getCallingUid());
        k2(vd1VarE2, k30Var, r30Var);
        if (((Boolean) rp.f8678e.c()).booleanValue()) {
            xj1 xj1Var = this.f11114u;
            Objects.requireNonNull(xj1Var);
            vd1VarE2.addListener(new u(9, xj1Var), this.f11113t);
        }
    }
}

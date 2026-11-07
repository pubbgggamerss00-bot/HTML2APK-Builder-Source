package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.zzv;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r21 implements pr1 {

    /* renamed from: a, reason: collision with root package name */
    public final ae1 f8512a;

    /* renamed from: b, reason: collision with root package name */
    public final qk0 f8513b;

    /* renamed from: c, reason: collision with root package name */
    public final af1 f8514c;

    /* renamed from: d, reason: collision with root package name */
    public final cf1 f8515d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f8516e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f8517f;

    /* renamed from: g, reason: collision with root package name */
    public final wi0 f8518g;
    public final n21 h;

    /* renamed from: i, reason: collision with root package name */
    public final e01 f8519i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f8520j;

    /* renamed from: k, reason: collision with root package name */
    public final he1 f8521k;

    /* renamed from: l, reason: collision with root package name */
    public final a21 f8522l;

    /* renamed from: m, reason: collision with root package name */
    public final zt0 f8523m;

    public r21(Context context, ae1 ae1Var, n21 n21Var, qk0 qk0Var, af1 af1Var, cf1 cf1Var, wi0 wi0Var, h70 h70Var, ScheduledExecutorService scheduledExecutorService, e01 e01Var, he1 he1Var, a21 a21Var, zt0 zt0Var) {
        this.f8520j = context;
        this.f8512a = ae1Var;
        this.h = n21Var;
        this.f8513b = qk0Var;
        this.f8514c = af1Var;
        this.f8515d = cf1Var;
        this.f8518g = wi0Var;
        this.f8516e = h70Var;
        this.f8517f = scheduledExecutorService;
        this.f8519i = e01Var;
        this.f8521k = he1Var;
        this.f8522l = a21Var;
        this.f8523m = zt0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(ac1 ac1Var) {
        String strD = "No fill.";
        String str = true != ((Boolean) zzbe.zzc().a(zn.f11501w5)).booleanValue() ? "No ad config." : "No fill.";
        int i6 = ((vb1) ac1Var.f2648b.f1103u).f9778f;
        if (i6 == 0) {
            strD = str;
        } else if (i6 < 200 || i6 >= 300) {
            strD = (i6 < 300 || i6 >= 400) ? androidx.camera.camera2.internal.compat.workaround.c.d(i6, "Received error HTTP response code: ") : "No location header to follow redirect or too many redirects.";
        } else {
            if (((Boolean) zzbe.zzc().a(zn.f11494v5)).booleanValue()) {
            }
        }
        dt1 dt1Var = ((vb1) ac1Var.f2648b.f1103u).f9781j;
        return dt1Var != null ? dt1Var.f4025t : strD;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f6  */
    @Override // com.google.android.gms.internal.ads.pr1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c5.a zza(Object obj) {
        c5.a aVarA;
        int i6;
        r30 r30Var;
        Bundle bundle;
        final ac1 ac1Var = (ac1) obj;
        if (((Boolean) zzbe.zzc().a(zn.f11424k2)).booleanValue() && (r30Var = (r30) ac1Var.f2648b.f1104v) != null && (bundle = r30Var.E) != null) {
            this.f8523m.f11577c.putAll(bundle);
        }
        if (((Boolean) zzbe.zzc().a(zn.f11431l2)).booleanValue()) {
            androidx.camera.camera2.internal.compat.workaround.c.f("rendering-start", this.f8523m.f11577c);
        }
        String strA = a(ac1Var);
        this.f8519i.f4070d = (vb1) ac1Var.f2648b.f1103u;
        if (((Boolean) zzbe.zzc().a(zn.h8)).booleanValue() && (i6 = ((vb1) ac1Var.f2648b.f1103u).f9778f) != 0 && (i6 < 200 || i6 >= 300)) {
            return bs1.l(new p21(3, strA));
        }
        vb1 vb1Var = (vb1) ac1Var.f2648b.f1103u;
        if (((Boolean) zzbe.zzc().a(zn.H3)).booleanValue()) {
            String str = vb1Var.f9788q;
            if (TextUtils.isEmpty(str)) {
                for (tb1 tb1Var : (List) ac1Var.f2648b.s) {
                    e01 e01Var = this.f8519i;
                    e01Var.c(tb1Var, e01Var.f4067a.size());
                    Iterator it = tb1Var.f9171a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            this.f8519i.d(tb1Var, 0L, tc1.d(1, null, null), false);
                            break;
                        }
                        yz0 yz0VarA = this.f8518g.a(tb1Var.f9173b, (String) it.next());
                        if (yz0VarA == null || !yz0VarA.a(ac1Var, tb1Var)) {
                        }
                    }
                }
            } else {
                e01 e01Var2 = this.f8519i;
                List list = (List) ac1Var.f2648b.s;
                synchronized (e01Var2) {
                    if (e01Var2.f4068b.containsKey(str)) {
                        int iIndexOf = e01Var2.f4067a.indexOf((zzw) e01Var2.f4068b.get(str));
                        try {
                            e01Var2.f4067a.remove(iIndexOf);
                        } catch (IndexOutOfBoundsException e6) {
                            zzv.zzp().h("AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry", e6);
                        }
                        e01Var2.f4068b.remove(str);
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            e01Var2.c((tb1) it2.next(), iIndexOf);
                            iIndexOf++;
                        }
                    }
                }
            }
        }
        this.f8513b.l0(new zf0(ac1Var, this.f8515d, this.f8514c), this.f8516e);
        if (((vb1) ac1Var.f2648b.f1103u).f9789r > 1) {
            a21 a21Var = this.f8522l;
            synchronized (a21Var) {
                try {
                    if (!a21Var.f2555g.getAndSet(true)) {
                        if (((List) ac1Var.f2648b.s).isEmpty()) {
                            a21Var.f2554f.f(new p21(3, a(ac1Var)));
                        } else {
                            a21Var.f2556i = ac1Var;
                            a21Var.h = new b21(ac1Var, a21Var.f2552d, a21Var.f2554f);
                            a21Var.f2552d.c((List) ac1Var.f2648b.s);
                            for (tb1 tb1VarA = a21Var.h.a(); tb1VarA != null; tb1VarA = a21Var.h.a()) {
                                a21Var.a(tb1VarA);
                            }
                        }
                    }
                    aVarA = a21Var.f2554f;
                } finally {
                }
            }
        } else {
            aVarA = new wd1(this.f8512a, yd1.D, null, ae1.f2730d, Collections.EMPTY_LIST, bs1.l(new p21(3, a(ac1Var)))).a();
            n21 n21Var = this.h;
            synchronized (n21Var) {
                n21Var.f7304i = n21Var.f7297a.b();
            }
            int i7 = 0;
            for (final tb1 tb1Var2 : (List) ac1Var.f2648b.s) {
                Iterator it3 = tb1Var2.f9171a.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    String str2 = (String) it3.next();
                    final yz0 yz0VarA2 = this.f8518g.a(tb1Var2.f9173b, str2);
                    if (yz0VarA2 != null && yz0VarA2.a(ac1Var, tb1Var2)) {
                        wd1 wd1VarA = this.f8512a.a(aVarA, yd1.E);
                        c5.a aVar = wd1VarA.f10168c;
                        List list2 = wd1VarA.f10169d;
                        c5.a aVar2 = wd1VarA.f10170e;
                        ae1 ae1Var = wd1VarA.f10171f;
                        aVarA = new wd1(ae1Var, wd1VarA.f10166a, "render-config-" + i7 + "-" + str2, aVar, list2, bs1.k(aVar2, Throwable.class, new pr1() { // from class: com.google.android.gms.internal.ads.q21
                            @Override // com.google.android.gms.internal.ads.pr1
                            public final c5.a zza(Object obj2) {
                                r21 r21Var = this.f8210a;
                                de1 de1VarE = d0.e(r21Var.f8520j, 12);
                                tb1 tb1Var3 = tb1Var2;
                                de1VarE.f(tb1Var3.E);
                                de1VarE.zzi();
                                yz0 yz0Var = yz0VarA2;
                                ac1 ac1Var2 = ac1Var;
                                c5.a aVarQ = bs1.q(yz0Var.b(ac1Var2, tb1Var3), tb1Var3.R, TimeUnit.MILLISECONDS, r21Var.f8517f);
                                r21Var.h.a(ac1Var2, tb1Var3, aVarQ, r21Var.f8514c);
                                ge1.c(aVarQ, r21Var.f8521k, de1VarE, false);
                                return aVarQ;
                            }
                        }, ae1Var.f2731a)).a();
                        break;
                    }
                }
                i7++;
            }
            n21 n21Var2 = this.h;
            Objects.requireNonNull(n21Var2);
            aVarA.addListener(new cf(8, n21Var2), this.f8516e);
        }
        return aVarA;
    }
}

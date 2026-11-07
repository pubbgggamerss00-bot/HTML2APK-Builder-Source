package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tg2 implements zh2 {

    /* renamed from: a, reason: collision with root package name */
    public final a1 f9278a;

    /* renamed from: b, reason: collision with root package name */
    public x0 f9279b;

    /* renamed from: c, reason: collision with root package name */
    public p0 f9280c;

    public tg2(a1 a1Var) {
        this.f9278a = a1Var;
    }

    public final long a() {
        p0 p0Var = this.f9280c;
        if (p0Var != null) {
            return p0Var.f7908d;
        }
        return -1L;
    }

    public final void b(lo1 lo1Var, Uri uri, Map map, long j6, long j7, ei2 ei2Var) throws vi2 {
        p0 p0Var = new p0(lo1Var, j6, j7);
        this.f9280c = p0Var;
        if (this.f9279b != null) {
            return;
        }
        x0[] x0VarArrD = this.f9278a.d(uri, map);
        int length = x0VarArrD.length;
        zn1 zn1Var = bo1.f3236t;
        en1.a(length, "expectedSize");
        yn1 yn1Var = new yn1(length);
        boolean z6 = true;
        if (length == 1) {
            this.f9279b = x0VarArrD[0];
        } else {
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                x0 x0Var = x0VarArrD[i6];
                try {
                } catch (EOFException unused) {
                    if (this.f9279b != null || p0Var.f7908d == j6) {
                    }
                } catch (Throwable th) {
                    if (this.f9279b == null && p0Var.f7908d != j6) {
                        z6 = false;
                    }
                    y5.r(z6);
                    p0Var.f7910f = 0;
                    throw th;
                }
                if (x0Var.d(p0Var)) {
                    this.f9279b = x0Var;
                    p0Var.f7910f = 0;
                    break;
                } else {
                    yn1Var.r(x0Var.zzd());
                    boolean z7 = this.f9279b != null || p0Var.f7908d == j6;
                    y5.r(z7);
                    p0Var.f7910f = 0;
                    i6++;
                }
            }
            if (this.f9279b == null) {
                Iterator it = ed0.n(bo1.m(x0VarArrD), new kt(3)).iterator();
                StringBuilder sb = new StringBuilder();
                ih1.l(sb, it, ", ");
                String strB = androidx.camera.camera2.internal.v0.b("None of the available extractors (", sb.toString(), ") could read the stream.");
                cp1 cp1VarT = yn1Var.t();
                vi2 vi2Var = new vi2(strB, null, false, 1);
                bo1.l(cp1VarT);
                throw vi2Var;
            }
        }
        this.f9279b.f(ei2Var);
    }
}

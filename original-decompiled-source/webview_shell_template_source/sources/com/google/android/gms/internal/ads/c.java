package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3336a;

    /* renamed from: b, reason: collision with root package name */
    public final i f3337b;

    /* renamed from: c, reason: collision with root package name */
    public w f3338c;

    /* renamed from: d, reason: collision with root package name */
    public long f3339d;

    /* renamed from: e, reason: collision with root package name */
    public long f3340e;

    /* renamed from: f, reason: collision with root package name */
    public long f3341f;

    /* renamed from: g, reason: collision with root package name */
    public long f3342g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3343i;

    /* renamed from: j, reason: collision with root package name */
    public long f3344j;

    /* renamed from: k, reason: collision with root package name */
    public z f3345k;

    /* renamed from: l, reason: collision with root package name */
    public Executor f3346l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f3347m;

    public c(g gVar, Context context) {
        this.f3347m = gVar;
        j31.d(context);
        this.f3336a = new ArrayList();
        this.f3337b = new i();
        this.f3342g = -9223372036854775807L;
        this.f3345k = z.f11121g;
        this.f3346l = g.f4833o;
    }

    public final void a() {
        if (this.f3338c == null) {
            return;
        }
        new ArrayList(this.f3336a);
        w wVar = this.f3338c;
        wVar.getClass();
        tk2 tk2Var = new tk2(wVar);
        mb2 mb2Var = wVar.A;
        if (mb2Var == null || !mb2Var.d()) {
            mb2Var = mb2.h;
        }
        tk2Var.f9343z = mb2Var;
        new w(tk2Var);
        y5.k(null);
        throw null;
    }

    public final void b(boolean z6) {
        this.h = false;
        this.f3342g = -9223372036854775807L;
        g gVar = this.f3347m;
        if (gVar.f4846n == 1) {
            gVar.f4845m++;
            yw ywVar = gVar.f4840g;
            if (z6) {
                j jVar = (j) ywVar.f11094t;
                n nVar = jVar.f5882b;
                nVar.f7269m = 0L;
                nVar.f7272p = -1L;
                nVar.f7270n = -1L;
                jVar.f5887g = -9223372036854775807L;
                jVar.f5885e = -9223372036854775807L;
                jVar.f(1);
                jVar.h = -9223372036854775807L;
            }
            o oVar = (o) ywVar.f11095u;
            t01 t01Var = oVar.f7542c;
            pt0 pt0Var = oVar.f7544e;
            pt0Var.f8145a = 0;
            pt0Var.f8146b = 0;
            oVar.f7547i = -9223372036854775807L;
            t01 t01Var2 = oVar.f7543d;
            if (t01Var2.a() > 0) {
                y5.n(t01Var2.a() > 0);
                while (t01Var2.a() > 1) {
                    t01Var2.b();
                }
                Object objB = t01Var2.b();
                objB.getClass();
                t01Var2.d(0L, (Long) objB);
            }
            if (oVar.f7545f != null) {
                t01Var.e();
            } else if (t01Var.a() > 0) {
                y5.n(t01Var.a() > 0);
                while (t01Var.a() > 1) {
                    t01Var.b();
                }
                Object objB2 = t01Var.b();
                objB2.getClass();
                oVar.f7545f = (n90) objB2;
            }
            xo0 xo0Var = gVar.f4843k;
            y5.k(xo0Var);
            xo0Var.e(new t(17, gVar));
        }
        this.f3344j = -9223372036854775807L;
    }

    public final void c(w wVar) throws a0 {
        g gVar = this.f3347m;
        y5.r(gVar.f4846n == 0);
        mb2 mb2Var = wVar.A;
        if (mb2Var == null || !mb2Var.d()) {
            mb2Var = mb2.h;
        }
        mb2 mb2Var2 = (mb2Var.f7077c != 7 || j31.f5914a >= 34) ? mb2Var : new mb2(mb2Var.f7075a, mb2Var.f7076b, 6, mb2Var.f7079e, mb2Var.f7080f, mb2Var.f7078d);
        el0 el0Var = gVar.h;
        Looper looperMyLooper = Looper.myLooper();
        y5.k(looperMyLooper);
        c01 c01VarA = el0Var.a(looperMyLooper, null);
        gVar.f4843k = c01VarA;
        try {
            gVar.f4838e.a(gVar.f4834a, mb2Var2, gVar, new gb(2, c01VarA), cp1.f3636w);
            Pair pair = gVar.f4844l;
            if (pair == null) {
                throw null;
            }
            ((sx0) pair.second).getClass();
            throw null;
        } catch (r60 e6) {
            throw new a0(e6, wVar);
        }
    }

    public final void d(boolean z6) {
        j jVar = (j) this.f3347m.f4840g.f11094t;
        jVar.f5888i = z6;
        jVar.h = -9223372036854775807L;
    }

    public final void e(int i6) {
        n nVar = ((j) this.f3347m.f4840g.f11094t).f5882b;
        if (nVar.f7266j == i6) {
            return;
        }
        nVar.f7266j = i6;
        nVar.d(true);
    }

    public final void f(Surface surface, sx0 sx0Var) {
        g gVar = this.f3347m;
        Pair pair = gVar.f4844l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((sx0) gVar.f4844l.second).equals(sx0Var)) {
            return;
        }
        gVar.f4844l = Pair.create(surface, sx0Var);
        sx0Var.getClass();
    }

    public final void g(float f6) {
        ((j) this.f3347m.f4840g.f11094t).d(f6);
    }

    public final void h(long j6, long j7, long j8, long j9) {
        this.f3339d = j6;
        this.f3340e = j8;
        this.f3341f = j9;
    }

    public final void i(List list) {
        ArrayList arrayList = this.f3336a;
        if (arrayList.equals(list)) {
            return;
        }
        arrayList.clear();
        arrayList.addAll(list);
        arrayList.addAll(this.f3347m.f4839f);
        a();
    }

    @Override // com.google.android.gms.internal.ads.d
    public final void j() {
        this.f3346l.execute(new yh(this, this.f3345k));
    }

    @Override // com.google.android.gms.internal.ads.d
    public final void k(n90 n90Var) {
        this.f3346l.execute(new x(this, this.f3345k, n90Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r8 >= r4) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(long j6, boolean z6, long j7, long j8, bl2 bl2Var) throws a0 {
        g gVar = this.f3347m;
        y5.r(false);
        long j9 = j6 - this.f3340e;
        try {
            if (gVar.f4836c.a(j9, j7, j8, this.f3339d, z6, this.f3337b) != 4) {
                if (j9 < this.f3341f && !z6) {
                    bl2Var.f3221c.k0(bl2Var.f3219a, bl2Var.f3220b);
                    return true;
                }
                g.a(gVar, j7, j8);
                if (this.f3343i) {
                    long j10 = this.f3344j;
                    if (j10 != -9223372036854775807L) {
                        if (gVar.f4845m == 0) {
                            long j11 = gVar.f4837d.f7547i;
                            if (j11 != -9223372036854775807L) {
                            }
                        }
                    }
                    a();
                    this.f3343i = false;
                    this.f3344j = -9223372036854775807L;
                }
                y5.k(null);
                throw null;
            }
            return false;
        } catch (wa2 e6) {
            w wVar = this.f3338c;
            y5.k(wVar);
            throw new a0(e6, wVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.d
    public final void zzz() {
        this.f3346l.execute(new b(this, this.f3345k));
    }
}

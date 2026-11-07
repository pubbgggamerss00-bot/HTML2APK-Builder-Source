package k0;

import android.graphics.Rect;
import i0.g3;
import i0.h3;
import i0.i2;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import k0.m1;

/* loaded from: classes.dex */
public final class c extends m1 {

    /* renamed from: b, reason: collision with root package name */
    public ph.s1 f15816b;

    /* renamed from: c, reason: collision with root package name */
    public p1 f15817c;

    /* renamed from: d, reason: collision with root package name */
    public sh.o0 f15818d;

    @Override // y2.x
    public final void a() {
        m1.a aVar = this.f15873a;
        if (aVar == null) {
            return;
        }
        this.f15816b = aVar.J0(new b(null, this, aVar, null));
    }

    @Override // y2.x
    public final void c() {
        ph.s1 s1Var = this.f15816b;
        if (s1Var != null) {
            s1Var.cancel((CancellationException) null);
        }
        this.f15816b = null;
        sh.i0<pg.f0> i0VarK = k();
        if (i0VarK != null) {
            sh.o0 o0Var = (sh.o0) i0VarK;
            synchronized (o0Var) {
                o0Var.v(o0Var.p() + o0Var.f25047l, o0Var.f25046k, o0Var.p() + o0Var.f25047l, o0Var.p() + o0Var.f25047l + o0Var.f25048m);
                pg.f0 f0Var = pg.f0.f21461a;
            }
        }
    }

    @Override // y2.x
    public final void d(y2.c0 c0Var, y2.v vVar, t2.h0 h0Var, h3 h3Var, p1.e eVar, p1.e eVar2) {
        p1 p1Var = this.f15817c;
        if (p1Var != null) {
            l1 l1Var = p1Var.f15898m;
            synchronized (l1Var.f15858c) {
                try {
                    l1Var.f15865j = c0Var;
                    l1Var.f15867l = vVar;
                    l1Var.f15866k = h0Var;
                    l1Var.f15868m = eVar;
                    l1Var.f15869n = eVar2;
                    if (l1Var.f15860e || l1Var.f15859d) {
                        l1Var.a();
                    }
                    pg.f0 f0Var = pg.f0.f21461a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // y2.x
    public final void e(y2.c0 c0Var, y2.o oVar, g3 g3Var, i2.a aVar) {
        a aVar2 = new a(c0Var, this, oVar, g3Var, aVar);
        m1.a aVar3 = this.f15873a;
        if (aVar3 == null) {
            return;
        }
        this.f15816b = aVar3.J0(new b(aVar2, this, aVar3, null));
    }

    @Override // y2.x
    public final void g(y2.c0 c0Var, y2.c0 c0Var2) {
        p1 p1Var = this.f15817c;
        if (p1Var != null) {
            boolean z10 = (t2.j0.a(p1Var.f15893h.f33683b, c0Var2.f33683b) && kotlin.jvm.internal.r.a(p1Var.f15893h.f33684c, c0Var2.f33684c)) ? false : true;
            p1Var.f15893h = c0Var2;
            int size = p1Var.f15895j.size();
            for (int i10 = 0; i10 < size; i10++) {
                s1 s1Var = (s1) ((WeakReference) p1Var.f15895j.get(i10)).get();
                if (s1Var != null) {
                    s1Var.f15908g = c0Var2;
                }
            }
            l1 l1Var = p1Var.f15898m;
            synchronized (l1Var.f15858c) {
                l1Var.f15865j = null;
                l1Var.f15867l = null;
                l1Var.f15866k = null;
                l1Var.f15868m = null;
                l1Var.f15869n = null;
                pg.f0 f0Var = pg.f0.f21461a;
            }
            if (kotlin.jvm.internal.r.a(c0Var, c0Var2)) {
                if (z10) {
                    h1 h1Var = p1Var.f15887b;
                    int iE = t2.j0.e(c0Var2.f33683b);
                    int iD = t2.j0.d(c0Var2.f33683b);
                    t2.j0 j0Var = p1Var.f15893h.f33684c;
                    int iE2 = j0Var != null ? t2.j0.e(j0Var.f27839a) : -1;
                    t2.j0 j0Var2 = p1Var.f15893h.f33684c;
                    h1Var.b(iE, iD, iE2, j0Var2 != null ? t2.j0.d(j0Var2.f27839a) : -1);
                    return;
                }
                return;
            }
            if (c0Var != null && (!kotlin.jvm.internal.r.a(c0Var.f33682a.f27761b, c0Var2.f33682a.f27761b) || (t2.j0.a(c0Var.f33683b, c0Var2.f33683b) && !kotlin.jvm.internal.r.a(c0Var.f33684c, c0Var2.f33684c)))) {
                h1 h1Var2 = p1Var.f15887b;
                h1Var2.a().restartInput(h1Var2.f15846a);
                return;
            }
            int size2 = p1Var.f15895j.size();
            for (int i11 = 0; i11 < size2; i11++) {
                s1 s1Var2 = (s1) ((WeakReference) p1Var.f15895j.get(i11)).get();
                if (s1Var2 != null) {
                    y2.c0 c0Var3 = p1Var.f15893h;
                    h1 h1Var3 = p1Var.f15887b;
                    if (s1Var2.f15912k) {
                        s1Var2.f15908g = c0Var3;
                        if (s1Var2.f15910i) {
                            h1Var3.a().updateExtractedText(h1Var3.f15846a, s1Var2.f15909h, e6.c.a(c0Var3));
                        }
                        t2.j0 j0Var3 = c0Var3.f33684c;
                        long j10 = c0Var3.f33683b;
                        int iE3 = j0Var3 != null ? t2.j0.e(j0Var3.f27839a) : -1;
                        t2.j0 j0Var4 = c0Var3.f33684c;
                        h1Var3.b(t2.j0.e(j10), t2.j0.d(j10), iE3, j0Var4 != null ? t2.j0.d(j0Var4.f27839a) : -1);
                    }
                }
            }
        }
    }

    @Override // y2.x
    public final void h(p1.e eVar) {
        Rect rect;
        p1 p1Var = this.f15817c;
        if (p1Var != null) {
            p1Var.f15897l = new Rect(gh.a.b(eVar.f21131a), gh.a.b(eVar.f21132b), gh.a.b(eVar.f21133c), gh.a.b(eVar.f21134d));
            if (!p1Var.f15895j.isEmpty() || (rect = p1Var.f15897l) == null) {
                return;
            }
            p1Var.f15886a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // k0.m1
    public final void i() {
        sh.i0<pg.f0> i0VarK = k();
        if (i0VarK != null) {
            ((sh.o0) i0VarK).r(pg.f0.f21461a);
        }
    }

    public final sh.i0<pg.f0> k() {
        sh.o0 o0Var = this.f15818d;
        if (o0Var != null) {
            return o0Var;
        }
        if (!j0.b.f14595a) {
            return null;
        }
        sh.o0 o0VarB = sh.q0.b(0, 2, rh.a.f23578c);
        this.f15818d = o0VarB;
        return o0VarB;
    }
}

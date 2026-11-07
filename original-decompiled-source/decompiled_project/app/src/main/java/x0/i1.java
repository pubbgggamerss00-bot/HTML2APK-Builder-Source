package x0;

import p.h0;

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final a3 f31711a;

    public i1(a3 a3Var) {
        this.f31711a = a3Var;
    }

    public static final void a(d3 d3Var, int i10) {
        while (d3Var.f31653v >= 0 && d3Var.f31652u <= i10) {
            d3Var.L();
            d3Var.i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p.l0 b(d dVar, p.q0 q0Var) {
        a3 a3Var;
        int i10;
        Object[] objArr = q0Var.f20706a;
        int i11 = q0Var.f20707b;
        int i12 = 0;
        while (true) {
            a3Var = this.f31711a;
            if (i12 >= i11) {
                break;
            }
            if (a3Var.i(((j1) objArr[i12]).f31722e)) {
                i12++;
            } else {
                p.h0 h0Var = new p.h0((Object) null);
                Object[] objArr2 = q0Var.f20706a;
                int i13 = q0Var.f20707b;
                for (int i14 = 0; i14 < i13; i14++) {
                    Object obj = objArr2[i14];
                    if (a3Var.i(((j1) obj).f31722e)) {
                        h0Var.g(obj);
                    }
                }
                q0Var = h0Var;
            }
        }
        h1 h1Var = new h1(this);
        int i15 = 1;
        if (q0Var.f20707b > 1) {
            Comparable comparable = (Comparable) h1Var.invoke(q0Var.b(0));
            int i16 = q0Var.f20707b;
            int i17 = 1;
            while (true) {
                if (i17 >= i16) {
                    break;
                }
                Comparable comparable2 = (Comparable) h1Var.invoke(q0Var.b(i17));
                if (comparable.compareTo(comparable2) > 0) {
                    p.h0 h0Var2 = new p.h0(q0Var.f20707b);
                    Object[] objArr3 = q0Var.f20706a;
                    int i18 = q0Var.f20707b;
                    for (int i19 = 0; i19 < i18; i19++) {
                        h0Var2.g(objArr3[i19]);
                    }
                    h0.b bVar = h0Var2.f20636c;
                    if (bVar == null) {
                        bVar = new h0.b(h0Var2);
                        h0Var2.f20636c = bVar;
                    }
                    if (bVar.f20639a.f20707b > 1) {
                        qg.t.v(bVar, new d0.w(h1Var, i15));
                    }
                    q0Var = h0Var2;
                } else {
                    i17++;
                    comparable = comparable2;
                }
            }
        }
        if (q0Var.d()) {
            p.l0 l0Var = p.w0.f20749b;
            kotlin.jvm.internal.r.c(l0Var, "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
            return l0Var;
        }
        p.l0 l0VarB = p.w0.b();
        d3 d3VarG = a3Var.g();
        try {
            Object[] objArr4 = q0Var.f20706a;
            int i20 = q0Var.f20707b;
            for (int i21 = 0; i21 < i20; i21++) {
                j1 j1Var = (j1) objArr4[i21];
                int iC = d3VarG.c(j1Var.f31722e);
                int iE = d3VarG.E(d3VarG.f31633b, iC);
                a(d3VarG, iE);
                a(d3VarG, iE);
                while (true) {
                    i10 = d3VarG.f31651t;
                    if (i10 == iE || i10 == d3VarG.f31652u) {
                        break;
                    }
                    if (iE < d3VarG.s(i10) + i10) {
                        d3VarG.P();
                    } else {
                        d3VarG.K();
                    }
                }
                if (i10 != iE) {
                    q.c("Unexpected slot table structure");
                }
                d3VarG.P();
                d3VarG.a(iC - d3VarG.f31651t);
                l0VarB.l(j1Var, q.f(j1Var.f31720c, j1Var, d3VarG, dVar));
            }
            a(d3VarG, Integer.MAX_VALUE);
            pg.f0 f0Var = pg.f0.f21461a;
            d3VarG.e(true);
            return l0VarB;
        } catch (Throwable th2) {
            d3VarG.e(false);
            throw th2;
        }
    }
}

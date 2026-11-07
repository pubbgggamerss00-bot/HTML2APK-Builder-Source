package uh;

import ph.f1;
import ph.p2;
import ph.s1;
import ph.v0;
import ph.w2;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final v f29737a = new v("UNDEFINED");

    /* renamed from: b, reason: collision with root package name */
    public static final v f29738b = new v("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:32:0x008c A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #1 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008f, B:23:0x006b, B:25:0x0079, B:30:0x0086, B:32:0x008c, B:38:0x009c, B:41:0x00a5, B:40:0x00a2, B:28:0x007f), top: B:52:0x0049, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Object obj, tg.e eVar) {
        s1 s1Var;
        if (!(eVar instanceof f)) {
            eVar.resumeWith(obj);
            return;
        }
        f fVar = (f) eVar;
        ph.g0 g0Var = fVar.f29733d;
        vg.c cVar = fVar.f29734e;
        Throwable thA = pg.p.a(obj);
        Object yVar = thA == null ? obj : new ph.y(false, thA);
        if (c(g0Var, cVar.getContext())) {
            fVar.f29735f = yVar;
            fVar.f21605c = 1;
            b(g0Var, cVar.getContext(), fVar);
            return;
        }
        f1 f1VarA = p2.a();
        if (f1VarA.f21530c >= 4294967296L) {
            fVar.f29735f = yVar;
            fVar.f21605c = 1;
            f1VarA.I0(fVar);
            return;
        }
        f1VarA.J0(true);
        try {
            s1Var = (s1) cVar.getContext().get(s1.a.f21589a);
        } finally {
            try {
            } finally {
            }
        }
        if (s1Var == null || s1Var.isActive()) {
            Object obj2 = fVar.f29736g;
            tg.h context = cVar.getContext();
            Object objC = b0.c(context, obj2);
            w2<?> w2VarC = objC != b0.f29719a ? ph.e0.c(cVar, context, objC) : null;
            try {
                cVar.resumeWith(obj);
                pg.f0 f0Var = pg.f0.f21461a;
            } finally {
                if (w2VarC == null || w2VarC.h0()) {
                    b0.a(context, objC);
                }
            }
        }
        fVar.resumeWith(pg.q.a(s1Var.getCancellationException()));
        while (f1VarA.L0()) {
        }
    }

    public static final void b(ph.g0 g0Var, tg.h hVar, Runnable runnable) {
        try {
            g0Var.D0(hVar, runnable);
        } catch (Throwable th2) {
            throw new v0(th2, g0Var, hVar);
        }
    }

    public static final boolean c(ph.g0 g0Var, tg.h hVar) throws v0 {
        try {
            return g0Var.F0(hVar);
        } catch (Throwable th2) {
            throw new v0(th2, g0Var, hVar);
        }
    }
}

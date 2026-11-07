package ph;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public final class u2 {
    public static final <U, T extends U> Object a(s2<U, ? super T> s2Var, eh.p<? super i0, ? super tg.e<? super T>, ? extends Object> pVar) throws Throwable {
        Object yVar;
        Object objJ;
        v1.g(s2Var, new d1(t0.c(s2Var.f29766d.getContext()).z(s2Var.f21590e, s2Var, s2Var.f21494c)));
        try {
            if (pVar instanceof vg.a) {
                kotlin.jvm.internal.m0.b(2, pVar);
                yVar = pVar.invoke(s2Var, s2Var);
            } else {
                yVar = ah.p.f(pVar, s2Var, s2Var);
            }
        } catch (Throwable th2) {
            yVar = new y(false, th2);
        }
        ug.a aVar = ug.a.f29706a;
        if (yVar == aVar || (objJ = s2Var.J(yVar)) == b2.f21499b) {
            return aVar;
        }
        if (objJ instanceof y) {
            Throwable th3 = ((y) objJ).f21609a;
            if (!(th3 instanceof r2) || ((r2) th3).f21585a != s2Var) {
                throw th3;
            }
            if (yVar instanceof y) {
                throw ((y) yVar).f21609a;
            }
        } else {
            yVar = b2.a(objJ);
        }
        return yVar;
    }

    public static final Object b(long j10, eh.p pVar, vg.c cVar) {
        if (j10 <= 0) {
            throw new r2("Timed out immediately", null);
        }
        Object objA = a(new s2(j10, cVar), pVar);
        ug.a aVar = ug.a.f29706a;
        return objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, ph.s2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(long j10, eh.p pVar, vg.c cVar) throws Throwable {
        t2 t2Var;
        kotlin.jvm.internal.g0 g0Var;
        if (cVar instanceof t2) {
            t2Var = (t2) cVar;
            int i10 = t2Var.f21594c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                t2Var.f21594c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                t2Var = new t2(cVar);
            }
        }
        Object obj = t2Var.f21593b;
        ug.a aVar = ug.a.f29706a;
        int i11 = t2Var.f21594c;
        if (i11 == 0) {
            pg.q.b(obj);
            if (j10 <= 0) {
                return null;
            }
            kotlin.jvm.internal.g0 g0Var2 = new kotlin.jvm.internal.g0();
            try {
                t2Var.f21592a = g0Var2;
                t2Var.f21594c = 1;
                ?? s2Var = new s2(j10, t2Var);
                g0Var2.f16327a = s2Var;
                Object objA = a(s2Var, pVar);
                return objA == aVar ? aVar : objA;
            } catch (r2 e10) {
                e = e10;
                g0Var = g0Var2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g0Var = t2Var.f21592a;
            try {
                pg.q.b(obj);
                return obj;
            } catch (r2 e11) {
                e = e11;
            }
        }
        if (e.f21585a == g0Var.f16327a) {
            return null;
        }
        throw e;
    }
}

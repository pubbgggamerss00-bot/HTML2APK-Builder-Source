package x0;

import java.util.Arrays;
import x0.j;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f31834a = new l0();

    public static final void a(Object obj, eh.l lVar, j jVar) {
        boolean zK = jVar.K(obj);
        Object objG = jVar.g();
        if (zK || objG == j.a.f31715a) {
            objG = new j0(lVar);
            jVar.C(objG);
        }
    }

    public static final void b(Object obj, Object obj2, eh.l lVar, j jVar) {
        boolean zK = jVar.K(obj) | jVar.K(obj2);
        Object objG = jVar.g();
        if (zK || objG == j.a.f31715a) {
            objG = new j0(lVar);
            jVar.C(objG);
        }
    }

    public static final void c(Object[] objArr, eh.l lVar, j jVar) {
        boolean zK = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zK |= jVar.K(obj);
        }
        Object objG = jVar.g();
        if (zK || objG == j.a.f31715a) {
            jVar.C(new j0(lVar));
        }
    }

    public static final void d(eh.p pVar, Object obj, j jVar) {
        tg.h hVarX = jVar.x();
        boolean zK = jVar.K(obj);
        Object objG = jVar.g();
        if (zK || objG == j.a.f31715a) {
            objG = new a1(hVarX, pVar);
            jVar.C(objG);
        }
    }

    public static final void e(Object obj, Object obj2, eh.p pVar, j jVar) {
        tg.h hVarX = jVar.x();
        boolean zK = jVar.K(obj) | jVar.K(obj2);
        Object objG = jVar.g();
        if (zK || objG == j.a.f31715a) {
            objG = new a1(hVarX, pVar);
            jVar.C(objG);
        }
    }

    public static final void f(String str, String str2, Object obj, eh.p pVar, j jVar) {
        tg.h hVarX = jVar.x();
        boolean zK = jVar.K(str) | jVar.K(str2) | jVar.K(obj);
        Object objG = jVar.g();
        if (zK || objG == j.a.f31715a) {
            objG = new a1(hVarX, pVar);
            jVar.C(objG);
        }
    }

    public static final void g(Object[] objArr, eh.p pVar, j jVar) {
        tg.h hVarX = jVar.x();
        boolean zK = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zK |= jVar.K(obj);
        }
        Object objG = jVar.g();
        if (zK || objG == j.a.f31715a) {
            jVar.C(new a1(hVarX, pVar));
        }
    }

    public static final ph.i0 h(j jVar) {
        return new w2(jVar.x());
    }
}

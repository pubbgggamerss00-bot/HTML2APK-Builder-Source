package y5;

import com.google.android.gms.internal.ads.yy1;
import g5.e;
import java.io.Serializable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b6.v f15369a;

    /* renamed from: b, reason: collision with root package name */
    public static final b6.v f15370b;

    static {
        int i6 = 0;
        f15369a = new b6.v(i6, "REMOVED_TASK");
        f15370b = new b6.v(i6, "CLOSED_EMPTY");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, g5.f, g5.g, java.lang.Object] */
    public static e0 a(b6.d dVar, p5.p pVar) {
        g5.f fVarE;
        g5.f fVar = dVar.s;
        Boolean bool = Boolean.FALSE;
        r rVar = r.s;
        boolean zBooleanValue = ((Boolean) fVar.s(bool, rVar)).booleanValue();
        ?? r32 = g5.g.s;
        r32.s(bool, rVar);
        boolean zBooleanValue2 = bool.booleanValue();
        if (zBooleanValue || zBooleanValue2) {
            kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
            pVar2.s = r32;
            g5.f fVar2 = (g5.f) fVar.s(r32, new q(pVar2));
            if (zBooleanValue2) {
                pVar2.s = ((g5.f) pVar2.s).s(r32, p.s);
            }
            fVarE = fVar2.e((g5.f) pVar2.s);
        } else {
            fVarE = fVar.e(r32);
        }
        c6.c cVar = i0.f15349a;
        if (fVarE != cVar && fVarE.t(e.a.s) == null) {
            fVarE = fVarE.e(cVar);
        }
        e0 e0Var = new e0(fVarE, true);
        int iOrdinal = z.s.ordinal();
        d5.j jVar = d5.j.f12745a;
        if (iOrdinal == 0) {
            try {
                b6.h.a(a1.a.f(((i5.a) pVar).a(e0Var, e0Var)), jVar);
                return e0Var;
            } finally {
                e0Var.g(d5.e.a(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                a1.a.f(((i5.a) pVar).a(e0Var, e0Var)).g(jVar);
            } else {
                if (iOrdinal != 3) {
                    throw new yy1();
                }
                try {
                    g5.f fVar3 = e0Var.f15319u;
                    Object objC = b6.x.c(fVar3, null);
                    try {
                        Serializable serializable = (i5.a) pVar;
                        if (((kotlin.jvm.internal.g) serializable).getArity() != 2) {
                            kotlin.jvm.internal.s.a(serializable, "kotlin.jvm.functions.Function2");
                            throw null;
                        }
                        Object objB = pVar.b(e0Var, e0Var);
                        if (objB != h5.a.s) {
                            e0Var.g(objB);
                            return e0Var;
                        }
                    } finally {
                        b6.x.a(fVar3, objC);
                    }
                } catch (Throwable th) {
                    return e0Var;
                }
            }
        }
        return e0Var;
    }
}

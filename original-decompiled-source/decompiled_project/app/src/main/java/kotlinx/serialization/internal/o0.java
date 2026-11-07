package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o0 {
    public static final x5.f a(androidx.room.g0 db2, String[] strArr, eh.l lVar) {
        kotlin.jvm.internal.r.e(db2, "db");
        androidx.room.m invalidationTracker = db2.getInvalidationTracker();
        String[] tables = (String[]) Arrays.copyOf(strArr, strArr.length);
        invalidationTracker.getClass();
        kotlin.jvm.internal.r.e(tables, "tables");
        androidx.room.a1 a1Var = invalidationTracker.f3016c;
        pg.n<String[], int[]> nVarG = a1Var.g(tables);
        String[] resolvedTableNames = nVarG.f21469a;
        int[] tableIds = nVarG.f21470b;
        kotlin.jvm.internal.r.e(resolvedTableNames, "resolvedTableNames");
        kotlin.jvm.internal.r.e(tableIds, "tableIds");
        sh.f m0Var = new sh.m0(new androidx.room.c1(a1Var, tableIds, resolvedTableNames, null));
        androidx.room.r rVar = invalidationTracker.f3022i;
        androidx.room.q qVar = rVar != null ? new androidx.room.q(rVar.f3062h, resolvedTableNames) : null;
        if (qVar != null) {
            m0Var = gg.a.h(m0Var, qVar);
        }
        return new x5.f(gg.a.b(m0Var, -1), db2, lVar);
    }

    public static final int b(bi.f fVar, bi.f[] typeParams) {
        kotlin.jvm.internal.r.e(typeParams, "typeParams");
        int iHashCode = (fVar.a().hashCode() * 31) + Arrays.hashCode(typeParams);
        int iE = fVar.e();
        int i10 = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iE > 0)) {
                break;
            }
            int i11 = iE - 1;
            int i12 = i10 * 31;
            String strA = fVar.h(fVar.e() - iE).a();
            if (strA != null) {
                iHashCode2 = strA.hashCode();
            }
            i10 = i12 + iHashCode2;
            iE = i11;
        }
        int iE2 = fVar.e();
        int iHashCode3 = 1;
        while (true) {
            if (!(iE2 > 0)) {
                return (((iHashCode * 31) + i10) * 31) + iHashCode3;
            }
            int i13 = iE2 - 1;
            int i14 = iHashCode3 * 31;
            bi.l kind = fVar.h(fVar.e() - iE2).getKind();
            iHashCode3 = i14 + (kind != null ? kind.hashCode() : 0);
            iE2 = i13;
        }
    }

    public static final String c(bi.f fVar) {
        return qg.x.I(jh.j.q(0, fVar.e()), ", ", fVar.a() + '(', ")", new i7.a(fVar, 1), 24);
    }
}
